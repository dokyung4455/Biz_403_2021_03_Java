package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNums;

	public EvenServiceV1() {
		intNums = new int[100];

	}

	public void makeNums() {

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(101) + 1;

		}
	}

	public void printNums() {
		
		int nCount = 0;
		System.out.println("==================");
		System.out.println("짝수들의 리스트");
		System.out.println("------------------");
		int intSum1 = 0;
		int intSum2 = 0;
		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] % 2 == 0) {
				System.out.printf("%3d 는 짝수이다\n", intNums[index]);
				nCount++;
				intSum1 += intNums[index];
			}

		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("==================");
		System.out.println(intSum1 + " 는 짝수들의 합");
	}

}
