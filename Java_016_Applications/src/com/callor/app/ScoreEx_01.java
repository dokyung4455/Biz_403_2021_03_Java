package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		/*
		 * 아직 ScoreServiceImplV1 클래스의 method들은 코드가 구체적으로 구현되지 않았다.
		 * (method는 만들어져 있지만, 코드가 아직 미완성이다;
		 * 
		 * 이런상황에 다른 팀원이 ScoreServic
		 * 
		 * 1. method가 없어서 발생하는 뭄법 오류는 없고
		 */
		
		ScoreService sService = new ScoreServiceImplV2();
		
		sService.inputScore();
		sService.printScore();
		sService.saveScore();
		
		if(sService.checkScore() == 0) {
			// check Score() 가 0 을 return하면 수행할 코드
		}else {
			
			
		}
	}


}
