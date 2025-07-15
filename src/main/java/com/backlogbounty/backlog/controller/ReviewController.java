package com.backlogbounty.backlog.controller;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import com.backlogbounty.backlog.model.Game;
import com.backlogbounty.backlog.model.Reviews;
import com.backlogbounty.backlog.repository.GameRepository;
import com.backlogbounty.backlog.repository.ReviewsRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/games/{gameId}/reviews")
public class ReviewController {
    @Autowired
    private ReviewsRepository reviewsRepository;

    @Autowired
    private GameRepository gameRepository;

    // creates a review
    @PostMapping
    public Reviews createReview(@PathVariable Long gameId, @RequestBody Reviews review) {
        Game game = gameRepository.findById(gameId)
                .orElseThrow(() -> new RuntimeException("Game is not found"));
        review.setGame(game);
        review.setCreatedAt(LocalDateTime.now());

        return reviewsRepository.save(review);
    }
    @GetMapping
    public List<Reviews> getReviews(@PathVariable Long gameId) {
        return reviewsRepository.findByGameId(gameId);
    }
}
