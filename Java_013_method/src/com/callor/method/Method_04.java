package com.callor.method;
import java.util.Scanner;

public class Method_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 *  입력을 받는데 정수 0 ~ 100 또는 문자열 QUIT
		 *  다른 type의 데이터를 동시에ㅐ 취급하기 위해서는 기본 type을 String형으로 설정하는 것이 편하다.
		 *  
		 */
		System.out.println("정수 0 ~ 100까지 중 정수입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">> ");
		// 모든 입력을 문자열 type으로 받아라.
		// 입력받은 문자열을 strNum에 저장하라.
		String strNum = scan.nextLine(); 
		//int num = scan.nextInt();
		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다.");
		} else {
			// QUIT 가 아닌 다른 값이 입력됬으면 일단 입력된 값을 정수형으로 변환해보자
			int intNUm1 = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			System.out.println("입력된 정수 : " + intNum2);
		}
		
		
		
		
	
	}

}
