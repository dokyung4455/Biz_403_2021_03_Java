package com.callor.reload.service;

public class PrimeServiceV5 extends PrimeServiceV4{
	
	public void primeNum() {
		for(int i = 0 ; i < 50 ; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			int index = 0;
			for(index = 2; index < rndNum ; index++) {
				if(rndNum % index == 0) {
					break;
				}
			}
			//index < rndNum와 반대, index >= rndNum/index == rndNum
			if(index < rndNum) {
				
			}else {
				intList.add(rndNum);
			}
		}
	}
}
