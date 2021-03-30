package com.callor.classes;

import com.callor.classes.service.ValueService;

public class Value_05 {
	
	public static void main(String[] args) {
		
		ValueService vs = new ValueService();
		
		Integer result = 0;
		// retNum 멤버변수를 public으로 선언하면 아래와 같이 간편하게 값을 읽을수있음.
		// Integer result = vs.retNum;
		vs.nums();
		// vs.retNum = 200;

		/*
		 * retNum 변수는 ValueService의 멤버변수이다.
		 * 이 멤버변수를 외부에서 값을 변경하는 것은 코드를 매우 위험스럽게 만드는것이다.
		 * 좋은 방법은 멤버변수를 private로 설정하고 getter() method를 통하영
		 * 읽기 전용으로 하는것이 좋다
		 */
		Integer result1 = vs.getRetNum;
		Integer result2 = vs.numsRet();
	}

}
