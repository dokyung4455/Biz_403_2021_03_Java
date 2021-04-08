package com.callor.app;


import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class Test_02 {

	public static void main(String[] args) {
		ScoreService inService = new ScoreServiceImplV1();
		inService.selectMenu();


	} // main() end

}
