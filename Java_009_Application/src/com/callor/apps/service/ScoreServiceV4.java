package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV4 {
	
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	Scanner scan;
	
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"};
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
	/*
	 * 현재는 학생수 만큼 모든 과목의 점수 입력을 끝내야만 다른 업무로 진행이 된다.
	 * 몇명의 학생, 일부과목 점수만 입력마치고 잠시 업무를 멈추고 싶을때 현재 코드로는 불가능하다.
	 * 일부만 입력하고 업무를 중단하는 기능을 넣자 v5에서
	 */
	public void makeScores() {
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d번 학생의 성적입력\n",i+1);
			intKor[i] = this.inputScore(subject[0]);
			intEng[i] = this.inputScore(subject[1]);
			intMath[i] = this.inputScore(subject[2]);
		}
		
	}
	private Integer inputScore(String sub) {
		Integer score = 0;
		while(true) {
			System.out.println(sub + "점수를 입력하세요");
			System.out.print(">> ");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println(sub + " 점수는 0 ~ 100까지 입력하세요.");
				// continue 명령을 사용하는 대신 else를 사용하여 코드를 작성
			}
			break;
		}
		return score;
	}
}
