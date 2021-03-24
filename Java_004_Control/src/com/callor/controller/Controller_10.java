package com.callor.controller;

import java.util.Random;

// 0 ~ 100까지 중의 임의의 정수 5개를 만들어서 그 수가 짝수인지 아닌지를 출력

public class Controller_10 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
				
		for(int i = 0 ; i < 5 ; i++) {
			int num1 = rnd.nextInt();
			if(num1 %2 == 0) {
				System.out.println(num1 + " 는 짝수");
			} else {
				System.out.println(num1 + " 는 짝수아님");
			}
			
		}

	}
}
