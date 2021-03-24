package com.callor.arrays;

public class Array_02 {
	
	public static void main(String[] args) {
		
		// 어떤 값을 저장할 변수를 3개 이상 만들어야한다.
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		
		// 배열을 만들어 손쉽게 선언가능하다.
		int[] intKors = new int[3];
		
		// 값을 저장할때는
		// 변수이름[위치주소] = 값 // 토딩에서는 위치주소를 첨자 라고한다.
		intKors[0] = 100;
		intKors[1] = 90;
		intKors[2] = 88;
		// 값읽기
		// = intKors[위치주소]
		// = intKors[첨자]
		intKor1 = intKors[0];
		
		for(int index = 0 ; index <3 ; index ++) {
			System.out.println(intKors[index]);
		}
		
	}

}
