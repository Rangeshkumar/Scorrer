package comm.crickett.scorrer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import comm.crickett.scorrer.entities.Score;
import comm.crickett.scorrer.services.ScoreService;

@RestController
public class FrontController {
	
	@Autowired
	private ScoreService scoreService;
	
	@GetMapping("/Check")
	public String Cheeck() {
		return "First page";
	}
	
	@GetMapping("/score")
	public List<Score> getScore(){
		
		return this.scoreService.getScore(); 
	}
	@GetMapping("/score{scoreId}")
	public Score getScore(@PathVariable String scoreId) {
		
		return this.scoreService.getScore(Long.parseLong(scoreId));
	}
	
	@PostMapping("/score")
	public Score addScore(@RequestBody Score score) {
		
		return this.scoreService.addScore(score);
	}
}
