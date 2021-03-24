package com.callor.apps;

public class App_06A {
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		
		int nCount = nPay / nPaper ;
		System.out.println(nPaper +"원권 : " + nCount);
		
		nPay = nPay % nPaper;
		//nPay %= nPaper;
		
	}

}
