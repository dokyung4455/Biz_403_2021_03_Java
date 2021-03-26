package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요.");
		System.out.print(">>");
		int num1 = scr.nextInt();

		System.out.println(LinesService.dLines(50));

		if (num1 % 2 == 0) {
			System.out.println(num1 + "은 짝수입니다.");

		} else {
			System.out.println(num1 + "은 짝수가 아닙니다.");
		}

		// 소수 판별을 하는 2 ~(자신-1) 수로 나누었을때 나머지가 0인 경우가 한번도 없어야 한다.
		int i = 0;
		for (i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				break;
			}
		}
		if (i < num1) {
			System.out.println(num1 + "은 소수가 아닙니다.");
		} else {
			System.out.println(num1 + "은 소수입니다.");
		}

	}

}
