package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV1Ex;

public class Const_2 {
	
	public static void main(String[] args) {
		
		// 인터페이스가 있는 클래스의 객체 생성
		// 클래스를 선언(작성)할때 interface를 implements 했다
		// interface를 사용하여 객체를 선언하고 구현체 클래스의 생성자를 호출하여 객체를 생성, 초기화 해야한다.
		ScoreService sService = new ScoreServiceImplV1Ex();
		
		
		// List 인터페이스로 3개의 객체를 선언하고 각각을 Array, Linked, Vector 클래스로 생성하였다.
		ArrayList<String> strList1 = new ArrayList<String>();
		LinkedList<String> strList2 = new LinkedList<>();
		Vector<String> strList3 = new Vector<>();
		
		strList1.add("우리나라");
		strList1.add("대한민국");
		strList2.add(" 3 * 4 ");
		strList2.add(" 3 / 4 ");
		strList3.add("홍길동");
		strList3.add("이몽룡");
		
		// 리스트에 저장된 내용을 출력하는 method 출력하기
		list(strList1);
		list(strList2);
		list(strList3);
	}
	
	// 리스트의 내용전체를 Console에 출력하기
	// 여기에 있는 세개의 method는 각각 ArrayList, LinkedList, Vector type의 내용을 추

	public static void list(ArrayList<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}
	
	public static void list(LinkedList<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}
	
	public static void list(Vector<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}

}
