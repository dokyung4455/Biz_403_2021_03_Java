package com.callor.apps;

import com.callor.apps.service.EvenServiceV2;

public class App_06 {

	public static void main(String[] args) {

		EvenServiceV2 eV2 = new EvenServiceV2();
		
		//클래스를 선언하면 자동으로 만들어지는method

		eV2.makeNums();
		eV2.printNums();

	}

}
