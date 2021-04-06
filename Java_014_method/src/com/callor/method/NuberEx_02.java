package com.callor.method;

import com.callor.method.service.InputServiceV1;

public class NuberEx_02 {
	public static void main(String[] args) {
		
		InputServiceV1 inService = new InputServiceV1();
		
		// inService.InputValue("쌔우깡");
		inService.InputValue("쌔우깡",0,100);
		

	}

}