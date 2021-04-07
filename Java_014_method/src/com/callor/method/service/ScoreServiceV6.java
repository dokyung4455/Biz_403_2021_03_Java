package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

// 데이터를 입력(키보드, Random, 파일, 인터넷) = VO에 담고
// 입력된 데이터를 List에 추가
// 연산을 수행하고
// 다시 List 저장 
// 데이터를 읽어 List에서 추출하여 VO에 담고
// 출력
public class ScoreServiceV6 {
	
	// final 키워드를 부착한 변수 = 상수
	// 상수 = 한번 저장된 값을 변경할 수 없는 특별한 변수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected String[] subject;
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 isV2;

	public ScoreServiceV6() {
		// TODO Auto-generated constructor stub
		subject = new String[] { "국어", "영어", "수학" };
		scoreList = new ArrayList<ScoreVO>();
		isV2 = new InputServiceV2();
	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			Integer[] scores = new Integer[subject.length];
			for (int sb = 0; sb < subject.length; sb++) {
				scores[sb] = isV2.inputValue(subject[sb], 0, 100);
				if (scores[sb] == null) {
					return;
				}
			}
			ScoreVO scoreVO = new ScoreVO();
			int sbIndex = 0;
			scoreVO.setKor(scores[국어]);
			scoreVO.setEng(scores[영어]);
			scoreVO.setMath(scores[수학]);
			scoreList.add(scoreVO);

		}
		this.printScore();

	}

	public void inputScore1() {

		for (int st = 0; st < 5; st++) {
			Integer intKor = isV2.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = isV2.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = isV2.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
		}
		this.printScore1();
		;
	}

//	public void inputScore() {
//
//		for (int i = 0; i < 5; i++) {
//			ScoreVO scoreVO = new ScoreVO();
//			Integer[] scores = new Integer[i];
//			for (int j = 0; j < subject.length; j++) {
//				Integer score = isV2.inputValue(subject[j], 0, 100);
//				if (score == null) {
//					return;
//				}
//			}
//		
//		
//			scoreList.add(scoreVO);
//		}
//		this.printScore();
//	}
//
	public void printScore() {
		System.out.println("국어\t영어\t수학");
		for (int i = 0; i < scoreList.size(); i++) {
			Integer kor = scoreList.get(i).getKor();
			Integer eng = scoreList.get(i).getEng();
			Integer math = scoreList.get(i).getMath();
			System.out.printf(kor + "점\t");
			System.out.printf(eng + "점\t");
			System.out.printf(math + "점\n");
		}

	}
	
	public void printScore1() {
		int nSize = scoreList.size();
		
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.println(subject[i] + "\t");
		}
		
		System.out.println();
		System.out.println("-".repeat(50));
		for(int i = 0 ; i<nSize ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.println(scoreVO.getKor() + "\t");
			System.out.println(scoreVO.getEng() + "\t");
			System.out.println(scoreVO.getMath() + "\n");
		}
	}

}
