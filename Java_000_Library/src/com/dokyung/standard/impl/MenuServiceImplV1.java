package com.dokyung.standard.impl;

import java.util.List;
import java.util.Scanner;

import com.dokyung.standard.MenuService;
// 사용자에게 업무리스트를 보여주고 업무 번호를 입력하면 해당하는 업무 번호를 return QUIT를 입력하면 null을 return
public class MenuServiceImplV1 implements MenuService {

	protected List<String> menuList;
	protected Scanner scan;
	protected String title;
	
	public MenuServiceImplV1(String title, List<String> menuList) {
		// 객체를 생성할때 전달한 매개변수 title을 멤버변수 this. title에 저장
		this.title = title;
		// TODO Auto-generated constructor stub
		// menuList = new ArrayList<String>();
		this.menuList = menuList;
		scan = new Scanner(System.in);
	}
	/*
	 * 생성자에서 매개변수 선언
	 * MenuServiceImplV1 클래스를 사용하여 객체를 생성할때는 title 변수와 meneList에 값을 담아서 파라메터로 전달하고
	 * 생성자를 호출해야 한다.
	 */
	
	@Override
	public Integer selectMenu() {
		while(true) {
		System.out.println("=".repeat(50));
		System.out.println(title);
		System.out.println("=".repeat(50));
		int nSize = menuList.size();
		for(int menuIndex = 0 ; menuIndex < nSize ; menuIndex++) {
			System.out.printf("%d. %s\n",menuIndex+1,menuList.get(menuIndex));
		}
		System.out.println("QUIT. 업무종료");
		System.out.println("-".repeat(50));
		System.out.print("업무선택 >> ");
		String strM = scan.nextLine();
		if(strM.equals("QUIT")) {
			return null;
		}
		Integer intM = null;
		try {
			intM = Integer.valueOf(strM);
		} catch (NumberFormatException e) {
			System.out.printf("업무는 1 ~ %d, 또는 QUIT만 입력하세요.\n",nSize);
			continue;
		}
		if(intM < 1 || intM > nSize) {
			System.out.printf("업무 선택은 1 ~ %d 까지 선택하세요.\n",nSize);
			continue;
		}
		return intM;
		}
	}

}
