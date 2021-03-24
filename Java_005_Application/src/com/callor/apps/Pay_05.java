package com.callor.apps;

public class Pay_05 {
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		
		int sw = 1;
		for( ; ; ) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d원권 %d매\n",nPaper,nCount);
			nPay %= nPaper;
			if(nPay < 0) {
				break;
			}
			if(sw > 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			
			sw *= -1;
		}
	}

}
