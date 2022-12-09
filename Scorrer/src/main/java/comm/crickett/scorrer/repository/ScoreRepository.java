package comm.crickett.scorrer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comm.crickett.scorrer.entities.Score;

public interface ScoreRepository extends JpaRepository<Score,Long> {
	
	
}
