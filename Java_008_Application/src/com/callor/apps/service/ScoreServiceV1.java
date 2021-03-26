package com.callor.apps.service;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int[] intSums;
	int yesNo;
	float floatAvgs;
	Scanner scr;

	public ScoreServiceV1(int or) {

		intKors = new int[5];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intSums = new int[intKors.length];
		floatAvgs = 0.0f;
		yesNo = 0;
		scr = new Scanner(System.in);
		

	}

	public void makeScore() {
		for (int j = 0; j < intKors.length; j++) {
			int num = j+1;
			System.out.println(LinesService.dLines(50));
			System.out.println(num + "번의 점수 입력을 시작합니다.");
			System.out.printf("%d번의 국어점수를 입력해주세요.\n", num);
			System.out.print("입력 : ");
			intKors[j] = scr.nextInt();
		
			System.out.printf("%d번의 영어점수를 입력해주세요.\n", num);
			System.out.print("입력 : ");
			intEngs[j] = scr.nextInt();
			
			
			System.out.printf("%d번의 수학점수를 입력해주세요.\n", num);
			System.out.print("입력 : ");
			intMaths[j] = scr.nextInt();

		}

	}

	public void TotalScore() {
		int i = 0;
		for (i = 0; i < intKors.length; i++) {
			intSums[i] = intKors[i];
			intSums[i] += intEngs[i];
			intSums[i] += intMaths[i];
		}
		
		System.out.println("...");
		System.out.println("학생별 성적표를 출력합니다.");
		for (int j = 0; j < intKors.length; j++) {
			floatAvgs = intSums[j] / 3.0f;
			System.out.printf("%d번 학생\t국어 : %d점\t영어 : %d점\t수학 : %d점\t총점 : %d점\t 평균 : %3.2f점\n"
								,j+1,intKors[j],intEngs[j],intMaths[j],intSums[j],floatAvgs);
		}
		

	}
	
		

}
