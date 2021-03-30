package com.callor.classes;

import com.callor.classes.model.AddressVO;

public class AddrEx_01 {
	
	public static void main(String[] args) {
		
		AddressVO addr = new AddressVO();
		addr.setName("홍길동");
		addr.setAddr("서울식");
		addr.setTel("010-1234-5678");
		addr.setAge(200);
		
		System.out.println(addr.getName() + "의 나이는 ? : " + addr.getAge());
	}

}
