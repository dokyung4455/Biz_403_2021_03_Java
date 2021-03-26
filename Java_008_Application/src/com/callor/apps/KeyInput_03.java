package com.callor.apps;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scn1 = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("사칙연산을 수행합니다.");
		System.out.println("----------------------------");
		System.out.println("첫번째 정수를 입력하세요.");
		System.out.print("정수1 >>");
		int num1 = scn1.nextInt();
		System.out.println("----------------------------");
		System.out.println("두번째 정수를 입력하세요.");
		System.out.print("정수2 >>");
		int num2 = scn2.nextInt();
		System.out.println("============================");
		System.out.println("결과");
		System.out.println("----------------------------");
		System.out.printf("더하기 : %d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("빼기 : %d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("곱하기 : %d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("나누기 : %d / %d = %d\n", num1, num2, num1 / num2);
		System.out.println("============================");

	}

}
