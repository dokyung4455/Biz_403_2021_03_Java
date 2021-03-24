package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		// 5학급의 인원수를 저장할 배열
		int[] intClass = new int[5];

		int intPizza = 0;
		int intPipcs = 6;
		int intTotal = 0;
		
		
		System.out.println("========================================");
		System.out.println("학급\t인원수\t피자주문\t전체조각수");
		System.out.println("----------------------------------------");
		
		// (0 ~ (?? - 1)) + @@
		// @@ : 시작값을 지정하는 형태 > @@ ~ ??+@@
		// 50 ~ 59중에 임의의 수를 생성
		for (int i = 0; i < 5; i++) {
			intClass[i] = rnd.nextInt(10) + 50;

			intPizza = intClass[i] / intPipcs;

			if (intClass[i] / intPizza > 0) {
				intPizza++;
			}

			intTotal += intPizza;
			System.out.printf("%d반\t%d명\t%2d판\t%d조각\n", i + 1, intClass[i], intPizza, intPizza * intPipcs);

		}
		// 학급별 주문수량을 계산하는 부분과 리스트를 출력하는 부분을 분리하자
		// 1. 계산된 주문수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력
		System.out.println("========================================");
		System.out.printf("전제 주문 BOX 수량 : %d 박스", intTotal);

	}

}
