package com.callor.classes.service;

public class MethodService {
	
	// 변수는 같은 {}구역 내에서는 같은 이름으로 절대 중복 선언할 수 없다.
	int num;
	
	// method는 같은 클래스의 {} 구역내에서는 원칙적으로 같은이름으로 중복 선언할 수 없다.
	// 예외 1 : 매개변수의 존재 유무
	// 예외 2 : 매개변수의 개수 추이
	// 예외 3 : 매개변수 type의 차이
	public void method(int num) {
		System.out.println("여기는 1번 method");
	}
	public void method(int num, int num1) {
	}
	
	public void method(float num, int num1) {
	}
	
	public void method(int num, float num1) {
	}
	/*
	 *  method 코드를 작성할때 매개변수를 선언하면 이 method를 호출할때 반드시 매개변수에
	 *  해당하는 값을 전달해야 한다.
	 *  객체.method(30, 30.0f
	 */

}
