package com.callor.method;

import com.callor.method.service.NumberServiceV6;

public class Method_08 {
	
	public static void main(String[] args) {
		
		NumberServiceV6 nsV6 = new NumberServiceV6();
		
		Integer retNum = nsV6.inputNum();
		System.out.println("입력한 값 : " + retNum);
	}

}
