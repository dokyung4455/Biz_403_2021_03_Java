package com.callor.apps;

import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[20];
		
		
		// 요소 : 배열의 몇번째 값
		// 위치 : 배열의 몇번째
		// 첨자 : 배열의 몇번째인가를 알려주는값
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		
		for(int i = 0 ; i < intNums.length ; i++ ) {
			if(intNums[i] % 2 == 0 ) {
				System.out.printf("%d 번째 값 : %d\n", i, intNums[i]);
			}
		}
		}
		
		
	}


