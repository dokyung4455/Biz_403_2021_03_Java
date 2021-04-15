package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService iService;
	protected StudentService stService;
	protected final Integer 국어 = 0;
	protected final Integer 영어 = 1;
	protected final Integer 수학 = 2;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreService.ScoreVO>();
		iService = new InputServiceImplV1();
		stService = new StudentServiceImplV1();
	}
	
	protected ScoreVO numCheck(String num) {
		for(ScoreVO vo : scoreList) {
			if(num.equals(vo.getNum())) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void insertScore() {
		String subject[] = new String[] { "국어", "영어", "수학" };
		Integer student[] = new Integer[subject.length];
		while (true) {
			
			// 1번 방법
			int num = iService.inputValue("학번", 1);
			String str = String.format("%05d", num);
			
			boolean flag = true;
			for(ScoreVO vo : scoreList) {
				String strNum = vo.getNum();
				if(str.equals(strNum)) {
					flag = false;
					break;
				}
			}
			if(flag == false) {
				System.out.println("이미 같은 학번이 존재합니다.");
				System.out.println("다시 입력하세요.");
				continue;
			}
			// 2번 방법
//			String strNum = null;
//			while(true) {
//				Integer intNum = iService.inputValue("학번",1);
//				if(intNum == null) {
//					return;
//				}
//				strNum = String.format("%05d", intNum);
//				
//				ScoreVO scoreVO = this.numCheck(strNum);
//				if(scoreVO == null) {
//					break;
//				}
//			}
			
			// 학생 정보에 등록된 학번인가를 검사하기
			StudentVO stVO = stService.getStudent(str);
			if(stVO == null) {
				System.out.println("학적부에 없는 학생입니다.");
				System.out.println("학번을 입력 해주세요.");
				continue;
			} 
			// 여기 도달하면 학적부에 있는 학번이다.
			System.out.println("=".repeat(30));
			System.out.printf("학번 : %s\n", stVO.getNum());
			System.out.printf("이름 : %s\n", stVO.getName());
			System.out.printf("학과 : %s\n", stVO.getDept());
			System.out.printf("학년 : %s\n", stVO.getGrade());
			System.out.printf("주소 : %s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까?");
			System.out.println("네 : enter / 틀리면 : no");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if(yesNo.equals("no")) {
				continue;
			}

			
			
			for (int i = 0; i < subject.length; i++) {
				int score = iService.inputValue(subject[i], 0, 100);
				student[i] = score;
			}
			ScoreVO vo = new ScoreVO();
			vo.setNum(str);
			vo.setKor(student[국어]);
			vo.setEng(student[영어]);
			vo.setMath(student[수학]);

			scoreList.add(vo);
			
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++) {
			System.out.println(scoreList.get(i).toString());
			}
			System.out.println("추가로 입력하시겠습니까?");
			System.out.println("1. 추가입력");
			System.out.println("2. 출력");
			System.out.println("QUIT. 종료");
			String str1 = scan.nextLine();
			if(str1.equals("1")) {
				continue;
			} else if(str1.equals("2")) {
				this.printStudent();
			}
					
			
			
			return;
		}

	}

	@Override
	public void loadScore() {

	}

	@Override
	public void printStudent() {
		
		System.out.println("학번\t이름\t학과\t학년\t주소\t\t\t국어\t영어\t수학\t총점\t평균");
		for(ScoreVO vo : scoreList) {
			StudentVO stVO = stService.getStudent(vo.getNum());
			
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n"
					,vo.getNum(),stVO.getName(),stVO.getDept(),stVO.getGrade(),stVO.getAddress(),vo.getKor(),vo.getEng(),vo.getMath(),vo.getTotal(),vo.getAvg());
		}

	}

	@Override
	public void printScore() {
		
	}

}
