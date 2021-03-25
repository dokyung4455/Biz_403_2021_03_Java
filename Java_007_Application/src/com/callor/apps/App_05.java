package com.callor.apps;

import com.callor.apps.service.EvenServiceV1;

public class App_05 {

	public static void main(String[] args) {

		EvenServiceV1 eV1 = new EvenServiceV1();
		
		//클래스를 선언하면 자동으로 만들어지는method

		eV1.makeNums();
		eV1.printNums();

	}

}
