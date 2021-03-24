package com.callor.apps;

import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		
		int intSum = 0;
		float floatAvg = 0.0f;
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rnd.nextInt(51)+50;
			System.out.printf("%2d번 %d점\n",i+1,intScores[i]);
			intSum += intScores[i];
		}
		floatAvg = intSum / 10.0f ;
		
		System.out.println("===========================");
		System.out.printf("총점 : %d\t평균 : %3.2f\n",intSum,floatAvg);
		System.out.println("===========================");
		
	}

}
