package com.dokyung.card;

import com.dokyung.card.service.CardService;
import com.dokyung.card.service.impl.CardServiceImplV1;

public class CardEx_01 {

	public static void main(String[] args) {

		CardService cService = new CardServiceImplV1();
	
	cService.selectMenu();
	}

}
