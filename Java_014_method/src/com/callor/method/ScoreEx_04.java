package com.callor.method;

import com.callor.method.model.ScoreVO;

public class ScoreEx_04 {

	public ScoreEx_04() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// 변수의 생성
		// stack 메모리에 2개의 저장소를 만들고 각각 100, 200의 정수를 저장해 두어라
		int intNum1 = 100;
		int intNum2 = 200;
		
		// ScoreVO 클래스를 이용한 scoreVO 객체를 생성
		// Heap 메모리에 kor, eng, math ... 등의 값을 저장할 저장소를 만들고 저장소들의 첫번째 주소를
		// stack 메모리에 저장하고 그곳에 scoreVO라는 이름을 붙여라
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(90);
		scoreVO.setEng(90);
		scoreVO.setMath(90);
		
		
		// scoreVO 객체의 kor 변수의 값을 가져와서 intKor 변수에 저장해라
		
		// 1. stack 메모리에 있는 scoreVO 변수를 찾아서
		// 2. scoreVO 변수에 저장된 주소를 읽기
		// 3. 그 주소에 해당하는 Heap메모리를 찾고
		// 4. Heap메모리의 kor 변수에서 값을 읽어서
		// 5. intKor 변수에 저장
		int intKor = scoreVO.getKor();
		
		
	}

}
