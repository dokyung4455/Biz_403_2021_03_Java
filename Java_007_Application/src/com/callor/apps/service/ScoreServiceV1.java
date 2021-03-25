package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int[] intSums;
	float[] floatAvg;
	
	public ScoreServiceV1() {
		intKors = new int[10];
		intEngs = new int[10];
		intMaths = new int[10];
		intSums = new int[10];
		floatAvg = new float[10];
		
	}
	
	public void makeNums() {
		Random rnd = new Random();
		for(int i = 0 ; i < intKors.length ; i++) {
			intKors[i] = rnd.nextInt(71)+30;
			intEngs[i] = rnd.nextInt(71)+30;
			intMaths[i] = rnd.nextInt(71)+30;
		}
	}
	public void makeScore() {
		for(int n = 0 ; n < intKors.length ; n++) {
			intSums[n] = intKors[n];
			intSums[n] += intEngs[n];
			intSums[n] += intMaths[n];
		
			floatAvg[n] = (float)intSums[n] / 3;
		}
	}
	
	public void printScore() {
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		for(int j = 0 ; j < intKors.length ; j++) {
			System.out.printf("%2d번\t%3d점\t%3d점\t%3d점\t%3d점\t%3.2f점\n",j+1,intKors[j],intEngs[j],intMaths[j],intSums[j],floatAvg[j]);
		}
		System.out.println("=================================================");
	}
	
}
