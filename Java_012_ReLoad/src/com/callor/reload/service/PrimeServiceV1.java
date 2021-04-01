package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {
	protected Random rnd;
	protected Integer nums;
	
	public PrimeServiceV1() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
	}
	
	public void primeNum() {
		nums = rnd.nextInt(51)+50;
		System.out.print("생성된 난수 : " + nums + "\n");
		int i = 0;
		boolean notPrime = false; // 소수가아니다
		for(i = 2 ; i < nums ; i++) {
			if(nums%i==0) {
				System.out.println(nums + "는(은) " +i+ "로 나누어진다.");
				notPrime = true; // 소수이다
				break;
			}
		}
		// notPrime == true 이면 소수가 아니다.
		// notPrime == false 면 소수이다.
		if(i < nums) {
			System.out.println("고로 " + nums + "는 소수가 아니다.");
		} else {
			System.out.println("고로 " + nums + "는 소수");
		}
		
	}

}
