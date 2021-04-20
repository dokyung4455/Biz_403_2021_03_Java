package com.team.blackjack.model;

import java.util.List;

/*
 * 딜러와 플레이어가 하는 기능이 똑같기 때문에
 * Entry 인터페이스 생성
 */
public interface Entry {

	public void receiveCard(CardVO card);
	public List<CardVO> getCard();
}