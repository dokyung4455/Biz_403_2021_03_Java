package com.dokyung.black.service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dokyung.black.model.CardVO;

public class CardServiceV1 implements CardInterface {

	protected String[] pattern;
	protected String[] number;
	protected List<CardVO> cardList;

	public CardServiceV1() {
		pattern = new String[] { "[♠스페이드♠]", "[♥하트♥]", "[◆다이아몬드◆]", "[♣클럽♣]" };
		number = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
	}

	Scanner scan;

	@Override
	public void cardDraw() {
		while (true) {
			Random rnd = new Random();
			Integer rule1 = rnd.nextInt(4);
			Integer rule2 = rnd.nextInt(13);

			String str1 = pattern[rule1];
			String str2 = number[rule2];

			String card1 = str1 + str2;

			boolean flag = true;
			CardVO vo = null;
			for (int i = 0; i < cardList.size(); i++) {
				vo = cardList.get(i);
				if (card1.equals(vo.getCardDeck())) {
					flag = false;
				}
			}
			if (flag == false) {
				continue;
			}
			vo.setCardDeck(card1);
			cardList.add(vo);
			
			if(cardList.size() == 53) {
				return;
			}
		}

	}

	@Override
	public CardVO unOver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void goStay() {
		// TODO Auto-generated method stub

	}

	@Override
	public CardVO inputScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gameBoard() {
		System.out.println("=".repeat(50));
		System.out.println("BLACK JACK START");
		System.out.println("=".repeat(50));
		System.out.println("딜러와 플레이어에게 카드를 2장씩 Draw 합니다.");
		this.cardDraw();

	}

	@Override
	public void selectMenu() {

		System.out.println("=".repeat(50));
		System.out.println("블랙잭 게임에 오신걸 환영합니다.");
		System.out.println("=".repeat(50));
		System.out.println("1. 게임시작");
		System.out.println("2. 도움말 및 게임룰");
		System.out.println("QUIT. 종료");
		System.out.println("=".repeat(50));
		while (true) {
			System.out.println(">> ");
			String selectMenu = scan.nextLine();
			if (selectMenu.equals("1")) {
				this.gameBoard();
			} else if (selectMenu.equals("2")) {
			} else if (selectMenu.equals("3")) {
			} else if (selectMenu.equals("QUIT")) {
				System.out.println("GOOD BYE");
				return;
			} else {
				System.out.println("메뉴 중 1개를 선택해주세요.");
				continue;
			}
			break;
		}
	}

}
