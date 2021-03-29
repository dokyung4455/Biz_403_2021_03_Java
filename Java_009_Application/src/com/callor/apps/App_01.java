package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_01 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1(10);
		
		// 객체.input() : 다른 클래스를 호출하여 사용하는 키워드
		// inpubScore() method는 private 로 선언 되어 있기 때문에
		// makeNums() 명령 한줄 실행하므로써 ScoreServiceV1 클래스에 정이되어있는 어떤 코드가 실행되는 효과가 있다.
		ssV1.makeNums();
		ssV1.makeScore();
	
	}

}
