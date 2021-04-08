package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

public class ScoreEx_02 {

	public ScoreEx_02() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		InputService inService = new InputServiceImplV1();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(inService.inputValue("국어",0,100));
		scoreVO.setEng(inService.inputValue("영어",0,100));
		scoreVO.setMath(inService.inputValue("수학",0,100));
		scoreList.add(scoreVO);
		
		
		// VO객체에 데이터를 저장하고 List에 추가하려고 하면 먼저 VO객체를 다시 생성해야함
		 
		
		scoreVO = new ScoreVO(); // 매우매우 중요
		scoreVO.setNum("002");
		scoreVO.setName("성춘향");
		scoreVO.setKor(inService.inputValue("국어",0,100));
		scoreVO.setEng(inService.inputValue("영어",0,100));
		scoreVO.setMath(inService.inputValue("수학",0,100));
		scoreList.add(scoreVO);
		
		System.out.println(scoreVO.toString());
		System.out.println(scoreList.toString());
		
	}

}
