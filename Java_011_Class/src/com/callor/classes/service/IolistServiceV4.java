package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV4 extends IolistServiceV3 {

	public void input() {
		// TODO 매입매출 등록
		System.out.println("==================");
		System.out.println("매입 매출 등록");
		System.out.println("------------------");

		String pname = null;
		while (true) {
			System.out.print("상품명(QUIT 입력시 종료) >> ");
			pname = scan.nextLine();
			if (pname.equals("QUIT")) {
				return;
			} else if (pname.equals("")) {
				System.out.println("상품명은 반드시 입력하셔야합니다.");
				continue;
			}
			break;
		}

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		inout = scan.next();

		System.out.print("수량 >> ");
		qty = scan.nextInt();

		Integer iprice = this.inputPrice("매입");
		if (iprice == null) {
			return;
		}

		Integer oprice = this.inputPrice("매출");
		if (oprice == null) {
			return;
		}

		IolistVO vo = new IolistVO();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setInOut(inout);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setOprice(oprice);

	}

	private Integer inputPrice(String title) {

		while (true) {
			System.out.println(title + "단가를 입력하세요.");
			System.out.println(title + "단가는 0 이상 입력하세요.");
			System.out.println("(*-1을 입력하면 입력이 중단됩니다.)");
			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if (price == -1) {

			} else if (price < 0) {
				System.out.println(title + "단가는 0 이상 입력하세요.");
			} else {
				return price;
			}

		}
	}

}
