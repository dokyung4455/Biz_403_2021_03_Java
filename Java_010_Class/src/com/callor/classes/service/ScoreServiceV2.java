package com.callor.classes.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV2 extends ScoreServiceV1  {
	
	/*
	 * V1에서 protected로 만든 변수는 V2에서 바로 사용가능
	 */

	public ScoreServiceV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		
	}
	
	
	public Integer inputScore(String strNum, String strSub) {
		int intScore = 0;
		while (true) {
			System.out.println(strNum + " 번의" + strSub +" 국어점수를 입력하세요.(stop : -1)");
			System.out.print(">> ");
			intScore = scan.nextInt();
			if (intScore == -1) {
				return null;
			} else if(intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0 ~ 100까지 입력할 수 있습니다.");
				continue;
			}
			break;
		}
		return intScore;
		
		
	}
	public Integer inputScore() {
		
		String[] strSubject = {"국어","영어","수학"};
		Integer[] intScores = new Integer[strSubject.length];
		// scoreList의 데이터 개수를 계싼하여 입력할 학번을 자동으로 생성하기
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		
		for(int i = 0 ; i < strSubject.length ; i++) {
			intScores[i] = this.inputScore(strNum,strSubject[i]);
			if(intScores[i] == null) {
				return null;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];
		scoreList.add(scoreVO);

		return 0;
	} // inputScore()

}
