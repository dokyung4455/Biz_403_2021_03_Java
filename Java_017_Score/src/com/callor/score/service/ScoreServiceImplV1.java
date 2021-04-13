package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.dokyung.standard.MenuService;
import com.dokyung.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	MenuService mService;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적정보 등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		mService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menuList);
		while (true) {
			Integer num = mService.selectMenu();
			if (num == null) {
				System.out.println("업무종료");
				break;
			}
			if (num == 1) {
				this.inputStuInfo();
			} else if (num == 2) {
				this.inputScore();
			} else if (num == 3) {
				this.loadScore();
			} else if (num == 4) {
				this.saveScore();
			} else if (num == 5) {
				this.printScore();
			}

		}
	}

	@Override
	public void inputStuInfo() {
		// TODO Auto-generated method stub
	}

	@Override

	public void inputScore() {
		// TODO Auto-generated method stub
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

}
