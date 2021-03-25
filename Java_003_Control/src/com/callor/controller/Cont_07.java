package com.callor.controller;

public class Cont_07 {
	
	public static void main(String[] args) {
		
		int intNum = 233;
		
		intNum = 77;
		
		for(int i = 2 ; i < intNum ; i++) {
			
			System.out.printf("%d = %d\n", i, intNum % i);
			
		}
		intNum = 4;
		for(int index = 2 ; index < intNum ; index++) {
			
			System.out.println(intNum % index == 0 ? "소수가 아님" : "");
			
		}
		
	}

}
