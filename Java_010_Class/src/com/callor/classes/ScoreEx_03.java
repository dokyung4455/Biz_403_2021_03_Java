package com.callor.classes;

import com.callor.classes.service.ScoreServiceV3;

/* V2까지는 학생의 성적을 입력받다가 중단을 하면 리스트를 보여주는 형싱이었다
 * V3에서는 업무를 선택할 수 있는 Menu를 보여주고 선택된 Menu에 따라
 * 업무를 진행하도록 Upgrade
 * =====================
 * 빛나라 고교 성적시스템 V1
 * 
 * 
 */

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreServiceV3 ssV3 = new ScoreServiceV3();
		ssV3.inputScore();
	}

}
