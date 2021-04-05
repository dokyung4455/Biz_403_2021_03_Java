package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	


	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0~100까지 정수를 입력하세요.");
			System.out.println("QUIT를 입력하면 종료합니다.");
			System.out.print(">> ");
			String strNum = scan.nextLine(); // 정수 입력
			if (strNum.equals("QUIT")) { // QUIT 입력여부 체크
				System.out.println("업무 종료");
				return null; // 입력시 Stop
			}
			Integer intNum = 0;
			try { // 익셈션 검사
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				continue; // 오류 발생시 다시시작

			}
			if (intNum >= 0 && intNum <= 100) { // 유효성 검사
				return intNum; // 조건 만족시 값 리턴
			} else { // 불만족시 재입력 요청
				System.out.println("0 ~ 100까지만 입력하세요");
				continue;
			}
		}

	}
	

}
