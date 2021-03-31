package com.callor.classes;

public class String_01 {
	
	public static void main(String[] args) {
		
		int intNum1 = 30;
		int intNum2 = 30;
		boolean bYes = intNum1 == intNum2;
		
		String str1 = "우리나라";
		String str2 = "대한민국";
		
		bYes = str1 == str2; // false
		
		str2 = "우리나라";
		
		if(str1 == str2) { // true
			System.out.println("맞다");
		}
		
		str1 = "대한민국";
		str2 = new String("대한민국");
		/*
		 * 문자열 변수에 담긴 문자열이 같은가를 확인할때 동등연산자(==)를 사용하면 안된다.
		 * 문자열 변수는 변수에 문자열을 저장하는 방법에다라 다른 특성을 띈다.
		 * 문자열의 독특한 특성때문에 문자열에 저장된 값이 같은지 확인이 안되는 경우가 있다.
		 * 
		 * 문자열 변수에 저장된 값이 같은가 비교를 할때는
		 * 문자열.equals("비교대상") method를 사용해야 한다.
		 */
		
		// 문자열 끼리는 if(str1 == str2)는 절대 사용하지 말것.
		
		if(str1.equals(str2)) { // false
			System.out.println("맞다");
		} else {
			System.out.println("틀리다");
		}
		
		str1 = "대한민국";
		str2 = "대한민국";
		System.out.println(str1.equals(str2));
		
		// 영문 문자열이 저장된 경우 두값의 대소문자가 다르면  서로 다른 문자열이 된다.
		str1 = "KOREA";
		str2 = "Korea";
		
		// 영문 문자열을 대소문자 구분없이 같은지 비교하기 위해서는
		// *.equalsIgnoreCase(*)를 사용한다.
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
