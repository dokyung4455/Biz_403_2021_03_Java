package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 배열의 크기를 변수에 설정해두고 코드내에서 공통으로 사용하기
		int[] intNums = new int[20];
		
		
		int intSum = 0;
		// for {} 내에 있는 코드는 최소화 하자
		// 작은 일들로 분해하기
		// 나누어서 정복하라 :
		for(int i = 0 ; i < 20 ; i++) {
			
			intNums[i] = rnd.nextInt(100)+1;
			
			// 배열에 저장된 값을 읽기 읽은 값이 짝수인가 검사
			if(intNums[i] % 2 == 0) {
				
				intSum += intNums[i];
				System.out.println(intNums[i]);
			}
			
		}
		System.out.println("짝수의 합 :" + intSum);
		
		
		
		
	}
	

}
