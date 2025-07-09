package com.backlogbounty.backlog.repository;

import com.backlogbounty.backlog.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
