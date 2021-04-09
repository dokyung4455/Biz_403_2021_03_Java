package com.callor.app.service.impl;

public class ScoreServiceImplV3 extends ScoreServiceImplV2A {

	@Override
	public void selectMenu() {
		// TODO 메뉴입력란
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("무등산 학교 성적입력기");
			System.out.println("-".repeat(50));
			System.out.println("1. 성적입력하기");
			System.out.println("2. 리스트 출력하기");
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String str = scan.nextLine();
			if (str.equals("1")) {
				this.inputScore();
			} else if (str.equals("2")) {
				this.printScore();
			}else if(str.equals("3")) {
				
				
				System.out.println("업무종료");
			} else if (str.equals("QUIT")) {
				System.out.println("업무 종료");
				return;
			}
		}
	}
	protected void scoreToFile() {
		
	}



}
