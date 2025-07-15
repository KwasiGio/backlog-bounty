package com.backlogbounty.backlog.repository;

import com.backlogbounty.backlog.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    List<Reviews> findByGameId(Long gameId);
}
