package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intMembers = rnd.nextInt(26);
		
		int intPizza = 0;
		
		intMembers += 25;
		
		intPizza = intMembers / 6;
		
		if(intMembers % intPizza > 0 ) {
			intPizza += 1;
		}
		
			
		
		System.out.printf("인원수 : %d명 \n", intMembers);
		System.out.printf("주문할 피자 : %d판 \n", intPizza);
		System.out.printf("피자조각 : %d조각 \n", intPizza * 6);
		
		
		boolean bYes = intMembers % (intPizza * 6) == 0;
		if( !bYes ) {
			intPizza++;
		}
		
		
		
	}
}

