package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

/*
 *  1. 메뉴 보여주기
 *  2. 성적 입력하기
 *  	가. 학번
 *  	나. 학생이름 
 *  	다. 과목별 성적
 *  
 *  	가. 학생성적입력 : inputScore() 시작
 *  		- 학번입력
 *  		- 이름입력
 *  		- 점수입력
 *  	나. 학생의 이름을 입력하는 inputName() method는 return type String 형이기 때문에
 *  		학생이름을 입력받고 입력받은 학생이름을 return 한다.
 *  		이 학생의
 */
public class ScoreServiceImplV1 implements ScoreService {
	// 저장소
	protected List<ScoreVO> scoreList;

	// 학번, 점수를 입력받을때 사용할 객체
	protected InputService inService = new InputServiceImplV1();

	// 학생의 이름을 입력받을때 사용할 객체
	protected Scanner scan;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

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
			} else if (str.equals("QUIT")) {
				System.out.println("업무 종료");
				return;
			}
		}
	}

	protected String inputNum() {
		Integer intNum = inService.inputValue("학번", 0, 100);
		if (intNum == null) {
			return null;
		}
		// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001,002)으로 변환을 하자
		String.format("%3d", intNum);

		String strNum = String.format("2021%03d", intNum);
		return strNum;
	}

	@Override
	public void inputScore() {
		// TODO 점수입력코드
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);
		
	}


	

	@Override
	public String inputName(String stu) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(stu + "학생의 이름 입력(QUIT : 입력취소)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해주세요.");
				continue;
			}
			return strName;
		} // while end
			// 또는 이곳에 return null을 넣고 if 조건문내의 return null을 break로 바꿔쓸수있다.
	} // inputName end

	@Override
	public void printScore() {
		// TODO 성적리스트 출력
		System.out.println("=".repeat(50));
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.printf("%s\t", vo.getNum());
			System.out.printf("%s\t", vo.getName());
			System.out.printf("%d\t", vo.getKor());
			System.out.printf("%d\t", vo.getEng());
			System.out.printf("%d\t", vo.getMath());
			System.out.printf("%d\t", vo.getTotal());
			System.out.printf("%3.2f\n", vo.getAvg());

		}
	}

}
