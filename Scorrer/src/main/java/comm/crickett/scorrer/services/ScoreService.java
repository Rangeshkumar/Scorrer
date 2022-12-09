package comm.crickett.scorrer.services;

import java.util.List;

import comm.crickett.scorrer.entities.Score;

public interface ScoreService {
	
	public List<Score> getScore();
		
	public Score getScore(long scoreId);
	
	public Score addScore(Score score);

}
