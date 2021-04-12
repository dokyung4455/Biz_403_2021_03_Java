package com.callor.app.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.service.Values;
import com.dokyung.standard.InputService;
import com.dokyung.standard.MenuService;
import com.dokyung.standard.impl.InputServiceImplV1;
import com.dokyung.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService mService;
	protected InputService iService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected Integer[] score;
	protected String[] subject;

	// 과목명, 과목점수가 담긴 배열에 대한 위치를 숫자로사용하지않고 명명된 이름을 사용해 선언해둔다.

	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub
		iService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		score = new Integer[subject.length];
	}

	@Override
	public void selectMenu() {

		// 보통 멤버변수(클래스역역에서 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는것이 좋다.
		// 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을 경우는
		// 객체를 사용하기 전에 객체를
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");

		mService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				System.out.println("GOOD BYE");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, List 에 추가
		// = ScoreVO 클래스를 사용하여 생성한 객체 scoreVO에 담고
		Integer intNum = iService.inputValue("학번", 1);
		if (intNum == null) {
			System.out.println("메뉴로 이동합니다.");
			return;
		}
		String strNum = String.format("%03d", intNum);

		String strName = "";
		while (true) { // 이름 입력
			System.out.println("이름을 입력하세요.");
			System.out.print("이름 입력 >> ");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				System.out.println("메뉴로 이동합니다.");
				return;
			} else if (strName.equals("")) {
				System.out.println("학생의 이름을 입력하세요.");
				continue;
			}
			break;
		}

		while (true) {
			// TODO 과목점수 반복문
			boolean flag = true;
			System.out.println("성적을 입력하세요.");
			for (int i = 0; i < subject.length; i++) {
				Integer intScore = iService.inputValue(subject[i], 0, 100);
				if (intScore == null) {
					flag = false;
					return;
				} // if end
				score[i] = intScore;
			} // for end
			if (flag == false) {
				continue;
			}

			// 담는곳
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setName(strName);
			scoreVO.setKor(score[Values.국어]);
			scoreVO.setEng(score[Values.영어]);
			scoreVO.setMath(score[Values.수학]);

			// 디버깅 코드, VO에 담긴 데이터 확인하기
			System.out.println("=".repeat(50));
			System.out.println(scoreVO.toString());
			System.out.println("=".repeat(50));
			scoreList.add(scoreVO);
			break;
		} // while end

	} // input Score end

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
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
		System.out.println("=".repeat(50));
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		String strFileName = "";
		while (true) {
			System.out.println("성적리스트를 저장합니다.");
			System.out.println("저장할 file이름을 입력하세요.");
			System.out.print(">> ");
			strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("file 이름을 입력합니다.");
				continue;
			}

			FileWriter fileWriter = null;
			PrintWriter out = null;

			strFileName = "src/com/callor/app/" + strFileName + ".txt";

			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				/*
				 * 파일에 저장할때 각데이터를 컴파(,)로 구분하여 입력하고 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다.
				 * 
				 * csv : comma-separated-variable
				 * 컴마로 값을 구분한 파일
				 */
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.print(vo.getMath() + ",");
					out.print(vo.getTotal() + ",");
					out.printf("%3.2f\n",vo.getAvg());
				}
				
				out.flush();
				out.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;

		}

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
