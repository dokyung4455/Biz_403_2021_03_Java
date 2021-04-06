package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {

	public NumberEx_01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		Integer retNum = nsV1.addNum(31,29);
		if(retNum == null) {
			System.out.println("결과는 짝수가 아님");
		} else {
			System.out.printf("결구 [%d]는 짝수",retNum);
		}
		
		
		// addNum(float num1, float num2) method는 return type이 Float 이기 때문에
		// return 되는 결과값을 저장하는 변수(retNum1) 도 반드시 float, Float 형이어야 한다.
		Float retNum1 = nsV1.addNum(30.2f,33.2f);
		
		// NullPointerException 발생
		// float retNum2 = nsV1.addNum(30.2f,33.2f);
		
		/* 변수를 선언하는 방식에 primitive 방식과 wrapper class 방식이 있다.
		 * 특히 숫자를 다루는 경우에 항상 숫자값만 저장된다는 보장이 있을경우는 primitive 방식으로 선언해도 문제는 없다.
		 * 
		 * Java나 DB(database)와 연동되는 프로젝트를 구현할때는 null이라는 특별한 값을 항상 인식해야 한다.
		 * 어떤 결과가 null 값을 갖게되는 경우 primitive 방식에서는 취급이 불가능하다.
		 * 
		 * 이럴때는 변수를 선언할때 wrapper class 방식을 사용하는것이 바람직 하다.
		 */
	}

}
