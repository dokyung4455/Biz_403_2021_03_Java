package com.callor.app;

import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public InputEx_01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
	}

}
