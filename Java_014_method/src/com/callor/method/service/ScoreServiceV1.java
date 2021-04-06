package com.callor.method.service;

public class ScoreServiceV1 {
InputServiceV1 isV1;

	public ScoreServiceV1() {
		// TODO Auto-generated constructor stub
		isV1 = new InputServiceV1();
	}
	public void inputScore() {
		Integer num = isV1.InputValue("국어", 0, 100);
		
		if(num == null) {
			System.out.println("종료");
			
		} else {
			System.out.print("점수 : " + num);
		}
		
		
		
	}

}
