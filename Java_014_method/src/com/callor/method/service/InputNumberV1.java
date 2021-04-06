package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	Scanner scan;

	/*
	 * Scanner class는 키보드 자원을 연동하여 키보드로 부터 값을 입력받기 위한 클래스이다.
	 * 
	 */
	public InputNumberV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		System.out.println(title + " 값을 입력하세요.");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return null;
		}
		Integer intNum;
		try {
			intNum = Integer.valueOf(strNum);
			return intNum;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return null;

		}

	}

}
