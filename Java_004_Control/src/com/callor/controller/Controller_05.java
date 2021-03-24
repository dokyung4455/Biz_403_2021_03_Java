package com.callor.controller;

public class Controller_05 {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 4;

		boolean bYes = num1 % 3 == 0 && num2++ % 4 == 0;

		bYes = num1 % 3 == 0 && (++num2) % 4 == 0;

		// &&(and) 사용시 먼저 값이 false 이면 이후 값은 연산 및 적용하지 않는다.
		// 왼쪽에서 오른쪽으로 코드를 실행하며, 한번이라도 false 결과값이 나올시 그 이후 코드는 연산수행하지 않음
		bYes = num1 > 4 && ++num2 > 5;

		// ||(or) 연산의 경우 왼쪽에서 오른쪽으로 코드를 실행할때 먼저값이 true 결과값이 나오면 이후 코드는 연산수행하지 않음
		bYes = num1 < 4 || ++num2 < 5;

		// 선행되는 코드에서 결과가 뚜렷하여 경우 이후 코드가 실행될 필요가 없으면 코드 실행을 멈추는 기능
		// 이러한 기능때문에 ++ 연산 또는 +=(*=,-= 등) 연산에서 원하는 결과가 이후에 반영이 안되는 경우가 있기때문에
		// 사용할때 상당한 주의를 요한다.

	}
}
