package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {
	Scanner scan;
	List<Integer> intList;

	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNums() {
		while(true){
		System.out.println("정수 50 ~ 150까지 입력하세요.");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		
		Integer intNum = 0;
		try {
			// int intNum1 = Integer.valueOf(strNum); 옛날버전에선 이런형식으로 사용하면 성능에 큰문제가 생기기도함
			intNum = Integer.valueOf(strNum);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[error]값은 정수형 숫자로만 입력하세요.");
			continue;
		}
		if(intNum > 50 && intNum < 150) {
		intList.add(intNum);
		break;
		} else {
			System.out.println("정수는 50 ~ 150 범웨이서 입력하세요.");
		}
		}
		
		
		
		
	}

}
