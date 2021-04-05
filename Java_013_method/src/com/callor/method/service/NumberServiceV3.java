package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	


	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0~100까지 정수를 입력하세요.");
			System.out.println("QUIT를 입력하면 종료합니다.");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				System.out.println("업무 종료");
				return null;
			}
			Integer intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				continue;

			}
			if (intNum >= 0 && intNum <= 100) {
				return intNum;
			} else {
				System.out.println("0 ~ 100까지만 입력하세요");
				continue;
			}
		}

	}
	

}
