package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	
	protected Random rnd;
	protected Integer num;
	
	public NumberServiceV1() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
	}

	public void printNum() {
		if(this.inputNum() == num) {
			System.out.println(num + "은 3의 배수이다.");	
		} else if(this.inputNum() == null) {
			System.out.println(num + "은 3의 배수가 아니다.");
		}
	}
	/*Random 수를 생성하여 3의 배수이면 그 수를 아니면 retrun 하거나
	 * 
	 * void 키워드 : method에 return 명령이 꼭 없어도 되는  경우
	 * 
	 */
	public Integer inputNum() {
		num = rnd.nextInt(101)+1;
		if(num % 3 == 0) {
			return num;
		} else {
			return null;
		}
	}
	
	
	


}
