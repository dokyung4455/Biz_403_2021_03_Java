package com.callor.controller;

public class Controller_03 {

	public static void main(String[] args) {

		int intNum1 = 30;
		int intNum2 = 40;

		// intNum1이 20보다 크고, 50보다 작냐 = 50 > intNum1 > 20
		//
		boolean bYes = intNum1 > 20 && intNum1 < 50;

		// intNum1 가 20보다 크거나, 50보다 크냐
		bYes = intNum1 > 20 || intNum1 > 50;

		bYes = 50 > 20 && 20 > 50;

	}
}
