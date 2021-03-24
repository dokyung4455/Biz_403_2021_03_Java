package com.callor.controller;

// 1 ~ 100까지 숫자중에서
// 3의배수의 합
// 4의배수의 합
// 3과 5의 배수의 합

public class Controller_04 {

	public static void main(String[] args) {

		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 1;

			if (num % 3 == 0) {
				intSum3 += num;
			}
			if (num % 4 == 0) {
				intSum4 += num;
			}
			if (num % 3 == 0 && num % 5 == 0) {
				intSum5 += num;
			}

		}
		System.out.println("================");
		System.out.printf("%d 는 3배수의 합\n", intSum3);
		System.out.printf("%d 는 4배수의 합\n", intSum4);
		System.out.printf("%d 는 3과5배수의 합\n", intSum5);
		System.out.println("================");

	}
}
