package com.callor.method.service;
/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어) 에서는 한개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를
 * 선언할 수 없다.
 * 객체지향 프로그래밍 언어(Java)에서는 한개의 클래스(파일)내에서 같은 이름의 함수(method)를 중복하여 선언할 수 있다.
 * 
 * 단, 매개변수가 달라야 한다는 조건이 있다.
 * 매개변수의 type, 개수, 순서가 다르면 같은 이름의 method를 중복 선언할 수 있다.
 */

public class NumberServiceV1 {

	public NumberServiceV1() {
		// TODO Auto-generated constructor stub
	}
	
	// addNum() 이름의 method, 두 개의 정수를 매개변수로 받는다
	// 누구나 어디선가 addNum()를 호출할때는 객체.addNum()
	// 2개의 중수를 전달하게끔 하겠다. = 객체.addNum(100,200)
	
	
	public Integer addNum(int num1,int num2) {
		// TODO 두 정수의 합이 짝수인가 판별하는 method
		Integer sum = 0;
		sum = num1 + num2;
		if(sum % 2 == 0) {
			return sum;
		} else {
			return null;	
		}
	} // addNum(int num1, int num2)  END
	
	
	//Java의 method는 매개변수에 따라 호출하는 방식이 달라진다.
	// 만약 addNum(정수,정수) 방식으로 호출하려면 addNum(int num1,int num2) 형식으로 method를 선언해야한다.
	// 만약 addNum(정수,정수) 방식으로 호출하려면 addNum(long num1,long num2) 형식으로 method를 선언해야한다.
	// 만약 addNum(실수,실수) 방식으로 호출하려면 addNum(double num1,double num2) 형식으로 method를 선언해야한다.
	// 만약 addNum(실수,실수) 방식으로 호출하려면 addNum(float num1, float num2) 형식으로 method를 선언해야한다.
	
	public Float addNum(float num1, float num2) {
		// TODO 두 실수를 전달받아 짝수인가 판별하는 코드
		Float floatSum = 0.0f;
		floatSum = num1 + num2;
		if(floatSum % 2 == 0) {
			return floatSum;
		}
		
		
		// method 코드가 아직 작성되지 않았을때 문법오류가 나는 것을 방지하는 임시코드
		return null;
	}

}
