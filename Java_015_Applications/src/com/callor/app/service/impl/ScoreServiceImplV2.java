package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 implements 되어있기 때문에 V1을 상속받으면 자동으로 인터페이스도 받는다
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 
	 */
	protected String inputNum() {
		Integer intNum = null;
		String strNum = "";
		while (true) {
			intNum = inService.inputValue("학번", 0, 999);
			if (intNum == null) {
				return null;
			}
			Boolean flag = true;
			// Integer num2 = 1;
			strNum = String.format("%03d번 ", intNum);
			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (strNum.equals(vo.getNum())) {
					flag = false;
				}
			}
			if (flag == false) {
				System.out.println("같은 학번이 존재합니다. 다시입력하세요.");
				continue;
			}
			break;
		}
		// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001,002)으로 변환을 하자
		return strNum;
	}

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
			Integer num2 = 1;
			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				String strNum1 = (String) vo.getName();
				if (strNum1.equals(strName)) {
					num2 = 0;
				}
			}
			if (num2 == 0) {
				System.out.println("같은 이름이 존재합니다. 다시입력하세요.");
				continue;
			}
			return strName;
		} // while end
			// 또는 이곳에 return null을 넣고 if 조건문내의 return null을 break로 바꿔쓸수있다.
	} // inputName end

	public void inputScore() {
		// TODO 점수입력코드
		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
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

}
