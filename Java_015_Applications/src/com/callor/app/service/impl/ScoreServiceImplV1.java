package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> scoreList;
	Scanner scan;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void makeNum() {
		// TODO Auto-generated method stub
		String[] subject = new String[] { "국어", "영어", "수학" };
		Integer[] nums = new Integer[subject.length];

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("입력하실 학생의 번호를 입력하세요.(QUIT : 업무종료)");
			System.out.print("001 ~ 999 >>");
			String strNum = scan.nextLine();
			System.out.println("=".repeat(50));
			if (strNum.equals("QUIT")) {
				System.out.println("업무종료");
				return;
			}
			// 학생정보 입력
			String stu = this.inputName(strNum);
			if (stu == null) {
				System.out.println("업무종료");
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setName(stu);
			// 점수입력
			for (int i = 0; i < subject.length; i++) {
				Integer num = this.inputScore(stu, subject[i], 0, 100);
				if (num == null) {
					System.out.println("업무 종료");
					return;
				}
				nums[i] = num;
			}
			scoreVO.setKor(nums[0]);
			scoreVO.setEng(nums[1]);
			scoreVO.setMath(nums[2]);

			scoreList.add(scoreVO);

		} // while end

	}

	@Override
	public String inputName(String stu) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(stu + "번 학생의 이름은 무엇입니까?(QUIT : 업무종료)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			}
		} // while end
	} // inputName end

	
	@Override
	public Integer inputScore(String stu, String sub, int start, int end) {
		// TODO 점수입력코드
		sub = String.format("%s(%d ~ %d 까지)", sub, start, end);
		ScoreVO scoreVO = new ScoreVO();
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(stu + "학생의 " + sub + "점수를 입력하시오.(QUIT : 업무종료)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
				if (intNum > end || intNum < start) {
					System.out.printf("%s ~ %s 까지만 입력 가능합니다.\n", start, end);
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력가능합니다");
				continue;
			}
			System.out.println("=".repeat(50));
			return intNum;
		}


	}

	@Override
	public void printScore() {
		// TODO 성적리스트 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < scoreList.size(); i++) {
			System.out.printf("%s\t", scoreList.get(i).getNum());
			System.out.printf("%s\t", scoreList.get(i).getName());
			System.out.printf("%d\t", scoreList.get(i).getKor());
			System.out.printf("%d\t", scoreList.get(i).getEng());
			System.out.printf("%d\t", scoreList.get(i).getMath());
			System.out.printf("%d\t", scoreList.get(i).getTotal());
			System.out.printf("%3.2f\n", scoreList.get(i).getAvg());

		}
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
			System.out.println("0. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String str = scan.nextLine();
			if (str.equals("1")) {
				this.makeNum();
			} else if (str.equals("2")) {
				this.printScore();
			} else if (str.equals("QUIT")) {
				System.out.println("업무 종료");
				return;
			}
		}
	}

}
