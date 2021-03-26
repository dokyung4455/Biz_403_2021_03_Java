package com.callor.apps.service;

public class TimeServiceV2 {
	int[] intNums1;

	public TimeServiceV2() {
		intNums1 = new int[8];
	}

	public void makeNums() {
		for (int i = 0; i < intNums1.length; i++) {
			intNums1[i] = 2 + i;
		}
	}

	public void printNums() {
		for (int i = 0; i < intNums1.length; i++) {
			System.out.println(LinesService.dLines(50));
			System.out.printf("%d 단\n", intNums1[i]);
			System.out.println(LinesService.sLines(50));
			for (int j = 1; j < 10; j += 1) {
				System.out.printf("%d x %d = %d\n", intNums1[i], j, intNums1[i] * j);
			}

		}

	}

}

