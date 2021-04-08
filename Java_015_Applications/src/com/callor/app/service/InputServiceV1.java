package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		// TODO Auto-generated constructor stub

		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		while(true) {
		System.out.println(title + "값을 입력하세요.(QUIT 입력시 종료)");
		System.out.print(">> ");
		String str = scan.nextLine();
		if (str.equals("QUIT")) {
			System.out.println("업무종료");
			return null;
		}
		try {
			Integer num = Integer.valueOf(str);
			return num;
		} catch (NumberFormatException e) {
			System.out.println("정수 혹은 QUIT만 입력하세요.");
			continue;
		}
		}

	}

	public Integer inputValue(String title, int start) {
		while(true) {
			System.out.printf("%s값을 입력하세요. %d 이상만 입력가능합니다.(QUIT 입력시 종료)\n",title,start);
			System.out.print(">> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("업무종료");
				return null;
			}
			Integer num = 0;
			try {
				 num = Integer.valueOf(str);
				 if(num < start) {
					 System.out.printf("%d 이상의 정수만 입력하세요.\n",start);
					 continue;
				 }
				
			} catch (NumberFormatException e) {
				System.out.println("정수 혹은 QUIT만 입력하세요.");
				continue;
			}
			return num;
			}
	}

	public Integer inputValue(String title, int start, int end) {
		while(true) {
			System.out.printf("%s값을 입력하세요. %d 부터 %d까지 입력가능합니다.(QUIT 입력시 종료)\n",title,start,end);
			System.out.print(">> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("업무종료");
				return null;
			}
			Integer num = 0;
			try {
				 num = Integer.valueOf(str);
				 if(num < start || num > end) {
					 System.out.printf("%d부터 %d까지 정수만 입력할 수 있습니다.\n",start,end);
					 continue;
				 }
				
			} catch (NumberFormatException e) {
				System.out.println("정수 혹은 QUIT만 입력하세요.");
				continue;
			}
			return num;
			}

	}

}
