package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		
		ssV2.makeScores();
		
	}
/*
 * 현재 ScoreVO 클래스에는 7개의 변수와 2개의 method가 설계되어 있는 상태
 * 이 클래스를 사용하여 만들어진 객체에는 7개의 변수와 2개의 method가 포함된
 * 상태로 완성된다.
 */
}
