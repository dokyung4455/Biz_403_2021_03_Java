package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			int num = i + 1;

			// 3의 배수 이거나, 4의 배수인 수들을 보여라
			if (num % 3 == 0) {
				System.out.println(num);
				System.out.println(",");
			}
			if (num % 4 == 0) {
				System.out.println(num);
			}
		}

		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			// num값이 3의 배수이면 num값을 intSum3변수에 누적하라.
			// 누적하다 - intSum3 변수에 담긴값과 num값을 덧셈하여 다시 intSum3 변수에 저장하라

			// 3의 배수 이면 4의 배수에는 합산을 하지마라
			if (num % 3 == 0) {
				intSum3 += num;
			}
			// 여기에서 if가 아닌 else if를 사용하면 3의 배수이면서 4의배수인 경우 중복 합산하지 않는다.
			if (num % 4 == 0) {
				intSum4 += num;
			}
			// 3의 배수이면서 5의 배수이냐
			if (num % 3 == 0) {
				if (num % 5 == 0) {
					intSum5 += num;
				}
			}
		}

		System.out.println("===================");
		System.out.printf("%d는 3의 배수의 합\n", intSum3);
		System.out.printf("%d는 4의 배수의 합\n", intSum4);
		System.out.printf("%d는 3과 5의 배수의 합\n", intSum5);
		System.out.println("===================");
	}
}
