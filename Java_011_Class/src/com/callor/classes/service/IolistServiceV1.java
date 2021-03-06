package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO;

/* IolistVO는 1개의 데이터를 담을 수 있도록 설계하였다
 * 실제로 프로젝트에서는 1개의 데이터만 있는경우는 없다.
 * 여러개의 데이터 묶음으로 연산을 수행해야 한다.
 * 데이터의 묶음을 처리할대는 보통 배열을 사용한다 하지만 배열은 그 구조상
 * 사용이 다소 불편할때가 많다
 * Java에서는 배열을 사용해야 하는 프로젝트서 List 클래스를 사용한 객체를 생성하여 진행한다.
 */

public class IolistServiceV1 {

	// 매입매출 데이터들을 사용하여 연산을 수행할텐데 매입매출 데이터들의 묶음을
	// List형 객체에 포함된 (개별)데이터는 IolistVO형으로 사용하겠다.

	// iolist를 private로 선언한 이유
	// 낱개 데이터는 IolistVO 클래스 형으로 사용하고 그 데이터들을 묶어서
	// List형으로 연산수행을 하겠다 라는 선언
	// 혹시 외부에서 iolist데이터에 접근하여 값을 저장하는 일을 방지하기 위함

	// V1 클래스를 상속하여 사용할 예정이라면 protected로 선언을 한다.
	
	// TODO 멤버변수 선언하기
	protected List<IolistVO> iolist;
	protected Scanner scan;

	public IolistServiceV1() {
		// TODO 클래스 생성자
		iolist = new ArrayList<IolistVO>();
		scan = new Scanner(System.in);
	}
	public void selectMenu() {
		// TODO 업무선택하기 메뉴
		Integer sel = null;
		int intMenu = 0; 
		System.out.println("=".repeat(50));
		System.out.println("KMS 쇼핑몰 업무관리");
		System.out.println("-".repeat(50));
		System.out.println("1. 매입매출 등록");
		System.out.println("2. 매입매출 리스트 출력");
		System.out.println("QUIT. 업무종료");
		System.out.println("-".repeat(50));
		String strMenu = scan.nextLine();
		if(strMenu.equals("QUIT")) {
			return;
		} else {
			
			
		}
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR]메뉴선택오류");
		}
		while(true) {
			System.out.print("업무선택 >> ");
			sel = scan.nextInt();
			if (sel == 1) {
				this.input();
			} else if (sel == 2) {
				this.printAllList();
			} else if (sel == 0) {
				break;
			} else {
				System.out.println("=".repeat(50));
				System.out.println("메뉴를 다시 선택해주세요!");
				System.out.println("-".repeat(50));
				System.out.println("1. 매입매출 등록");
				System.out.println("2. 매입매출 리스트 출력");
				System.out.println("0. 업무종료");
				System.out.println("-".repeat(50));
				continue;
			}
		} // end while
		System.out.println("업무 종료");
	}

	public void input() {
		// TODO 매입매출 등록하기
		System.out.println("==================");
		System.out.println("매입 매출 등록");
		System.out.println("------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();

		System.out.print("매입단가 >> ");
		Integer iprice = scan.nextInt();

		System.out.print("매출단가 >> ");
		Integer oprice = scan.nextInt();

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInOut(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);

		this.printIolist(iolistVO);
		
		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);

	} // end input
	
	public void printAllList() {
		// TODO 저장된 리스트 출력하기
		System.out.println("=".repeat(50));
		System.out.println("매입매출 리스트");
		System.out.println("-".repeat(50));
		System.out.println("상품명\t거래일\t거래처\t매입/출 구분\t수량\t매입단가\t매출단가");
		for(int i = 0 ; i < iolist.size() ; i++) {
			//IolistVO vo = iolist.get(i);
			//this.printIolist(vo);
			this.printIolist(iolist.get(i));
		}
		System.out.println("=".repeat(50));
	}

	public void printIolist(IolistVO vo) {
		// TODO 1개 데이터 출력하기
		System.out.println("상품명\t거래일\t거래처\t매입/출 구분\t수량\t매입단가\t매출단가");
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInOut() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\n");

	}



}
