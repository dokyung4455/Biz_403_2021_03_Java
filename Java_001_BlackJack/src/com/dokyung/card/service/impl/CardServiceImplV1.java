package com.dokyung.card.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.dokyung.card.model.DealerVO;
import com.dokyung.card.model.PlayerVO;
import com.dokyung.card.service.CardService;

public class CardServiceImplV1 implements CardService {

	protected final Integer 플레이어 = 1;
	protected final Integer 딜러 = 2;
	protected Random rnd;
	protected Scanner scan;
	protected String[] pattern;
	protected String[] number;
	protected String blackCard;
	protected List<DealerVO> dealerList;
	protected List<PlayerVO> playerList;

	public CardServiceImplV1() {
		rnd = new Random();
		scan = new Scanner(System.in);
		
		pattern = new String[] { "[♠] 스페이드 -", "[♥] 하트 -", "[◆] 다이아몬드 -", "[♣]클럽 -" };
		number = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
		blackCard = "";
	}
	
	@Override
	public void mainBoard() { // 게임 진행 보드
		dealerList = new ArrayList<DealerVO>();
		playerList = new ArrayList<PlayerVO>();
		while (true) {
			System.out.println("블랙잭 게임을 시작합니다.");
			this.timeUnit(1);
			Integer cost = 0;
			for (int i = 0; i < 2; i++) {
				cost = this.cardDraw();
				this.dealCost(cost);
			}
			for (int i = 0; i < 2; i++) {
				cost = this.cardDraw();
				this.playCost(cost);
			}
			System.out.println("카드 배분이 끝났습니다.");
			this.timeUnit(1);

			while (true) {
				System.out.println("현재 플레이어의 카드는");
				Integer pCost = this.unOver(); // 현재가진 카드 출력 및 점수계산
				if (pCost > 21) {
					System.out.println("21점이 넘어 플레이어 패배!");
					return;
				}
				int num = this.goStay(); // 고&스테이 선택
				if (num == 1) {
					continue;
				} else if (num == 2) {
					break;
				}
			} // while end
			this.dealerRule();
			
//			System.out.println("다시하려면 다시하기/ 그만하시려면 종료를 입력하세요");
//			String str = scan.nextLine();
//			if (str.equals("다시하기")) {
//				continue;
//			} else if (str.equals("종료")) {
//				return;
//			}
			break;

		}
	}

	@Override
	public Integer cardDraw() { // 카드 뽑기 메소드
		int num1 = 0;
		int num2 = 0;
		while (true) {
			num1 = rnd.nextInt(4); // 문양 랜덤 값
			num2 = rnd.nextInt(13); // 넘버 랜덤 값
			String strCard1 = pattern[num1];
			String strCard2 = number[num2]; // 각 배열에 배열만큼의 랜덤한 정수를 넣어 strCard에 담는다.
			String card = strCard1 + strCard2; // 두개의 문자열을 랜덤으로 꺼내서 한장의 랜덤한 카드를 만든다.

			boolean bYes = true;
			for (int i = 0; i < dealerList.size(); i++) {
				DealerVO dVO = dealerList.get(i);
				String dCard = dVO.getCard();
				if (card.equals(dCard)) {
					bYes = false;
				}
			}

			for (int i = 0; i < playerList.size(); i++) {
				PlayerVO pVO = playerList.get(i);
				String pCard = pVO.getCard();
				if (card.equals(pCard)) {
					bYes = false;
				}
			}

			if (bYes == false) {
				continue;
			}
			blackCard = card;
			break;

		}

		return num2;
	}
	
	
	@Override
	public Integer unOver() {
		Integer nScore = 0;
		for (int i = 0; i < playerList.size(); i++) {
			this.timeUnit(1);
			PlayerVO pVO = playerList.get(i);
			System.out.println(pVO.getCard());
			nScore += pVO.getScore();
		}
		System.out.println("총 " + nScore + "점 입니다.");
		return nScore;
	}

	
	@Override
	public Integer goStay() {
		System.out.println("카드를 한장더 받으시려면 1번, 그만 받으시려면 2번을 입력하세요.");
		while (true) {
			System.out.print("1 or 2  >> ");
			String goStay = scan.nextLine();
			Integer cost = 0;

			if (goStay.equals("1")) {
				cost = this.cardDraw();
				this.playCost(cost);
				return 1;
			} else if (goStay.equals("2")) {
				return 2;
			} else {
				System.out.println("1 또는 2만 입력 가능합니다. 다시 입력하세요.");
				continue;
			}
		}
	}

	@Override
	public void selectMenu() {
		
		while(true) {
		System.out.println("1. 게임시작");
		System.out.println("2. 도움말");
		System.out.println("QUIT. 종료");
		String selectMenu = scan.nextLine();
		if(selectMenu.equals("1")) {
			this.mainBoard();
		}
		if(selectMenu.equals("QUIT")) {
			return;
		}
		}
		

	}

	
	@Override
	public void dealerRule() {
		Integer dScore = 0;
		while (true) {
			dScore = 0;
			this.timeUnit(1);
			System.out.println("딜러가 패를 오픈합니다.");
			for (int i = 0; i < dealerList.size(); i++) {
				this.timeUnit(1);
				DealerVO dVO = dealerList.get(i);
				System.out.println(dVO.getCard());
				dScore += dVO.getScore();
			}
			System.out.println("총 " + dScore + "점 입니다.");
			if (dScore < 17) {
				System.out.println("딜러의 카드점수가 16점 이하로 카드를 한장 더받습니다.");
				Integer cost = this.cardDraw();
				this.dealCost(cost);
				continue;
			} else if (dScore > 21) {
				System.out.println("딜러의 카드점수가 21점을 초과했습니다.");
				System.out.println("PLAYER WIN!");
				return;
			}
			break;
		}
		System.out.println("플레이어의 보유카드와 점수는");
		Integer pScore = this.unOver();
		if (pScore > dScore) {
			System.out.println("PLAYER WIN!");
		} else if (dScore > pScore) {
			System.out.println("PLAYER LOSE .. ");
		}
		return;

	}

	
	@Override
	public DealerVO dealCost(Integer cost) {
		Integer score = 0;
		if (cost == 0) {
			score = 1;
		} else if (cost >= 10) {
			score = 10;
		} else {
			score = cost + 1;
		}
		DealerVO vo = new DealerVO();
		vo.setScore(score);
		vo.setCard(blackCard);
		dealerList.add(vo);
		return vo;
	}

	
	@Override
	public PlayerVO playCost(Integer cost) {
		Integer score = 0;
		if (cost == 0) {
			score = 1;
		} else if (cost >= 10) {
			score = 10;
		} else {
			score = cost + 1;
		}
		PlayerVO vo = new PlayerVO();
		vo.setScore(score);
		vo.setCard(blackCard);
		playerList.add(vo);
		return vo;
	}

	@Override
	public void timeUnit(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
