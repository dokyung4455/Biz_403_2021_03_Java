package com.callor.apps.service;

import java.util.Random;

/*
 * Version
 * 프로젝트 개발 : 개발자가 사용하는 중, Developer Version
 * 누군가에게 Test 의뢰 > 같은팀의 누군가에게 : alpha Version // 외부의 다른 누군가에게 : Beta Version
 * 
 * 사용자에게 배포(Deploy) > 실제 사용자에게 설치해서 쓰게함 : Release Version, Deploy Version
 * 최초 배포할때 V1.00 라고 버전 정보를 명시함 R1.00 이라고도 함
 * 배포 후 약간의 문제가 발생하면 수정하게되면 V1.10 으로 수정 명시
 * 
 * 사용자들의 의견이 나올경우 수렴하여 새로운 프로젝트를 기획 및 제작, 배포를 한다
 * 기존 프로젝트를 V1이라고 할때 새로운 기능이 개선되거나 추가됐을때 배포된 프로젝트를
 * V2.00 으로 칭하여 배포한다.
 */

// main() method에서 배열을 만들고 값을 저장한 후,Prime인가를 검사해서 출력했다.
// 이 코드를 PrimeService 클래스를 만들고 분리해서 다시 작성
public class PrimeServiceV1 { 
	// UpperCamelCase 라고 함
	// Service Class : main()에 종합적으로 작성된 코드를 method들을 만들어 분리하고 코드 관리를 쉽게 하도록 만드는 Class
	// 어떤 변수를 사용하여 프로젝트를 수행 할 것인가.
	// 여러(2개 이상)의 method에서 공통으로 사용할 변수들은 class 영역에 설정한다.
	int[] intNums;
	
	// 생성자(Constructor) method 특징
	//	void 키워드를 사용하지 않는다.
	//	이름이 클래스 이름과 같다.
	
	// intNums배열을 설정(초기화, 개수지정)을 하여 사용할 준비
	public PrimeServiceV1() {
		intNums = new int[20];
		
	}
	
	// method는 첫글자 소문자로 시작하여 변수 이름짓기와 같은 방식으로 이름을 짓는다.
	// LowerCamelCase 라고 함
	// Random class로 값을 만들어 저장
	public void makeNums() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length;i++) {
			intNums[i] = rnd.nextInt(51)+50;
		}
	}
	
	// 저장된 값이 Prime 인가 검사하여 출력하기
	public void printPrime() {
		
		for(int arr = 0 ; arr < intNums.length;arr++){
			
			int numP = intNums[arr];
			int num = 0;
			for(num = 2 ; num < numP ; num++) {
				if(numP % num == 0) {
					break;
				}
			} 
			if(num < numP) {
				System.out.println(numP + "는 소수가 아니다.");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
		
	}
	
	
	
	
	
	
	

}
