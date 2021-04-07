package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreServiceV5 {

	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;

	InputServiceV2 isV2;

	public ScoreServiceV5() {
		// TODO Auto-generated constructor stub
		subject = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		isV2 = new InputServiceV2();
	}

	public void makeScore() {
		Integer score = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < subject.length; i++) {
				score = isV2.inputValue(subject[i], 0, 100);
				if (score == null) {
					System.out.println("업무종료");
					return;
				} else if (subject[i].equals("국어")) {
					kors.add(score);
				} else if (subject[i].equals("영어")) {
					engs.add(score);
				} else if (subject[i].equals("수학")) {
					maths.add(score);
				}
			} // for() end
			System.out.println("추가로 입력하려면 아무키나 입력하세요");
			System.out.println("입력한 점수를 출력하려면 QUIT");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			} else {
				continue;
			}
		} // while{} end
		this.printScore();
	} // makeScore() end

	public void printScore() {
		int sum = 0;
		float avg = 0.0f;
		System.out.print("학번\t국어\t영어\t수학\t총점\t평균\n");
		for (int i = 0; i < kors.size(); i++) {
			Integer kor = kors.get(i);
			Integer eng = engs.get(i);
			Integer math = maths.get(i);
			sum = kor;
			sum += eng;
			sum += math;
			avg = sum / (float) subject.length;
			
			System.out.printf("%d번\t%d점\t%d점\t%d점\t%d점\t%3.2f점\n", i+1,kor,eng,math,sum,avg);
//			System.out.print(kor + "점\t");
//			System.out.print(eng + "점\t");
//			System.out.print(math + "점\t");
//			System.out.print(sum + "점\t");
//			System.out.print(avg + "점\n");
		}
//		float avg = (float)sum / subject.length;

//		for (int i = 0; i < engs.size(); i ++) {
//			Integer eng = engs.get(i);
//			System.out.print(eng+"\n");
//		}
//		for (int i = 0; i < maths.size(); i ++) {
//			Integer math = maths.get(i);
//			System.out.print(math+"\n");
//		}

	} // printScore2() end
	
	public void inputScore() {
		for(int st = 0 ; st < 5 ; st++) {
			Integer[] scores = new Integer[subject.length];
			for(int sb = 0 ; sb < subject.length ; sb++) {
				scores[sb] = isV2.inputValue(subject[sb],0,100);
			}
			// scores에는 한 학생의 국어, 영어, 수학 점수가 저장되어 있다.
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
	}
	public void inputScore1() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int index = 0 ; index <kors.size() ; index++) {
			System.out.println(kors.get(index) + "\t");
			System.out.println(engs.get(index) + "\t");
			System.out.println(maths.get(index) + "\n");
		}
	}

}
