package com.callor.classes.service;

public class ScoreServiceV3 extends ScoreServiceV2 {
	
	public ScoreServiceV3() {
		while(true) {
			
		System.out.println(Lines.dLine(50));
		System.out.println("빛나지마라 고등학교 성적 시스템 v1");
		System.out.println(Lines.sLine(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("0. 업무종료  ");
		System.out.println(Lines.sLine(50));
		System.out.println("업무선택 >> ");
		int intMenu = scan.nextInt();
		if(intMenu == 1) {
			//성적입력
			this.inputScore();
		} else if(intMenu ==2) {
			this.printScore();
		}else if(intMenu ==0) {
			System.out.println("퇴근이다!");
		return;	
		
		}
		
		}
	}
	

}
