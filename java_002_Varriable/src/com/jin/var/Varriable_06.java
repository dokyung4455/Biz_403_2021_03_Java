package com.jin.var;

public class Varriable_06 {

	public static void main(String[] args) {
		
		int intNum = 0;
		
		//System.out.println( intNum = intNum + 1 );
		System.out.println( "숫자 : " + (intNum + 1) );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		
		intNum = 0;
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		
		
		intNum = 0;
		// 1
		intNum += 1;
		System.out.println(intNum);
		// 19,20 명령을 한 명령문으로 만들면 아래와 같음
		System.out.println(++intNum);
		
		
		// 2
		System.out.println(intNum);
		intNum +=1;
		// 25,26 명령을 한 명령문으로 만들면 아래와 같음
		System.out.println(intNum ++);
		
		System.out.println( intNum );
	}
	
}
