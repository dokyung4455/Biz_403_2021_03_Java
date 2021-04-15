package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class StudentEx01 {
	
	public static void main(String[] args) {
		
		ScoreService ssV = new ScoreServiceImplV1();
		
		ssV.insertScore();
	}
	

}
