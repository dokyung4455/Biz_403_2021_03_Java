package com.dokyung.standard;
/*
 * interface
 * Java 언어를 사용하는 프로젝트를 구현할때 모든 코드는 클래스를 기초로 만들어 진다.
 * 클래스를 만들기 위해서는 여러가지 조건에 맞도록 설계를 해야한다.
 * 설계를 하고 설계된 내용으로 문서화를 하는데 실제 개발 현장에서 문서화된 설계 내용은 잘 지켜지지 않는 경우가 많다.
 * 
 * 그러한 상황이 많아지면 여러 클래스가 연동되는 프로젝트의 경우 특히 method의 이름을 잘못 지어(다르게 지어)코드 연결(연동)이 어려워진다.
 * 
 * interface는 여러 개발들이 협업을 할때 클래스, method 규칙을 코드로 구현하여 클래스를 만들때 반드시 implements 하도록
 * 강제한다. 인터페이스를 implements 한 클래스는 interface에 설계된 추상method를 반드시 자신이 만들 클래스에서 구현해야 한다.
 * 그러한 규칙을 강제함으로써 연결, 연동의 혼란을 최소화 하는 것 이다.
 * 
 */

// 키보드로 정수를 입력받기 위한 나의 클래스
// 키보드로 정수를 입력받으면서 QUIT를 입력받으면 입력을 취소하고 null을 return
// 정수를 입력받으면 정수값을 return
public interface InputService {
	
	// interface는 대부분 public type이다.
	// interface는 어떤 method가 어떤 형식으로 들어가는지만 보여줄 뿐 자세한 method 내용은 들어가지 않는다.
	public Integer inputValue(String title) ;
	public Integer inputValue(String title, int start) ;
	public Integer inputValue(String title, int start, int end) ;


}
