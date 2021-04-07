package com.callor.method.service;

public class ScoreServiceV3 {
	
	InputServiceV2 isV2;

	public ScoreServiceV3() {
		// TODO Auto-generated constructor stub
		isV2 = new InputServiceV2();
	}
	
	public void inputScore() {
		Integer intKor = isV2.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = isV2.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = isV2.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		
		float avg = sum / 3.0f;
		
		
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("%d\t%d\t%d\t%d\t%3.2f\n",intKor,intEng,intMath,sum,avg);
		
	}

}
