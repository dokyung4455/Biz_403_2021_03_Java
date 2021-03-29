package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		int 홍길동_kor = 80;
		int 홍길동_eng = 100;
		int 홍길동_math = 90;
		
		int 이몽룡_kor = 99;
		int 이몽룡_eng = 80;
		int 이몽룡_math = 78;
				
		// ScoreVO 클래스에 디자인된 코드를 보면 변수들이 있고
		//gotTotal() , getAvg(), method가 있다.
		ScoreVO 홍길동 = new ScoreVO();
		홍길동.num = 1;
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 100;
		System.out.println("홍길동 총점 : " + 홍길동);
		System.out.println("홍길동 평균 : ");
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.num = 2;
		이몽룡.name = "이몽룡";
		이몽룡.kor = 99;
		이몽룡.eng = 80;
		이몽룡.math = 100;
		
		
	}

}
