package comm.crickett.scorrer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.crickett.scorrer.entities.Score;
import comm.crickett.scorrer.repository.ScoreRepository;
@Service
public  class ServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreRepository scoreDao;

	
	public List<Score> getScore() {
		
		return scoreDao.findAll();
	}
	
	public Score addScore (Score score) {
		
		scoreDao.save(score);
		return score;
	}
	
	public Score UpdateScore(Score score) {
		
		scoreDao.save(score);
		return score;
	}

	public Score getScore(long scoreId) {
		
		return null;
	}

	
}
