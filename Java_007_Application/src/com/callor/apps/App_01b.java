package com.callor.apps;

import java.util.Random;

public class App_01b {
	
	public static void main(String[] args) {
		
		Random rnd = new Random(); // Random 사용 선언
		int[] intNums = new int[20]; // intNums 배열 선언
		
		for(int i = 0 ; i < intNums.length ; i++) { // intNums 배열수까지만큼 반복
			intNums[i] = rnd.nextInt(51) + 50; // intNums 배열들에 50~100 Random 값을 저장
		}
		
		for(int arr = 0 ; arr < intNums.length ; arr++) { // intNums 배열수까지만큼 반복
			int num = 0;
			int numP = intNums[arr];
			
			for(num = 2 ; num < numP ; num++) {
				
				if(numP % num == 0) {
					break;
				}
			}
			if(num < numP) {
				System.out.println(numP + " 는 소수가 아님 ");
			} else {
				System.out.println(numP + " 는 소수");
			}
		}
		
	}
}
