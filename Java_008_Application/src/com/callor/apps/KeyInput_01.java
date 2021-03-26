package com.callor.apps;

import java.util.Scanner;

/*
 *  실제 App을 사용하여 업무를 수행할땐 데이트(값)을 키보드로 입력하고
 */
public class KeyInput_01 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Korea");
		Scanner scan = null; // 객체 선언
		scan = new Scanner(System.in); // 객체를 생성(초기화)하여 인스턴스로 만들어 사용할 준비해라
		
		Scanner scan1 = new Scanner(System.in); // 객체를 선언 및 생성해 사용할 준비를 해라
		
		// 2. Scanner 객체(Scanner 클래스를 사용하여 만든 객체)를 사용해
		// 키보드로부터 무언가 입력을 받도록 대기를 한다.
		// 이 명령이 실행되면 App은 멈춰 있는 것처럼 보인다.
		// 이 상태를 코드흐름이 Blocking 되었다 라고 한다.
		// 무언가 입력하고 Enter를 누르면 입력한 정부값만 num 변수에 저장해 준다.
		int num = scan.nextInt();
		System.out.println("키보드로 입력한 값 : " + num);
		
	}

}
