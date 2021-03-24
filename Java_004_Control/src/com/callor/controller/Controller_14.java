package com.callor.controller;

import java.util.Random;

public class Controller_14 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intSum = 0;
		float floatAvg = 0.0f;
		int kor = rnd.nextInt(100)+1;
		int eng = rnd.nextInt(100)+1;
		int math = rnd.nextInt(100)+1;
		
		intSum = kor;
		intSum += eng;
		intSum += math;
		
		floatAvg = intSum / 3.0f; 
		
		System.out.printf("국어 %d점\n",kor);
		System.out.printf("영어 %d점\n",eng);
		System.out.printf("수학 %d점\n",math);
		System.out.println("==============");
		System.out.printf("총점 %d점\t평균%3.2f점\n",intSum,floatAvg);
		System.out.println("==============");
		
		 
		
		
	}

}
