package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService가 Implements 되어있다 V1을 상속받으면 자동으로 interface도 상속받는다
public class ScoreServiceImplV2A extends ScoreServiceImplV1 {

	@Override
	/*
	 * ScoreList에 성적정보를 추가할때 학번을 입력받을텐데 이미 등록된 학번정보가 있으면 그 학번은 추가하지 못하도록 하는 코드
	 * 
	 * V1의 inputNum() method를 재정의하다
	 * 
	 */
	protected String inputNum() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return null;
		}

		String strNum = String.format("2021%03d", intNum);
		// 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
		int index = 0;
		for (index = 0; index < scoreList.size(); index++) {
			ScoreVO vo = scoreList.get(index);
			if (vo.getNum().equals(strNum)) {
				break;
			}
		}
		if(index < scoreList.size()) {
			System.out.println(strNum + "는 이미 등록되어 있음");
		}
		return null;
	}
}
