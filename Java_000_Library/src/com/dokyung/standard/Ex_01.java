package com.dokyung.standard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.dokyung.standard.impl.InputServiceImplV1;
import com.dokyung.standard.impl.InputServiceImplV2;

public class Ex_01 {

	public Ex_01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		InputServiceImplV2 isV2 = new InputServiceImplV2();
		InputService isV1 = new InputServiceImplV2();
		
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡",0);
		isV1.inputValue("새우깡",0,1000);
		
		/*
		 * List interface를 구현한 클래스는 ArrayList, LinkedList, Vector 등 3가지가 있다.
		 * 3가지의 클래스는 코드에 List 인터페이스를 implements 했을것이다.
		 * 이러한 클래스는 선언과 생성을 할때 인터페이스로 선언을 하고, 클래스의 생성자로 객체를 생성하는 것이 좋다.
		 * 
		 * List 인터페이스를 impl 한 클래스들은 List type 의 클래스다 라고 호칭한다.
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
	}

}
