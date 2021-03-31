package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	Integer qty;
	Integer iprice;
	Integer oprice;
	String inout;

	@Override
	public void input() {
		// TODO 매입매출 등록
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
		inout = scan.next();

		while (true) {
			System.out.print("수량 >> ");
			qty = scan.nextInt();
			if (qty < 0) {
				System.out.println("수량이 0개 미만입니다. 재입력하세요.");
			} else {
				break;
			}
		}

		while (true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("매입단가가 0원 미만입니다. 재입력하세요.");
			} else {
				break;
			}
		}

		while (true) {
			System.out.print("매출단가 >> ");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("매출단가가 0원 미만입니다. 재입력하세요.");
			} else {
				break;
			}
		}

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

	}

}
