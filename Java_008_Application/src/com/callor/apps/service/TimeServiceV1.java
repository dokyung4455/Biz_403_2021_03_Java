package com.callor.apps.service;

public class TimeServiceV1 {
	int[] intNums1;

	public TimeServiceV1() {
		intNums1 = new int[8];
	}

	public void makeNums() {
		for (int i = 0; i < intNums1.length; i++) {
			intNums1[i] = 2 + i;
		}
	}

	public void printNums() {
		for (int i = 0; i < intNums1.length; i++) {
			// method에 return ?? 명령문이 있으면 변서 = method() 형식으로 코드를 작성하고
			// method가 return 해준 결과값을 변수에 저장 할 수 있다.
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			System.out.println(dLines);
			System.out.printf("%d 단\n", intNums1[i]);
			System.out.println(sLines);
			for (int j = 1; j < 10; j += 1) {
				System.out.printf("%d x %d = %d\n", intNums1[i], j, intNums1[i] * j);
			}

		}

	}

}

