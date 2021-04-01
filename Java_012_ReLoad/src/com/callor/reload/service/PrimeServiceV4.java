package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {
	Random rnd;
	List<Integer> intList;
	Integer[] nums;
	int num;

	public PrimeServiceV4() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
		intList = new ArrayList<Integer>();
		nums = new Integer[50];
		num = 0;
	}

	public void primeNum() {
		int i = 0;
		int j = 0;
		for (j = 0; j < nums.length; j++) {
			num = rnd.nextInt(51) + 50;
			
			for (i = 2; i < num; i++) {
				if(num % i ==0) {
					break;
				}
			}
			if(i < num) {
				System.out.println(num + "은 소수가 아닙니다.");
			} else {
				System.out.println(num + "은 소수입니다. List에 저장합니다.");
				intList.add(num);
			}
			
		}
		
	}


	public void printPrimeNum() {
		System.out.println("============================");
		System.out.println("저장된 소수 리스트를 출력합니다.");
		System.out.println(intList);

	}
}
