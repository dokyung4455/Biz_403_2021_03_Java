package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV5 {
	/*
	 *  3과목의 점수를 저장할 배열을 10개 만들었다고 가정하자
	 *  intKor[8] = 90;
	 *  intEng[8] = 70;
	 *  intMath[8] = 66;`
	 */
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	Scanner scan;
	
	public ScoreServiceV5(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"};
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
	public void makeScores() {
		
		Integer[] scores = new Integer[subject.length];
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d번 학생의 성적입력\n",i+1);
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = this.inputScore(subject[j]);
				// 입력업무중에 -1을 입력하면 업무를 중단하고 main() 으로 되돌아가고싶다.
				// 이때 break를 사용하면 for가 겹쳐있기때문에 원하는대로 코드가 작동되지 않는다.
				// 이럴경우 return type이 void이지만 return명령을 실행하여 method코드를 중단할 수 있다.
				if(scores[j] == -1) {
					return;
				}
			}
			intKor[i] = scores[0];
			intEng[i] = scores[1];
			intMath[i] = scores[2];
		}
		
	}
	private Integer inputScore(String sub) {
		Integer score = 0;
		while(true) {
			System.out.println(sub + "점수를 입력하세요(Quit : -1");
			System.out.print(">> ");
			score = scan.nextInt();
			// 점수입력을 하는 도중 -1을 입력하면 입력하는 업무를 중단하자.
			if(score == -1) {
				return -1;
			} else if(score < 0 || score > 100) {
				System.out.println(sub + " 점수는 0 ~ 100까지 입력하세요.");
				// continue 명령을 사용하는 대신 else를 사용하여 코드를 작성
			}
			break;
		}
		return score;
	}
	/*
	 * 프로젝트를 만들고 컴파일을 수행하고 실행했을때 선언한 클래스는 코드만 존재하는 상태가 된다.
	 * 이 클래스를 객체로 선언하고, 생성한 후에 여럭가지 method를 호출하여 업무를 수행할 수 있다.
	 * method나 변수에 static을 부착하면 사용하지 않아도 method코드나 변수가 메모리에 상주하게 된다.
	 */
	public static String dLine() {
		return "==============================";
	}
}
