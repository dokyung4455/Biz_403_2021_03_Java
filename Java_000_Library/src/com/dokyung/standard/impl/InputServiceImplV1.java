package com.dokyung.standard.impl;

import java.util.Scanner;

import com.dokyung.standard.InputService;

// interface를 implements 한 클래스는 이름을 지을때 접미사에 보통 impl 을 붙인다.
// interface를 implements 한 클래스는 interface에 설계된 추상method를 "반드시" 구체적인 코드로 구현해야한다.
// 만약 아직 구체적인 코드가 구현되지 않았더라도 method의 형태는 삭제할 수 없다.
// 이러한 규칙을 적용하여 다른 클래스와 연동할때 편리하고, 오류가 없도록 하기 위함이다.

// InputServiceimplV1 
// 클래스를 상속할땐 extends, interface를 상속할땐 implements
public class InputServiceImplV1 implements InputService {
	protected Scanner scan;

	public InputServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	@Override
	public Integer inputValue(String title) {
		// TODO Prompt 타이틀을 보여주고 정수 입력받기
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT : 입력종료)");
			System.out.println(">> ");
			String strIn = scan.nextLine();
			if(strIn.equals("QUIT")) {
				System.out.println("입력을 종료합니다.");
				return null;
			}
			
			Integer intIn = null;
			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수 또는 QUIT만 입력 가능합니다.");
				continue;
			}
			return intIn;
		} // end while
	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title = String.format("%s ( %d 이상 )",title,start);
		while (true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start) {
					System.out.printf("입력값은 %d 이상이어야 합니다.",start);
					continue;
				}
			}
			return intIn;
		} // end while
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO Auto-generated method stub
		title = String.format("%s (%d ~ %d 범위)",title,start,end);
		while (true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start|| intIn > end) {
					System.out.printf("입력값은 %d 이상 %d 이하여야 합니다.",start,end);
					continue;
				}
			}
			return intIn;

		} // end while
	}

}
