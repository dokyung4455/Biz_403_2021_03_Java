package com.jin.var;

public class Varriable_11 {

	
	public static void main(String[] args) {
		
		int intNum = 100000;
		System.out.println(++intNum);
		
		int intSum = 0;
		intNum = 1;
		
		System.out.println("=================");
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		
		intSum = intSum + intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		
		intSum = intSum + intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		
		intSum = intSum + intNum ;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum += intNum);
		
		
	}
}
