package com.callor.controller;

public class Cont_04 {

	public static void main(String[] args) {
		
		int intNum = 0;
		for(int index=0; index < 10; index++) {
			intNum = index + 1;
			// for() 반복문이 실행되는 동안 intNum 변수는 생성과 소멸을 반복횟수만 실행한다.
			// 과거에는 이러한 문제가 이슈가 되었다.
			
			System.out.println(intNum);
						
		}
		
		int intSum = 0;
		for(int index = 0; index < 10; index++) {
			intNum = index + 1;
			
			intSum += intNum;
			
			System.out.println(intSum);
			
		}
			
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int n = i + 1;
			intSum += n;
			System.out.println(intSum);
		}
		
		intSum = 0;
		for(int index=0;index<10;index++) {
			
			
		}
		
		for(int index = 0; index < 10 ; index += 2) {
			 
			
		}
		
		for(int index = 0 ; index <10; index +=2) {
			int num = index + 1;
			System.out.println(num);
			
			
			
		}
		
		
		
		
	}
	
}
