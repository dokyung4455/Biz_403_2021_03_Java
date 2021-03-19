package com.callor.controller;

public class Cont_01 {

	public static void main(String[] args) {
		
		int intNum = 0;
		
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		
		
		System.out.println("======================");
		
		intNum = 0;
		
		
		// main() 메서드의 코드는 Topdown으로 진행이 된다.
		// 코드가 정상 진행되는 과정에서 for() 명령문을 만나면 조건을 검사하고,
		// 조건에 따라 반복하는 코드가 실행된다.
		// 코드의 흐름을 바꾸는 명령을 "제어명령", "Control" 명령 이라고 한다.
		for( ; intNum<10;) {
			System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
		}
		
		System.out.println("======================");
		
		intNum = 0;
		for(; intNum < 10 ;) {
			System.out.println(++intNum + ". 우리나라 만세");
		}
		
		/*
		 * for() 명령을 만나면
		 * intNum = 0 을 실행한다
		 * 이 명령은 반복횟수와 관계없이 최초에 딱 한번만 실행됨
		 * 
		 * intNum < 10 을 실행하여 조건을 검사
		 * 결과가 true 이면 {} 의 명렁을 실행
		 * 
		 * 명령 실행 후 다시 for 명령문 시작으로 되돌아 감
		 * intNum++ 명령을 실행 후 조건 검사
		 * true 일시 명령 재실행
		 * 증가 조건검사를 반복하며 조건검사 결과가 false 가 될때까지 반복하여 실행
		 */
		for( intNum = 0 ; intNum < 10 ; intNum++ ) {
			System.out.println(intNum);
			
		}
		
		
		
	}
	
}
