package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_08 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 sSV1 = new ScoreServiceV1();
		
		sSV1.makeNums();
		sSV1.makeScore();
		sSV1.printScore();
		
		
	}

}
