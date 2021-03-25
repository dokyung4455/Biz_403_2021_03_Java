package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		// public ScoreServiceV2( int member )
		
		// method의 괄호() 안에 선언된 변수
		// 매개변수, parameter 라고 한다.
		// 5는 ssV2 객체를 만들때 생성자에게 전달(보내는)값 이다
		// argument
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2(100);
		ssV2.makeNums();
		ssV2.makeScore();
		ssV2.printScore();
	}

}
