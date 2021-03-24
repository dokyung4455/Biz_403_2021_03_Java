package com.callor.controller;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] args) {
		
		Random rnd = new Random();

		// 어떠한 명령을 반복해서 5번 수행하겠다
		for(int i = 0 ; i < 10 ; i++) {
			
			// 정수형 난수(임의의 정수)를 만들어서 num 변수에 저장하고 그 값을 출력하라
			int num = rnd.nextInt();
			System.out.println(num);
			
		}
		System.out.println("============================");
		
		for(int i = 0 ; i < 5 ; i++) {
			// 0 ~ 99까지 정수를 만들어라
			// 0 ~ 100 -1 까지 정수를 만들어라
			// 0 ~ 100 미만의 정수를 만들어라
			int num = rnd.nextInt(100);
			System.out.println(num);
		}
		System.out.println("============================");
		
		for(int i = 0 ; i < 5 ; i++) {
			int num = rnd.nextInt(10);
			System.out.println(num);
		}
	
	}
}
