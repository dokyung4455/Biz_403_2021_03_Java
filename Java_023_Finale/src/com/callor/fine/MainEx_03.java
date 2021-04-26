package com.callor.fine;

public class MainEx_03 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		
		// AddInt 클래스를 만들고 그 클래스안에 add라는 메소르를 만들어 매개변수로 num1값과 num2를 int 형으로 선언
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		
	}

}
