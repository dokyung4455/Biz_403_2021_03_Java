package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {
	Scanner scan;
	List<Integer> intList;

	public InputServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		String num;
	}
	// method{}에 선언된 변수는 지역변수 라고 한다.
	// 지역변수는 {}를 벗어나면 변수가 소멸된다
	// {} 이 서로 다르면 이름은 같아도 절대 접근이 불가하다
	// 멤버변수에 같은 이름의 변수가 있는데 지역변수에 같은이름으로 변수를 또 선언하면 멤버변수는 감춰져서 접근이 불가능하다
	
	public void inputNum() {
		while (true) {
			System.out.println("50부터 150까지 정수를 입력하세요.(종료 : -1)");
			System.out.print(">> ");
			int num = scan.nextInt();
			if (num == -1) {
				System.out.println(intList);
				break;
			}
			if (num < 50 || num > 150) {
				System.out.println("50 ~ 150까지만 입력 가능합니다. 다시입력해주세요.");
				continue;
			}
			System.out.println("입력하신 List");
			intList.add(num);

		}

	}

}
