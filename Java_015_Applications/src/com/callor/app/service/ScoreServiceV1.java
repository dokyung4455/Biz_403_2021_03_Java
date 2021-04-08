package com.callor.app.service;

import com.dokyung.standard.InputService;
import com.dokyung.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {

	public ScoreServiceV1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		InputService isV1 = new InputServiceImplV1();
		String[] subject = new String[] { "국어", "영어", "수학" };
		Integer[] scores = new Integer[subject.length];
		int sum = 0;
		for (int i = 0; i < subject.length; i++) {
			Integer score = isV1.inputValue(subject[i], 0, 100);
			if(score.equals(null)) {
				return;
			}
			scores[i] = score;
			System.out.printf("%s점수 : %d점\n",subject[i],scores[i]);
		}
		sum = scores[0];
		sum += scores[1];
		sum += scores[2];
		float avg = (float)sum / subject.length;
		System.out.printf("총점 : %d점\n",sum);
		System.out.printf("평균 : %3.2f점\n",avg);
	}

}
