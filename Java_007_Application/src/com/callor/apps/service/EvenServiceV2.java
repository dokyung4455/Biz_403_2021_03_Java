package com.callor.apps.service;

/*
 * 자바프로그래밍에서의 상속이란?
 * V2 클래스에서는 V1클래스를 상속했다
 * V1에 작성한(선언한) 변수, method 코드를 그대로 이어받아 사용하겠다.
 * 
 * V1에 작성된 method들의 코드를 그대로 사용하면서 일부 method드의 코드를 변경, 확장, 기능개선하여 내 프로젝트에 적용하겠다.
 */

import java.util.Random;

public class EvenServiceV2 extends EvenServiceV1 {

	int[] intNums;

	public EvenServiceV2() {
		intNums = new int[100];

	}

	public void printNums() {
		int nCount = 0;
		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] % 2 == 0) {
				System.out.printf("%4d", intNums[index]);
				nCount++;
				if(intNums[index] % 5 == 0) {
					System.out.println();
					
				}
			}

		}
	}

}
