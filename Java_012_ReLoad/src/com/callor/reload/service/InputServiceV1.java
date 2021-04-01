package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Service class
// 어디선가(main() method)에서 객체로 선언, 생성한 후 method호출을 통해 명령을 실행하는 class

public class InputServiceV1 {
	
	// 접근제한자
	// private : 나 혼자 단독으로 사용할때
	// protected : 누군가 상속하여 사용할 수 있도록 할때
	// 정수형 데이터들을 담을 리스트형 객체
	// Integer wrapper 클래스형 데이터들을 담을 리스트
	protected List<Integer> intList;
	
	// 키보드 입력을 받아 코드를 수행하기 위한 선언
	// 선언만된 객체는 기능을 수행할 수 없다 반드시 생성(초기화)를 해주어야한다
	protected Scanner scan;
	
	protected Integer intNum;
	// 클래스 영역에서 선언된 객체들을 '맴버변수들'이라고 칭한다.
	
	public InputServiceV1() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}
	
	
	// return type이 필요없을땐 public void로 method를 형성하고
	// 필요할땐 public static method로 형성한다.
	 // {} = 코드블럭, 블래이드
	// 코드블럭에 연산을 수행하는 코드를 작성하고 그 코드들의 묶음을 inputNum라고 선언
	public void inputNum() {

		while (true) {
			System.out.println("생성할 정수를 입력하세요.");
			System.out.print(">> ");
			intNum = scan.nextInt();
			if (intNum.equals(-4444)) {
				return;
			}
			
			intList.add(intNum);
		}
	}

	public void printNum() {
		for(int i = 0 ; i < intList.size(); i++) {
			Integer num = intList.get(i);
			System.out.println("정수 : " + num);
		}
		
		
		System.out.println(intList);

	}

}
