package com.dokyung.black;

import com.dokyung.black.service.CardInterface;
import com.dokyung.black.service.CardServiceV1;

public class CardEx_01 {
	
	public static void main(String[] args) {
		
		CardInterface cService = new CardServiceV1();
		
		cService.gameBoard();
	}

}
