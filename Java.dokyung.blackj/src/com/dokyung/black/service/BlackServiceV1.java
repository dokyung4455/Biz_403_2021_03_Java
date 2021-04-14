package com.dokyung.black.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.dokyung.black.model.BlackVO;

public class BlackServiceV1 implements BlackInterface {
	protected String dealer;
	protected String player;
	protected String[] pattern;
	protected String[] number;
	protected Random rnd;
	protected List<BlackVO> cardList;
	protected List<BlackVO> scoreList;

	public BlackServiceV1() {
		rnd = new Random();
		dealer = null;
		player = null;
		cardList = new LinkedList<BlackVO>();
		scoreList = new LinkedList<BlackVO>();
		pattern = new String[] { "스페이드[♠]", "하트[♥]", "다이아몬드[◆]", "클럽[♣]" };
		number = new String[] { "[A]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]", "[10]", "[K]", "[Q]",
				"[J]" };

	}

	/*
	 * @Override public void selectMenu() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	@Override
	public void blackMain() {
		int turn = 0;
		System.out.println("게임을 시작합니다.");

		for (int i = 0; i < 2; i++) { // 딜러 패 지급
			System.out.println((i+1) +"번째 카드를 뽑습니다.");
			turn = this.cardDraw();
			this.score(turn, 2);
		}
//		for(int j = 0 ; j < scoreList.size(); j ++) {
//		BlackVO vo1 = scoreList.get(j);
//		BlackVO vo2 = cardList.get(j);
//		System.out.println(vo2.getDealerCard());
//		System.out.println(vo1.getDealerScore());
//		}
		System.out.println("딜러가 패를 받았습니다.");
		for (int i = 0; i < 2; i++) { // 딜러 패 지급
		System.out.println((i+1) +"번째 카드를 뽑습니다.");
		turn = this.cardDraw();
		this.score(turn, 1);
		}
		System.out.println("카드를 받았습니다.");

		System.out.println("한장 더 받으시겠습니까?");

	}

	@Override
	public Integer unOver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String winLose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void score(int num1, int num2) {
		Integer score = 0;
		Integer[] scores = new Integer[2];
		if (num1 == 0) {
			score = 1;
		} else if (num1 >= 10) {
			score = 10;
		} else {
			score = num1 + 1;
		}
		BlackVO vo = new BlackVO();
		if (num2 == 1) { // 플레이어 점수
			scores[0] = score;
			vo.setPlayerScore(scores[0]);

		} else if (num2 == 2) { // 딜러 점수
			scores[1] = score;
			vo.setDealerScore(scores[1]);
		}
		scoreList.add(vo);

		return;
	}

	@Override
	public Integer cardDraw() {
		while (true) {
			int pat = rnd.nextInt(4);
			int num = rnd.nextInt(13);

			String str1 = pattern[pat];
			String str2 = number[num];

			String dealerCard1 = str1 + str2;

			boolean flag = false;
			for (int i = 0; i < cardList.size(); i++) {
				BlackVO vo = cardList.get(i);
				String dealerCard2 = vo.getDealerCard();
				if (dealerCard1 == dealerCard2) {
					flag = true;
				}
			}
			// Integer score = Integer.valueOf(str2);
			if (flag == true) {
				continue;
			}
			BlackVO vo = new BlackVO();
			vo.setDealerCard(dealerCard1);
			cardList.add(vo);
			return num;
		}
	}
}
