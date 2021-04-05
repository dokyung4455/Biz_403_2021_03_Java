package com.callor.method.service;

public class NumberServiceV6 {

	protected InputService inService;

	public NumberServiceV6() {
		// TODO Auto-generated constructor stub
		inService = new InputService();
	}

	public Integer inputNum() {

		while (true) {
			Integer retNum = inService.inputValue("정수(0 ~ 100)");
			if (retNum == null) {
				return null;
			} else if (retNum < 0 || retNum > 100) {
				System.out.println("정수 0 ~ 100까지 입력");
				continue;
			} else {
				return retNum;
			}
		}

	}

}
