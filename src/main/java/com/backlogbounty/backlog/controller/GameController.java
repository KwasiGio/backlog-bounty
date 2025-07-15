package com.backlogbounty.backlog.controller;
import org.springframework.web.bind.annotation.*;
import com.backlogbounty.backlog.model.Game;
import com.backlogbounty.backlog.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

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

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

}
