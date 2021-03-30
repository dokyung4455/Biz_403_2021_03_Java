package com.callor.classes;

import java.util.Random;

public class Value_01 {
	
	public static void main(String[] args) {
		
		// Java에는 Keyword 이면서 값인 경우가 있다.
		// true, false는 boolean형의 '값'이다.
		// 참, 거짓을 나타내는 Java 언어의 고유한 '값'
		// 비교연산문의 결과값을 표현하기 위한 독특한 값
		
		boolean bYes = true;
		bYes = false;
		
		// 이때 '30'은 '정수 값' 이라고 표현한다.(30 '리터럴'이라고도 한다.)
		int num = 30;
		
		
		// 널값(null값) : 아무것도 아닌 '값'
		Integer num1 = 0;
		
		// "-1이 num1 변수에 담겨있으면 코드를 종료하고 싶다"는 코드를 작성했을때
		// 이 경우는 num1에 -1 값이 어떤 의미없는 값이기 때문에 가능한 코드이다.
		// EX) 점수를 계산할때 0점부터 100점까지의 숫자만 필요할때 -1점은 의미없는 값
		// 만약 '-1'이 필요한 값이라면 이러한 코드는 사용이 어려워진다.
		// 이럴때 사용할 수 있는 값을 'null'값 이라고 한다.
		if(num1 == -1) {
			 // 코드 종료(return을 쓰는 경우도 있다)
		}
		
		num1 = method();
		
		System.out.println(num1);
		if(num1 == null) {
			System.out.println("3의 배수도 아니고 4의 배수도 아니다.");
		}
		
		num1 = 0;
	}
	
	// 0 ~ 99까지 중에 난수 1개를 생성하여 return 하는 method
	private static Integer method() {
		Random rnd = new Random();
		Integer num = rnd.nextInt(100);
		System.out.println(num);
		if(num % 3 == 0) {
			return 1;
		} else if (num % 4 == 0){
			return -1;
		} else {
			return null;
		}
	}

}
