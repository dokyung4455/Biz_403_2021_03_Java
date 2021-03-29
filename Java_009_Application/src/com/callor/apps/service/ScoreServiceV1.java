package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int[] intSums;
	float[] floatAvg;
	Scanner scr; // class 영역에 Scanner 클래스를 사용하여 scr 객체 선언
					// NullPointerException JDK 또는 여러가지 클래스를 가져와 사용하는경우 매우 자주만나는 Exception
					// 사용할 준비가 되어있지 않다 == 생성, 초기화가 안되었다 라는 뜻

	// Service클래스에서 배열의 개수를 고정하지말고 최초로 객체를 생성할때 필요한 개수를 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을 사용하여 배열을 만들자
	public ScoreServiceV1(int members) {
		intKors = new int[members];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intSums = new int[intKors.length];
		floatAvg = new float[intKors.length];
		scr = new Scanner(System.in); // scr 객체를 생성하기 객체를 선언하고 생성하는 코드가없으면
										// NullPointerException에러가 발생한다.
	}

	public void makeNums() {
		System.out.println("=================================");
		System.out.println("성적 계산하기");
		System.out.println("---------------------------------");
		for (int i = 0; i < intKors.length; i++) {
			System.out.printf("%d번 학생의 국어점수를 입력해주세요.(0 ~ 100)\n", i + 1);
			System.out.print(">>");
			intKors[i] = scr.nextInt();
			while (true) {
				if (intKors[i] < 0 || intKors[i] > 100) {
					System.out.println("[ERROR]0 ~ 100까지만 입력하세요!... 다시입력하세요.");
					System.out.print(">>");
					intKors[i] = scr.nextInt();
				} else {
					break;
				}
			}
			System.out.printf("%d번 학생의 영어점수를 입력해주세요.(0 ~ 100)\n", i + 1);
			System.out.print(">>");
			intEngs[i] = scr.nextInt();
			while (true) {
				if (intEngs[i] < 0 || intKors[i] > 100) {
					System.out.println("[ERROR]0 ~ 100까지만 입력하세요!... 다시입력하세요.");
					System.out.print(">>");
					intEngs[i] = scr.nextInt();
				} else {
					break;
				}
			}
			System.out.printf("%d번 학생의 수학점수를 입력해주세요.(0 ~ 100)\n", i + 1);
			System.out.print(">>");
			intMaths[i] = scr.nextInt();
			while (true) {
				if (intMaths[i] < 0 || intKors[i] > 100) {
					System.out.println("[ERROR]0 ~ 100까지만 입력하세요!... 다시입력하세요.");
					System.out.print(">>");
					intMaths[i] = scr.nextInt();
				} else {
					break;
				}
			}
			System.out.println("---------------------------------");
			System.out.printf("%d번 학생 입력 완료\n", i + 1);
			System.out.println("-------------------------------------------");
		}
		// return
		// 현재 method가 끝났다 라는 선언문
	}

	// public : 전체, 공용 등 누구나 객체.addNum()형식으로 method를 호출하여 명령을 실행할 수 있도록 하는 Keyword
	// private : 개인적인, 현재 클래스에서만 method를 호출하여 명령을 실행할 수 있도록 하는 Keyword
	// 객체.input() 형식으로 사용 불가
	// 외부에 공개하지 않고, 현재 클래스의 코드에서만 호출할 수 있도록 제한하는 Keyword
	// void Keyword 대신 정수를 선언하는 키워드를 사용하여 method 선언하기
	// method 코드 끝에 반드시 return 명령문이 있어야 한다.
	
	// 여기에서 사용된 Integer은 변수를 선언하는게 아니라 return type 키우드
	// method의 코드내에 "return 값" 형식의 코드가 반드시 있어야 함을 선언하는것
	
	// ruturn type이 
	private Integer inputScore() {
		return null;
	}
	public String names() {
		return "홍길동";
	}
	public int add() {
		return 0;
	}
	public float addFloaat() {
		return 0.0f;
	}
	public boolean yesNo() {
		return true;
	}

	public void makeScore() {
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		for (int j = 0; j < intKors.length; j++) {
			for (int i = 0; i < intKors.length; i++) {
				intSums[i] = intKors[i];
				intSums[i] += intEngs[i];
				intSums[i] += intMaths[i];
			}
			floatAvg[j] = intSums[j] / 3;

			System.out.printf("%d번\t%3d점\t%3d점\t%3d점\t%3d점\t%3.2f점\n", j + 1, intKors[j], intEngs[j], intMaths[j],
					intSums[j], floatAvg[j]);
		}
		System.out.println("-------------------------------------------");
		System.out.println("GOOD BEY!");
		System.out.println("===========================================");

	}
}
