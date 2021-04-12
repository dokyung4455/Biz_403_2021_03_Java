package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV1 implements ScoreService {
	
	private Scanner scan;
	
	public ScoreServiceV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴 선택
		while(true) {
		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력(input score)");
		System.out.println("2. 성적리스트 출력(print score");
		System.out.println("3. 성적 저장(score save)");
		System.out.println("QUIT. 종료");
		System.out.println("-".repeat(50));
		System.out.print("업무선택 >> ");
		String selec = scan.nextLine();
		if(selec.equals("QUIT")) {
			System.out.println("GOOD BYE");
			return;
		} else if(selec.equals("1")) {
			System.out.println("성적을 입력합니다.");
			this.inputScore();
		} else if(selec.equals("2")) {
			System.out.println("성적리스트를 출력합니다.");
			this.readScore();
		} else if(selec.equals("3")) {
			System.out.println("입력하신 데이터를 저장합니다.");
			this.saveScore();
		} else {
			System.out.println("메뉴를 입력하세요.");
			continue;
		}
		
		} // while end
	} // selectMenu end

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		while(true) {
			
			
		}

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
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
