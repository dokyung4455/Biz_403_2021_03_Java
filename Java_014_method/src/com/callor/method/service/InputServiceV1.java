package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1 {
	Scanner scan;

	public InputServiceV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	/*
	 *  String title 매개변수를 받고 정수값이나 QUIT가 입력되는지 확인을 하고 잘못 입력된 값이 있으면 다시 입력받로고하는 method
	 */
	public Integer InputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요.(QUIT 입력중단)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			try {
				Integer num = Integer.valueOf(strNum);
				return num;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				continue;
			}


		}
	}
	// 문자열, 정수, 정수 매개변수를 갖는 method 선언
	// 문자열과 범위(start~end)값을 전달받아 prompt 문자열을 생성하고 intputValue(String title) method를 호출해
	// 값을 입력받도록 하고 return된 값에 따라 null이 return 되면 그냥 다시 return 해버리고
	public Integer InputValue(String title, int start, int end) {
		// title 변수값을 새우깡( 0 ~ 100 )
		// String.format 변수에 어떤 결과값을 담을수있게 만들어주는 명령
		title = String.format("%s(%d ~ %d)", title, start, end);
		while (true) {
			Integer retNum = this.InputValue(title);
			if (retNum == null) {
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.printf("입력값을 %d ~ %d " + "범위 이어야 합니다\n", start, end);
				continue;
			}
			return retNum;
		}

		
	}

}
