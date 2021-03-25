package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[20];
		
		Random rnd = new Random();
		
		int s = 2;
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51)+50;
			boolean bNo = intNums[i] % s++ > 0;
			
			int j = 0 ;
			for(j = 2 ; j < intNums[i] ; j++) {
				if(bNo) {
					System.out.println(intNums[i]);
					break;
				} 
				
			}
			

		
		
			
				
			}
			
			
			
		}
		
		
}

