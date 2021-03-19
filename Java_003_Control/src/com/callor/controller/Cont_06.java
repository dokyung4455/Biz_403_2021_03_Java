package com.callor.controller;

public class Cont_06 {

	public static void main(String[] args) {
		
		String strKor = "국어";
		String strEng = "영어";
		
		int intKor = 90;
		int intEng = 100;
		
		System.out.println(strKor + "점수 : " + intKor);
		System.out.println(strEng + "점수 : " + intEng);
		// %d 는 정수 포함 %f 실수 포함 %s 문자열 포함으로 각가변수들을 지정한다.
		
		System.out.printf("%s점수 : %d\n", strKor, intKor);
		
				
		String strNation = "우리나라 대한민국";
		System.out.println("============");
		for(int index = 0 ; index < 10 ; index++) {
			int num = index + 1;
			System.out.printf("%3d. %s\n",num,strNation);
			
			
		}
		
	}
	
}
