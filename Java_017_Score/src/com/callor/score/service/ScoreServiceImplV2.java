package com.callor.score.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.vo.ScoreVO;
import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	protected Scanner scan;
	protected InputService iService;
	protected List<ScoreVO> scoreList;

	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		iService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputStuInfo() {

	}

	@Override
	public void inputScore() {
		String[] subject = new String[] { "국어", "영어", "수학" };
		Integer[] subScore = new Integer[subject.length];

		// 번호입력 시작
		Integer intNum = iService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("%03d", intNum);
		// 번호입력 끝

		// 이름입력 시작
		String strName = null;
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("학생 이름을 입력하세요.(QUIT:업무종료)");
			System.out.print(">> ");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름을 입력하세요.");
				continue;
			}
			break;
		}
		// 이름입력 끝

		System.out.println("=".repeat(50));

		// 성적입력 시작
		Integer intScore = null;
		while (true) {
			for (int i = 0; i < subject.length; i++) {
				intScore = iService.inputValue(subject[i], 0, 100);

				subScore[i] = intScore;
			}
			if (intScore == null) {
				return;
			}
			// 성적입력 끝

			// 데이터 저장 시작
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setName(strName);
			scoreVO.setKor(subScore[0]);
			scoreVO.setEng(subScore[1]);
			scoreVO.setMath(subScore[2]);
			scoreList.add(scoreVO);
			// 데이터 저장 끝
			break;
		}

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(50));
		super.printScore();
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		String fileName = null;
		while (true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력하셔야 합니다.");
				continue;
			}
			break;
		}

		String strFileName = "src/com/callor/score/" + fileName;

		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f/n", vo.getAvg());

			}
			
			out.flush();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
		}

	}

}
