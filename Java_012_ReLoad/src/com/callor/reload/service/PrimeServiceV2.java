package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1{
	
	// protected로 선언된 객체, 변수는 자동으로 생성되어 상속 받은곳에서 사용할 수 있다.
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51)+50;
		
		// flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false;
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0) {
				notPrime = true;
				break;
				}
		}
		// flag 상태에 따라 소수, 소수가 아님을 출력
		// notPrime 자체에 true 또는 false를 담고있다
		// notPrime = true;
		// if(notPrime) 이 if notPrime이 true 면 실행하라
		if(notPrime == true) {
			System.out.println(rndNum + "는 소수가 아님");
		} else if(notPrime == false) {
			System.out.println(rndNum + "는 소수임");
		}
	}
}
