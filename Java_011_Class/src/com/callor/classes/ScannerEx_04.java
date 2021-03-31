package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2개의 숫자를 입력합니다.");
		System.out.println("단, Quit를 입력하면 종료한다");
		
		System.out.println("숫자 1 >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return;
		}
		
		System.out.println("입력한 숫자 : " + strNum);
	}

}
