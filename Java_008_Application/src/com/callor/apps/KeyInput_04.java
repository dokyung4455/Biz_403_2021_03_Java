package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

public class KeyInput_04 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[5];
		
		int intSum = 0;
		Scanner scr1 = new Scanner(System.in);
		
		System.out.println("START!");
		System.out.println("==========================================");
		System.out.println("정수 5개의 합을 구합니다.");	
		for(int i = 0 ; i < intNums.length ; i++) {
			int num = i+1;
			System.out.println("------------------------------------------");
			System.out.printf("%d/5번째 정수를 입력해주세요.\n", num);
			System.out.printf("%d번째 정수 ? : ", num);
			int scr = scr1.nextInt();
			intNums[i] = scr;
		}
		
		System.out.println("==========================================");
		for(int i = 0 ; i < intNums.length ; i++) {
			intSum += intNums[i];
		}
		System.out.println(Arrays.toString(intNums));
		System.out.print("위의 정수들의 합은 ? : ");
		System.out.println(intSum);
		System.out.println("END.");
	}

}
