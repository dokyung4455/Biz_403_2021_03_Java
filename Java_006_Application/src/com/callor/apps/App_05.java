package com.callor.apps;

import java.util.Random;

public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[10];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		for(int i = 0 ; i < intNums.length ; i++) {
			// 
			System.out.print(intNums[i] + "\t");
			
			// 5번째 요소를 출력한 후 Enter를 눌러 다음 요소는 줄바꿈해라
			if((i+1) % 5 == 0 ) {
				System.out.println();
			}
		}
	}

}
