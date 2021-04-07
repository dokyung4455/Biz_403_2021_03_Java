package com.callor.method.service;

public class ScoreServiceV4 {
	// 과목의 이름이 저장될 배열을 클래스 영역에 선언
	// 과목점수입력, 성적리스트 출력 등에서 사용하기 때문에 멤버변수 영역, 클래스 영역에 선언
	InputServiceV2 isV2;
	protected String[] subject;
	// 생성자 method ScoreServiceV4 클래스를 사용하여 객체를 생성할때 호출할 method
	public ScoreServiceV4() {
		// 생성한다 : 변수에 값을저장, 객체를 초기화한다( new 생성자();)
		// 생성자에 작성되는 코드
		// 멤버변수 영역에 선언된 변수, 객체를 생성하는 코드
		isV2 = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore() {
		Integer[] scores = new Integer[subject.length];
		int sum = 0;
		float avg = 0.0f;
		
		for (int i = 0; i < subject.length; i++) {
			Integer score = isV2.inputValue(subject[i], 0, 100);
			if (score == null) {
				/*
				 * break 와 return
				 * break를 실행하면 for()반복문만 중단하고 for()반복문 이후 코드를 실행한다.
				 * for()반복문 이후에 다른 연산(코드)를 수행할 필요가 있을땐 break를 사용한다.
				 * 
				 * return을 실행하면 현재 method(inputScore())를 무조건 종료해 버린다.
				 * inputScore() method를 호출했던 코드로 되돌아간다.
				 */
				System.out.println("업무종료");
				return;
			}
			scores[i] = score;
		} // for end
		// scores 배열에 담긴 점수를 총점 계산
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		avg = sum / (float)scores.length;
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		

	}

}
