package com.callor.method;

import java.util.Scanner;

public class Number_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		System.out.println("QUIT 는 종료하기");
		System.out.println(">> ");
		String strInput = scan.nextLine();
		
		// .trim() : 문자열의 앞, 뒤에 붙은 white space(띄어쓰기)를 제거하는 method
		strInput = strInput.trim();
		strInput.equals("QUIT");
		
		// 입력된 문자열에 혹시 있을지 모를 띄어쓰기를 제거하고 입력문자열이 QUIT인가를 검사하는 코드
		// 객체의 chaining
		if(strInput.trim().equals("QUIT")) {
			System.out.println("종료합니다");
		} else {
			try {
				int intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
