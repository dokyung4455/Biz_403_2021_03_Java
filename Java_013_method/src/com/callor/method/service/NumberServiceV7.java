package com.callor.method.service;

public class NumberServiceV7 {
	String[] strCla;
	InputService ips;

	public NumberServiceV7() {
		// TODO Auto-generated constructor stub
		strCla = new String[] { "국어", "영어", "수학", "과학", "국사" };
		ips = new InputService();
	}

	public void inputScore() {
		
		for (int i = 0; i < strCla.length; i++) {
			Integer value = null;	
			while (true) {
				value = ips.inputValue(strCla[i]);
				if(value == null) {
					return;
				} else if (value < 0 || value > 100) {
					System.out.println("[error]0 ~ 100까지만 입력 가능합니다.");
					continue;
				}
				break;
			}
		
		}
	}
}
