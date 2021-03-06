package com.callor.method;

public class Number_01 {
	
	public static void main(String[] args) {
		
		// 문자열형 숫자
		String strNum1 = "100";
		String strNum2 = " 100.0";
		
		// 문자열형 연결연산
		System.out.println(strNum1 + strNum2);
		
		// strNum1과 strNum2에 저장된 값으로 4칙연산을 표현하고 싶을땐
		// 사칙연산이 가능한 type으로 변환을 시켜야 한다.
		
		// Integer 클래스에 정의된 valueOf() static method를 호출하여 문자열형 숫자를 정수형 값으로 변환하고
		// intNum 변수에 저장하라
		// static method는 클래스를 개체로 생성하지 않고도 호출할 수 있다.
		// 단, 함수방식으로는 호출이 불가능하다.
		// 클래스.method() 형식으로 호출해야한다.
		Integer intNum = Integer.valueOf(strNum1);
		Float floatNum = Float.valueOf(strNum2);
		
		System.out.printf("%d + %f = %3.2f\n", intNum, floatNum, intNum + floatNum);
		System.out.printf("%d - %f = %3.2f\n", intNum, floatNum, intNum - floatNum);
		System.out.printf("%d x %f = %3.2f\n", intNum, floatNum, intNum * floatNum);
		System.out.printf("%d / %f = %3.2f\n", intNum, floatNum, intNum / floatNum);
		
		
	}

}
