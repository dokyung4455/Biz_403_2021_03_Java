package com.callor.apps;

public class Pay_01 {

	public static void main(String[] args) {
		
		int intPay = 3723560;
		
		int intOman = 50000;
		int intMan = 10000;
		int intOchun = 5000;
		int intChun = 1000;
		int intOback = 500;
		int intBack = 100;
		int intOship = 50;
		int intShip = 10;
		
		int intPayOman = intPay / intOman ;
		int intPayOman2 = intPayOman * intOman;
		
		int intPayMan = (intPay - intPayOman2) / intMan ;
		int intPayMan2 = intPayMan * intMan;
		
		int intPayOchun = (intPay - intPayOman2 - intPayMan2) / intOchun ;
		int intPayOchun2 = intPayOchun * intOchun;
		
		int intPayChun = (intPay - intPayOman2 - intPayMan2 - intPayOchun2) / intChun ;
		int intPayChun2 = intPayChun * intChun;
		
		int intPayOback = (intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2) / intOback ;
		int intPayOback2 = intPayOback * intOback;

		int intPayBack = (intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2) / intBack ;
		int intPayBack2 = intPayBack * intBack;
		
		int intPayOship = (intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2 - intPayBack2) / intOship ;
		int intPayOship2 = intPayOship * intOship;
		
		int intPayShip = (intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2 - intPayBack2 - intPayOship2) / intShip ;
		int intPayShip2 = intPayShip * intShip;
		
		if(intPay - intPayOman2 < 50000) {
			System.out.printf("50000원권 : %d장\n",intPayOman);
		} else {
			System.out.printf("50000원권 : 0장");
		}
		
		if((intPay - intPayOman2)  - intPayMan2 < 10000) {
			System.out.printf("10000원권 : %d장\n",intPayMan);
		} else {
			System.out.printf("10000원권 : 0장");
		}
		
		if((intPay - intPayOman2 - intPayMan2) - intPayOchun2 < 5000) {
			System.out.printf("5000원권 : %d장\n",intPayOchun);
		} else {
			System.out.printf("5000원권 : 0장\n");
		}
		
		if((intPay - intPayOman2 - intPayMan2 - intPayOchun2) - intPayChun2 < 1000) {
			System.out.printf("1000원권 : %d장\n",intPayChun);
		} else {
			System.out.printf("1000원권 : 0장");
		}

		if((intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2) - intPayOback2 < 500) {
			System.out.printf("500원권 : %d장\n",intPayOback);
		} else {
			System.out.printf("500원권 : 0장");
		}

		if((intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2) - intPayBack2 < 100) {
			System.out.printf("100원권 : %d장\n",intPayBack);
		} else {
			System.out.printf("100원권 : 0장\n");
		}

		if((intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2 - intPayBack2) - intPayOship2 < 50) {
			System.out.printf("50원권 : %d장\n",intPayOship);
		} else {
			System.out.printf("50원권 : 0장\n");
		}

		if((intPay - intPayOman2 - intPayMan2 - intPayOchun2 - intPayChun2 - intPayOback2 - intPayBack2 - intPayOship2) - intPayShip2 < 10) {
			System.out.printf("10원권 : %d장\n",intPayShip);
		} else {
			System.out.printf("10원권 : 0장\n");
		}
		
	}
}
