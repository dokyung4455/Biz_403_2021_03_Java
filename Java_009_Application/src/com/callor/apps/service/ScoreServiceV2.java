package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	// this Keyword : 같은 클래스 내에 있는 코드
	public void makeScores() {
		/*
		 * method return type이 void가 아닌경우는 method가 return한 값을 변수에 저장할 수 있다.
		 * 이때 변수는 method의 return type과 같은 type이어야 한다.
		 */
		System.out.println("국어점수입력");
		Integer intKor = this.inputScores();
		System.out.println("영어점수입력");
		Integer intEng = this.inputScores();
		System.out.println("수학점수입력");
		Integer intMath = this.inputScores();
		
		System.out.println("========================");
		System.out.printf("국어점수 : %d\n",intKor);
		System.out.printf("영어점수 : %d\n",intEng);
		System.out.printf("수학점수 : %d\n",intMath);
		System.out.println("========================");
	}

	private Integer inputScores() {
		Integer score = 0;
		while (true) {
			System.out.println("점수를 입력하세요( 0 ~ 100 )");
			System.out.print(">> ");
			 score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100까지만 입력하세요...");
				System.out.print(">> ");
				continue;
			}
			break;
		}
		// score 변수에 저장된 값을 호출한 곳으로 되돌려 주어라.
		return score;
	}

}
