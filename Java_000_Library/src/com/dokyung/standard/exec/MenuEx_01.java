package com.dokyung.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.dokyung.standard.MenuService;
import com.dokyung.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	
	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적 입력");
		menuList.add("성적 리스트 출력");
		menuList.add("성적 정보저장");
		menuList.add("성적 정보 이메일 보내기");
		menuList.add("기타");
		menuList.add("학생정보 입력");
		
		
		// new menueServiceImplV1() 처럼 호출할 수 없다.
		// 생성자에 매개변수를 선언했기때문에
		MenuService mService = new MenuServiceImplV1("빛나라 고교 성적", menuList);
		
		Integer menu = mService.selectMenu();
		
		
		System.out.println(menu);
	}

}
