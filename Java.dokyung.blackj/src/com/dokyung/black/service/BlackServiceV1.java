package com.dokyung.black.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dokyung.black.model.BlackVO;

public class BlackServiceV1 implements BlackInterface {
	protected String dealer;
	protected String player;
	protected String[] pattern;
	protected String[] number;
	protected Random rnd;
	protected List<BlackVO> cardList;
	protected List<BlackVO> scoreList;
	protected Scanner scan;
	protected final int 플레이어 = 1;
	protected final int 딜러 = 2;

	public BlackServiceV1() {
		rnd = new Random();
		dealer = null;
		player = null;
		cardList = new LinkedList<BlackVO>();
		scoreList = new LinkedList<BlackVO>();
		pattern = new String[] { "스페이드[♠]", "하트[♥]", "다이아몬드[◆]", "클럽[♣]" };
		number = new String[] { "[A]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]", "[10]", "[K]", "[Q]",
				"[J]" };
		scan = new Scanner(System.in);

	}

	/*
	 * @Override public void selectMenu() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	// 매개변수에 1을 전달하면 플레이어 데이터 2를 전달하면 딜러 데이터 저장
	@Override
	public void blackMain() {
		int turn = 0;
		System.out.println("=".repeat(60));
		System.out.println("Black Jack 게임을 시작합니다.");
		System.out.println("=".repeat(60));

		//for (int i = 0; i < 2; i++) { // 딜러 카드 지급
			//System.out.println((i + 1) + "번째 카드를 뽑습니다.");
			turn = this.cardDraw(딜러);
			this.score(turn, 딜러);
			turn = this.cardDraw(딜러);
			this.score(turn, 딜러);
		//}
		System.out.println("-".repeat(60));
		System.out.println("딜러가 카드를 받았습니다.");
		System.out.println("-".repeat(60));
		//for (int i = 0; i < 2; i++) { // 플레이어 카드 지급
			//System.out.println((i + 1) + "번째 카드를 뽑습니다.");
			turn = this.cardDraw(플레이어);
			this.score(turn, 플레이어);
		//}
		System.out.println("-".repeat(60));
		System.out.println("당신이 카드를 받았습니다.");
		System.out.println("=".repeat(60));
		System.out.println("현재 당신이 가진 카드는");
		System.out.println("=".repeat(60));
		for (int j = 0; j < cardList.size(); j++) { // 플레이어 카드 체크
			BlackVO vo = cardList.get(j);
			//if (vo.getPlayerCard() != null) {
				System.out.println(vo.getPlayerCard());
			//}
		}

		Integer rule1 = 0;
		Integer rule2 = 0;
		while (true) {
			rule1 = this.goStay();
			if (rule1==1) {
				System.out.println("카드를 한장 더 받습니다.");
				int num = this.cardDraw(플레이어);
				this.score(num, 플레이어);
				System.out.println("현재 당신이 가진 카드는");
				for (int j = 0; j < cardList.size(); j++) { // 보유카드 출력
					BlackVO vo = cardList.get(j);
					//if (vo.getPlayerCard() != null) { // 카드안에 null값은 출력안함
						System.out.println(vo.getPlayerCard());
						System.out.println(vo.getPlayerScore());
					//}
				}
				rule2 = this.unOver(1); // 21 이상 규칙 체크
					break;
				} else if (rule1 == null) {
					return;
				}
			}
		
		
		
		
		
		
		
		
		
			if (rule2 == null) { // 플레이어 패배
				return;
			}
			if (rule2 == 1) { // 게임 계속 진행

			}

	}

	@Override
	public Integer goStay() {
		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("카드를 추가로 받으시려면 (1) 스탑하시려면 (0)를 입력하세요.");
			System.out.println("한장 더 받으시겠습니까?");
			System.out.print(">> ");
			String stay = scan.nextLine();
			try {

			} catch (Exception e) {
				System.out.println("1,0을 입력하세요.");
				continue;
			}
			if (stay.equals("0")) {
				return 0;
			}
			return 1;
		}

	}

	@Override
	public Integer unOver(int num4) {
		int sum = 0;
		if (num4 == 플레이어) {
			for (int i = 0; i < scoreList.size(); i++) {
				BlackVO vo = scoreList.get(i);
			}
			if (sum > 21) {
				System.out.println("PLAYER LOSE");
				return null;
			}
		} else if (num4 == 딜러) {
			for (int i = 0; i < scoreList.size(); i++) {
				BlackVO vo = scoreList.get(i);
			}
			if (sum > 21) {
				System.out.println("DEALER LOSE");
				return null;
			}
		}
		return 1;
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
	public Integer cardDraw(int num3) {
		while (true) {
			int pat = rnd.nextInt(4);
			int num = rnd.nextInt(13);

			String str1 = pattern[pat];
			String str2 = number[num];

			String Card1 = str1 + str2;

			boolean flag = false;
			BlackVO vo = null;
			if (num3 == 2) {
				for (int i = 0; i < cardList.size(); i++) {
					 vo = cardList.get(i);
					String Card2 = vo.getDealerCard() + vo.getPlayerCard();
					if (Card1 == Card2) {
						flag = true;
					}
				} // dealer for end
				if (flag == true) {
					continue;
				}
				vo = new BlackVO();
				vo.setDealerCard(Card1);
			} else if (num3 == 1) {
				for (int i = 0; i < cardList.size(); i++) {
					vo = cardList.get(i);
					String Card2 = vo.getDealerCard() + vo.getPlayerCard();
					if (Card1 == Card2) {
						flag = true;
					}
				} // player for end
				if (flag == true) {
					continue;
				}
				vo = new BlackVO();
				vo.setPlayerCard(Card1);
				
			} // else if end
			cardList.add(vo);
			return num;
		} // while end

	}
}
