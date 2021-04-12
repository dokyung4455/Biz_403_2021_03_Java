package com.callor.app.service.impl;

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

public class ScoreServiceImplV2Ex extends ScoreServiceImplV2 {

	protected MenuService mService;
	protected InputService iService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected Integer[] score;
	protected String[] subject;
	
	// 과목명, 과목점수가 담긴 배열에 대한 위치를 숫자로사용하지않고 명명된 이름을 사용해 선언해둔다.


	public ScoreServiceImplV2Ex() {
		// TODO Auto-generated constructor stub
		iService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		score = new Integer[subject.length];
	}

	
	

}
