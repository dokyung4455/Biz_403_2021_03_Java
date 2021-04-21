package com.callor.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt(100)+1;
			intList.add(num);
		}
		for(Integer n : intList) {
			System.out.println(n + "\t");
		}
		System.out.println();
		
		// Collections 클래스는 List와 같은 데이터들을 관리하는 클래스의 부모격 클래스
		
		// Collections.sort(ListType의 데이터)
		// return 값을 사용하는 것이 아니고 매개변수로 전달된 값 자체를 변형한다.
		Collections.sort(intList);
		for(Integer n : intList) {
			System.out.println(n + "\t");
		}
		
		
		//replace : 왼쪽의 문자열 중 괄호안의 왼쪽문자를 오른쪽문자로 바꿔라
		String strNation = "Republic of Korea";
		strNation.replace("Korea", "대한민국");
		//일반적인
		"Republic of Korea".replace("Korea", "대한민국");
		System.out.println(strNation);
		
		// intNum1, intNum2의 변수를 add() method에게 파라메터로 전달하였다.
		// add() method는 내부코드에서 매개변수의 값을 임의 변경했다.
		// 하지만 그 변경이 add() method가 끝난 후에는 원래 intNum1, intNum2에는
		// 아무런 영향을 미치지않는다.
		int intNum1 = 50;
		int intNum2 = 30;
		add(intNum1, intNum2);
		// ?? intNum1과 intNum2 값
		
		
	}
	// 매개변수로 선언한 num1, num2 의 값을 method에서 변경하는 코드
	public static void add(int num1, int num2) {
		num1 = 100;
		num2 = 200;
	}
	

}
