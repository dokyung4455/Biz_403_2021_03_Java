package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1{
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51)+50;
		
		int index = 0;
		for(index = 2; index < rndNum ; index++) {
			if(rndNum % index == 0) {
				break;
			}
		}
		// for() 끝났을때 break 됐을때와 그렇지않은 경우를 확인하여 코드를 진행시켜 소수를 확인한다.
		// 만약 break 되었을땐 index는 항상 제한값보다 작다.
		// 그렇지않은경우엔 index는 제한값과 같거나 크다
		if(index < rndNum) {
			System.out.println(rndNum + "는 소수가 아님");
		} else {
			System.out.println(rndNum + "는 소수");
		}
		
		
	}

}
