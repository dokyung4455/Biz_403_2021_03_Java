package com.dokyung.black.service;

import java.util.Random;

public class BlackServiceV1 implements BlackInterface{
	protected String dealer;
	protected String player;
	protected String[] pattern;
	protected String[] number;
	protected Random rnd;
	
	public BlackServiceV1() {
		rnd = new Random();
		dealer = null;
		player = null;
		//pattern = new String[] {"스페이드[♠]","하트[♥]","다이아몬드[◆]","클럽[♣]"};
		pattern = new String[] {"스페이드","하트","다이아몬드","클럽"};
		number = new String[] {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		
	}
	

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blackMain() {
		System.out.println("게임을 시작합니다.");
		
		
		
		
	}

	@Override
	public void unOver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void winLose() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void score() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cardDraw() {

		
	}

}
