package com.callor.apps;

import java.util.Random;

public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intTotal = new int[5];
		float floatAvg = 0.0f;
		
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intTotalAll = 0;
		
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		for(int i = 0 ; i <5 ; i++) {
			intKor[i] = rnd.nextInt(51)+50;
			intEng[i] = rnd.nextInt(51)+50;
			intMath[i] = rnd.nextInt(51)+50;
			
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
					
			floatAvg = intTotal[i] / 3.0f ;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n",i+1, intKor[i], intEng[i], intMath[i], intTotal[i], floatAvg);
			

			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
			intMathTotal += intMath[i];
			
			intTotalAll = intKorTotal;
			intTotalAll += intEngTotal;
			intTotalAll += intMathTotal;
		}
		System.out.println("===============================================");
		System.out.printf("Total\t%d\t%d\t%d\t%d",intKorTotal, intEngTotal, intMathTotal, intTotalAll);
	}
}

