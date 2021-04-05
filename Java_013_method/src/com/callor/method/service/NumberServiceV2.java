package com.callor.method.service;

import java.util.Scanner;
// 정수를 키보드에서 입력받아 정수를 return하거나 QUIT를 입력하면 null을 return하라
public class NumberServiceV2 {
	
	Scanner scan;
	
	public NumberServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	
	public void printNum() {
		this.inputNum();
		int num = this.inputNum();
		System.out.println("입력하신 정수는 " +num + "입니다.");
		
	}
	
	public Integer inputNum() {
		while(true) {
		System.out.println("0 ~ 100까지 정수를 입력하세요.");
		System.out.println("종료하고싶으면 QUIT를 입력하세요.");
		System.out.print(">> ");
		String str = scan.nextLine();
		Integer num = 0;
		if(str.equals("QUIT")) {
			return null;
		}
		try {
			num = Integer.valueOf(str);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정수만 입력하세요.");
			continue;
		}
		
		if(num > 0 && num <100) {
			return num;
		} else {
			continue;
		}
		}
	}
	
	// 아래는 선생님이 해주신것
	public Integer inputNums2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 0 ~ 100까지 중 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}

}
