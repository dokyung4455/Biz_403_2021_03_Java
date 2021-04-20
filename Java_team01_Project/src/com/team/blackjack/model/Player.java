package com.team.blackjack.model;

import java.util.ArrayList;
import java.util.List;

//// Entry 형 플레이어 클래스
public class Player implements Entry {

	 private List<CardVO> card; // 받은 카드 저장소
	 
	 public Player() {
		 card = new ArrayList<CardVO>();
	 }	 
	 
	 @Override
	 public void receiveCard(CardVO card) {
		// TODO 카드 받기
		this.card.add(card);
	 }
	
	 @Override
	public List<CardVO> getCard(){
		// TODO 카드 정보 보여주기
		return card;
	}

	@Override
	public String toString() {
		return card + "";
	}
	 
	 
}