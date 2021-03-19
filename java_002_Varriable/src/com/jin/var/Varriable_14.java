package com.jin.var;

public class Varriable_14 {

	public static void main(String[] args) {
		
		int intA = 0;
		int intB = 7;
		
		
		
		intA += (intB += 2);
		intA += (intB += 5);
		intA += (intB += 2);
		
		System.out.printf("sum : %d, num : %d", intA, intB);
		
		
						
		
	}
	
}
