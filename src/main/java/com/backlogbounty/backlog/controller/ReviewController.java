package com.backlogbounty.backlog.controller;

import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.backlogbounty.backlog.model.Game;
import com.backlogbounty.backlog.model.Reviews;
import com.backlogbounty.backlog.repository.GameRepository;
import com.backlogbounty.backlog.repository.ReviewsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewsRepository reviewsRepository;

    @Autowired
    private GameRepository gameRepository;

    // creates a review
    @PostMapping("/games/{gameId}/reviews")
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

    @PutMapping("/{reviewId}")
    public ResponseEntity<Reviews> updateReview(
            @PathVariable Long reviewId,
            @RequestBody Reviews updatedReviewData

    ) {
        Optional<Reviews> existingReview = reviewsRepository.findById(reviewId);
        if(existingReview.isPresent()) {
            Reviews review = existingReview.get();
            review.setText(updatedReviewData.getText());
            review.setRating(updatedReviewData.getRating());

            reviewsRepository.save(review);
            return ResponseEntity.ok(review);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{reviewId}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long reviewId) {
        if(!reviewsRepository.existsById(reviewId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Review not found");
        }
        reviewsRepository.deleteById(reviewId);
        return ResponseEntity.noContent().build();
    }
}
