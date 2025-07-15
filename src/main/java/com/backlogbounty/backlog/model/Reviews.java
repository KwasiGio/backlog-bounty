package com.backlogbounty.backlog.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String text;
    private int rating;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public void setGame(Game game) {
        this.game = game;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
