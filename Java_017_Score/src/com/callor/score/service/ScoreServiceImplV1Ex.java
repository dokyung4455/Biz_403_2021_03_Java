package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.dokyung.standard.InputService;
import com.dokyung.standard.MenuService;
import com.dokyung.standard.impl.InputServiceImplV1;
import com.dokyung.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1 {

	protected MenuService mService;
	protected InputService iService;

	public ScoreServiceImplV1Ex() {
		// TODO Auto-generated constructor stub
		iService = new InputServiceImplV1();

		// MenuServiceImplV1 클래스의 생성자는 두개의 매개변수(아규먼트, 파라메터)를 전달하면서 호출을 해야한다.
		// 첫번째 매개변수는 프로젝트의 title 두번째 매개변수는 업무 리스트를 담을 List형 객체

		// title은 단순 문자열이기 때문에 바로 전달할 수 있는데 List형 객체는 생성 후 데이터를 add 한 후 전달해야 하므로
		// 약간의 추가 연산코드가 필요하다.

		// 이럴때는 생성자 method에서 작성하지 않고 객체를 사용하는 method에서 작성하는 것이 좋다.

	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적정보 등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		mService = new MenuServiceImplV1(title, menuList);
		while (true) {
			Integer num = mService.selectMenu();
			System.out.println("=".repeat(999));
			if (num == 1) {
				this.inputStuInfo();
			} else if (num == 2) {
				this.inputScore();
			} else if (num == 3) {
				this.printScore();
			} else if (num == 4) {
				this.saveScore();
			} else if (num == 5) {
				this.loadScore();
			} else if (num == null) {
				System.out.println("업무종료");
				break;
			}
		}
		
		super.selectMenu();
	}
	// 1번코드
	// 만약 menu 변수의 값이 1일때 코드가 실행되고 코드가 종료되면 또다시 menu값이 2인가, menu값이 3인가를 검사한다.
	/* if(menu == 1){}
	 * if(menu == 2){}
	 * if(menu == 3){}
	 */
	
	// 2번코드
	// 만약 menu 변수의 값이 1이면 코드가 실행되고, 코드가 종료되면 else 이후의 코드는 무시하고 바로 if문이 종료된다.
	// if(menu == 1){
	// }else if(menu == 2){
	// }

	@Override
	public Integer inputScore() {
		// TODO Auto-generated method stub
		return super.inputScore();
	}

}
