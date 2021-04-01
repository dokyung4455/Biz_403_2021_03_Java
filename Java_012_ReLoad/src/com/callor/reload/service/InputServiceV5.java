package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {
		NumberVO vo = new NumberVO();

		Integer num3;

		int intNum = 0;
		System.out.println("첫번째 정수를 입력하세요.");
		String str1 = scan.next();
		Integer num1 = Integer.valueOf(str1);

		System.out.println("두번째 정수를 입력하세요.(첫번째 정수보다 크면 안됩니다.)");
		String str2 = scan.next();
		Integer num2 = Integer.valueOf(str2);
		if (num2 > num1) {
			System.out.println("다시 입력하세요!");
			System.out.println("두번째 정수는 첫번째 정수보다 클 수 없습니다.");
		}

		vo.setNum1(num1);
		vo.setNum2(num2);
		numList.add(vo);

	}

	public void printNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.print(vo.getNum1());
			System.out.print("-");
			System.out.print(vo.getNum2());
			System.out.print("=");
			System.out.println(vo.getNum1()-vo.getNum2());

		}

	}

}
