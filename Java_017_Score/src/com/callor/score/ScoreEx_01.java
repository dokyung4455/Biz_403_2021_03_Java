package com.callor.score;

import com.callor.score.service.ScoreServiceImplV1;
import com.callor.score.vo.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.println(scoreVO.toString());
		
		ssV1.selectMenu();
	}

}
