package com.callor.controller;

import java.util.Random;

// Jdk에는 수없이 많은 도구들이 포함되어 있다.
// Lego 블럭을 이용해서 작품을 만드는 것 처럼
// Jdk에 있는 도구를 사용하여 프로젝트를 만들 수 있다.
// Jdk 한꺼번에 프로젝트에 포함하면 해당 프로젝트는 너무 거대해 질것이다.
// 이런 상황을 미연에 방지하기 위해 

// import java.util.Random ;
// ㄴ 지금부터 Controller_06 클래스에서 Jave.util 패키지의 Random 클래스라는 도구를 사용하는 선언

// eclipse에서 도구를 사용하기 위해 imprt 하고자 할때는
// Ctrl + Shift + o 를 눌러주면 된다.
// Ctrl + Shift + f 코드의 모양을 정렬하는 방법

public class Controller_06 {
	
	public static void main(String[] args) {
		
		// 프로젝트에서 Jdk의 클래스(Class)도구를 사용하는 방법
		// 1. 변수를 선언하고 초기화 하는 것과 유사하다.
		// int 키워드는 정수형 변수를 선언하는 키워드
		// Integer 키워드는 정수형 변수를 선언 => 실체는 키워드가 아닌 클래스(Class)이다
		// 키워드는 Java가 처음 탄생됐을때부터 만들어진 명령어
		// Class는 키워드처럼 사용이 되지만 Java가 탄생하고 이후에 필요에 의해 추가, 확장된 명령이다
		
		
		Random rnd = null; // 선언
		rnd = new Random() ; // 초기화
		
		Random rnd1 = new Random();
		
		int num1 = 0;
		Integer num2 = 0;
		Integer num3 = new Integer(0);
		
		String str1 = "";
		str1 = "홍길동";
		String str2 = null;
		str2 = "이몽룡";
		String str3 = new String();
		
		// wrapper 클래스 : Class 이지만 변수선언처럼 사용할 수 있는 도구들
		// Integer, Long, Float, Double, Boolean, Charactor 들은
		// int, long, float, double, boolean, char 키워드에 확장된 기능을 할 수 있도록 만들어진 클래스이다
		// 기본기능은 값을 저장하는 변수를 선언하는 기능
		// 기본기능에 별도로 확장된 추가명령을 수행할 수 있도록 만들어진 도구들이다.
		
		
	}

}
