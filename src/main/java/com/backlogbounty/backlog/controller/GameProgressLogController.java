package com.backlogbounty.backlog.controller;
import com.backlogbounty.backlog.model.GameProgressLog;
import com.backlogbounty.backlog.model.Game;
import com.backlogbounty.backlog.repository.GameProgressLogRepository;
import com.backlogbounty.backlog.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/games/{gameId}/progress")
public class GameProgressLogController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameProgressLogRepository progressLogRepository;

    @GetMapping
    public List<GameProgressLog> getProgressLogs(@PathVariable Long gameId) { return progressLogRepository.findByGameIdOrderByTimestampDesc(gameId);}

    @PostMapping
    public ResponseEntity<GameProgressLog> addProgressLog(
            @PathVariable Long gameId,
            @RequestBody GameProgressLog logInput
    ){
        Game game = gameRepository.findById(gameId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not Found"));

        GameProgressLog log = new GameProgressLog();
        log.setDescription(logInput.getDescription());
        log.setTimestamp(LocalDateTime.now());
        log.setGame(game);


        GameProgressLog savedLog = progressLogRepository.save(log);

        return new ResponseEntity<>(savedLog, HttpStatus.CREATED);

    }
    @DeleteMapping("/{logId}")
    public ResponseEntity<Void> deleteProgressLog(@PathVariable Long logId){
        if (!progressLogRepository.existsById(logId)){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game progress log not found");
        }
    progressLogRepository.deleteById(logId);
    return ResponseEntity.noContent().build();
    }

    @PutMapping("/{logId}")
    public ResponseEntity<GameProgressLog> updateProgressLog(@PathVariable Long logId, @RequestBody GameProgressLog updateProgressLog){
        return progressLogRepository.findById(logId)
                .map(gameProgressLog -> {
                    gameProgressLog.setDescription(updateProgressLog.getDescription());
                    gameProgressLog.setTimestamp(updateProgressLog.getTimestamp());
                    return ResponseEntity.ok(progressLogRepository.save(gameProgressLog));
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Game progress log not found"));

    }
}