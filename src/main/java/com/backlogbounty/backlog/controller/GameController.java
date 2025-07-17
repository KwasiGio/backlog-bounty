package com.backlogbounty.backlog.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backlogbounty.backlog.model.Game;
import com.backlogbounty.backlog.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/games")

public class GameController {
    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById (@PathVariable Long id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not found"));
        return ResponseEntity.ok(game);
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game updateGame) {
        return gameRepository.findById(id)
                .map(game -> {
                    game.setTitle(updateGame.getTitle());
                    game.setGenre(updateGame.getGenre());
                    game.setPlatform(updateGame.getPlatform());
                    game.setStatus(updateGame.getStatus());
                    game.setNotes(updateGame.getNotes());
                    return ResponseEntity.ok(gameRepository.save(game));
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
        if (!gameRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not found");
        }
        gameRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }
}
