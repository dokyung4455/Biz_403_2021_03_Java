package com.dokyung.card.service;

import com.dokyung.card.model.DealerVO;
import com.dokyung.card.model.PlayerVO;

public interface CardService {
	
public void selectMenu();
	public Integer cardDraw();
	public DealerVO dealCost(Integer cost);
	public PlayerVO playCost(Integer cost);
	public Integer goStay();
	public void mainBoard();
	public void dealerRule();
	public Integer unOver();
	public void timeUnit(int second);
	

}
