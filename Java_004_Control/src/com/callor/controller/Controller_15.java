package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intSum = 0;
		float floatAvg = 0.0f;
		
		int intStu1 = rnd.nextInt(100)+1;
		int intStu2 = rnd.nextInt(100)+1;
		int intStu3 = rnd.nextInt(100)+1;
		int intStu4 = rnd.nextInt(100)+1;
		int intStu5 = rnd.nextInt(100)+1;
		int intStu6 = rnd.nextInt(100)+1;
		int intStu7 = rnd.nextInt(100)+1;
		int intStu8 = rnd.nextInt(100)+1;
		int intStu9 = rnd.nextInt(100)+1;
		int intStu10 = rnd.nextInt(100)+1;
				
		intSum = intStu1;
		intSum += intStu2;
		intSum += intStu3;
		intSum += intStu4;
		intSum += intStu5;
		intSum += intStu6;
		intSum += intStu7;
		intSum += intStu8;
		intSum += intStu9;
		intSum += intStu10;
		
		floatAvg = intSum / 10.0f;
		
		
		System.out.printf("학생1 : %d점\n", intStu1);
		System.out.printf("학생2 : %d점\n", intStu2);
		System.out.printf("학생3 : %d점\n", intStu3);
		System.out.printf("학생4 : %d점\n", intStu4);
		System.out.printf("학생5 : %d점\n", intStu5);
		System.out.printf("학생6 : %d점\n", intStu6);
		System.out.printf("학생7 : %d점\n", intStu7);
		System.out.printf("학생8 : %d점\n", intStu8);
		System.out.printf("학생9 : %d점\n", intStu9);
		System.out.printf("학생10 : %d점\n", intStu10);
		System.out.println("===============");
		System.out.printf("총점 : %d점,\t평균 : %3.2f점\n", intSum,floatAvg);
		
		
		
	}
	

}
