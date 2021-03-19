package com.jin.var;

public class Varriable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intSum = 0;
		intNum = 2;
		
		intSum += intNum;
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		System.out.println(intSum);
		
		
		intSum = 0;
		intNum = 0;
		
		intSum += (intNum += 2); // 2
		intSum += (intNum += 2); // 6
		intSum += (intNum += 2); // 12
		intSum += (intNum += 2); // 20
		intSum += (intNum += 2); // 30
		
		System.out.println(intSum);
		
		intSum = 0;
		intNum = 0;
		
		for ( ; intSum < 30 ; ) {
			intSum = (intNum += 2);
			System.out.println( intSum );
		}
			
			
			
		
		
		
		
		
				
	}
	
}
