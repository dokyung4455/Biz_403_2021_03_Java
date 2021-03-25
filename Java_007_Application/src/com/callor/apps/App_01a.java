package com.callor.apps;

public class App_01a {
	
	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 9;
		
		// 소수가 아님을 확인하는 방법
		for(int index = 2 ; index < num1 ; index++ ) {
			
			// 비교 연산문에서 결과가 한번이라도 true 이면 if 안의 내용을 실행하라
			if(num1 % index == 0) {
				System.out.println(num1 + " 소수가 아니다. ");
				
				//if 조건에 true가 아닐경우 else 내용을 실행하라
			} else {
				
			}
		}
		
		boolean notPrime = false; // flag 변수
		for(int index = 2 ; index < num2 ; index++) {
			if(num2 % index == 0) {
				notPrime = true;
				break;
			}
			// notPrime이 true인 경우( num2가 소수가 아닌경우)
			if( notPrime ) {
				System.out.println(num2 + "소수가 아님.");
				break;
			} else {
				System.out.println(num2 + " 소수임. ");
				break;
			}
		}
		System.out.println("======================================");
		int num = 0;
		for(num = 2 ; num < num2 ; num++) {
			if(num2 % num == 0) {
				break;
			}
		}
		/*
		 *  for() 반복문에서 사용할 num(index변수)를
		 *  for() 반복문 시작전에 선언을 하고 실행을 하면
		 *  for() 반복문이 종료된 후에 num값을 읽을 수 있다.
		 *  이때
		 *  1. 만약 중간에 break를 만나서 for()가 중단되거나
		 *  2. break없이 for() 반복문이 모두 완료되거나 할텐데
		 *  1과 2의 경우 num 변수의 상태가 다르다
		 *  
		 */
		System.out.printf("num2 : %d, num : %d", num2, num);
		
		// 조건문에서 값이 애매하게 만들어져 논리적 오류를 일으킬 가능성이 있다.
		
		
	}//main
	
	

}//class
