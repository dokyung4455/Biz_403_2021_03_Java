package com.callor.word;

import com.callor.word.service.impl.WordServiceImplV1;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		WordServiceImplV1 wService = new WordServiceImplV1();
		
		wService.startGame();
	}

}
