package com.callor.classes.model;

// 매입매출 프로젝트
// 마트, 편의점, 쇼핑몰 등에서 공산품을 구매하여 고객에게 마진을 붙여 판매하고 이익금 등을 계산하기 위한 프로젝트
// 소매점(도매점 등으로 부터 구매하여 일반 소비자에게 판매) 
// 도매정(생산공장에서 구매하여, 소매점에 판매)

// 필요한 데이터 항목( 어떤데이터가 필요한지 결정짓는걸 추상화단계라고 한다)
// 상품이름, 거래일자, 거래처, 매입매출구분, 수량, 매입단가, 매출단가
public class IolistVO {

	private String pname;
	private String date;
	private String dname;
	private String inout;
	private Integer qty;
	private Integer iprice;
	private Integer oprice;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getInOut() {
		return inout;
	}

	public void setInOut(String inout) {
		this.inout = inout;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getIprice() {
		return iprice;
	}

	public void setIprice(Integer iprice) {
		this.iprice = iprice;
	}

	public Integer getOprice() {
		return oprice;
	}

	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}

}
