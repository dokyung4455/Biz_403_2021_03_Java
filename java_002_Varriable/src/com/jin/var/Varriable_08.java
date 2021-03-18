package com.jin.var;

public class Varriable_08 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 1;
		
		// 1 ~ 10까지 덧셈을 수행
		
		intSum += intNum;
		// 0 = 0 + 1
		intSum += ++intNum;
		// 1 = 1 + 2
		intSum += ++intNum;
		// 3 = 3 + 3
		intSum += ++intNum;
		// 6 = 6 + 4
		
		System.out.println(intSum);
		
		
	}
	
}
