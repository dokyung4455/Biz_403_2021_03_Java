package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {
	protected Scanner scan;
	protected List<NumberVO> numList;
	
	public InputServiceV4() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
		
	}
	
	public void inputNum() {
		
		NumberVO numberVO = new NumberVO();
		
		Integer num1 = scan.nextInt();
		Integer num2 = scan.nextInt();
		
		numberVO.setNum1(num1);
		numberVO.setNum2(num2);
		numList.add(numberVO);
			
		}
	
	public void printAll() {
		for(int i = 0 ; i < numList.size() ; i++) {
			NumberVO vo = numList.get(i);
			System.out.print(vo.getNum1() + "\t");
			System.out.print(vo.getNum2() + "\n");
			
		}	
	}
	
	//public void printNum(NumberVO vo) {
	//	System.out.println("첫번째\t두번째");
	//	System.out.print(vo.getNum1() + "\t");
	//	System.out.print(vo.getNum2() + "\n");
			
	

}
