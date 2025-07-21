package com.backlogbounty.backlog.repository;

import com.backlogbounty.backlog.model.GameProgressLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameProgressLogRepository extends JpaRepository<GameProgressLog, Long>{
   List<GameProgressLog> findByGameId(long gameId);
   List<GameProgressLog> findByGameIdOrderByTimestampDesc(long gameId);
}
