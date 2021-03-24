package com.callor.controller;

public class Controller_02 {

	public static void main(String[] args) {

		// boolean(Boolean)
		// true, false 2가지 경우의 값을 갖는 특별한 형태
		// 대입연산자(=) 오른쪽의 연산을 수행하여 결과를 bYes 변수에 담아라

		// 동등연산자(==) 혹은 일치연산자 라고도 함
		// 두값이 동등한지를 계산하여 bYes 값에 true 또는 false 값으로 담음
		boolean bYes = 3 == 3; // true

		// 15를 3으로 나눴을때 남는 수가 0이냐
		bYes = 15 % 3 == 0; // true

		int intNum = 15;

		// intNum에 담긴 값이 3의 배수냐
		System.out.println(intNum % 3 == 0);
		// intNum에 단긴 값이 5의 배수냐
		System.out.println(intNum % 3 == 0);

		// intNum에 담긴 값이 3의 배수이면서 5의 배수냐
		// %3 == AND %5 == 0 이냐
		// && : AND 관계 연산자
		bYes = intNum % 3 == 0 && intNum % 5 == 0;

		intNum = 12;

		// intNum에 담긴 값이 3의 배수 이거나(혹은) 5의 배수 이냐
		// || : OR 관계 연산자
		// 관계연산자(||, or) 은 2가지 이상의 비교연산( ==, <, >, =<, =>, != 등) 을
		// 동시에 수행하기위한 연산
		bYes = intNum % 3 == 0 || intNum % 5 == 0;

		// &&는 곱셈(*)과 같음 ex: true(1) x true(1) = true(1) / true(1) x false(0) = false(0)
		bYes = true && true; // true
		bYes = true && false; // false
		bYes = false && true; // false
		bYes = false && false; // false

		// ||(filter 기호) 는 true : 1, false : 0 으로 해서 덧셈을 연산한다
		bYes = true || true; // 1 + 1 = 2(11 : 1) true
		bYes = true || false; // 1 + 0 = 1 true
		bYes = false || true; // 0 + 1 = 1 true
		bYes = false || false; // 0 + 0 = 1 true

	}
}
