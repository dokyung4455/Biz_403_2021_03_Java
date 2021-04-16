package com.dokyung.black.service;

import com.dokyung.black.model.CardVO;

public interface CardInterface {
	
	public void cardDraw();
	public CardVO unOver();
	public void goStay();
	public CardVO inputScore();
	public void selectMenu();
	public void gameBoard();

}
