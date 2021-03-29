package com.callor.apps.model;

/*
 * ScoreVO 클래스 선언
 * ScoreVO 클래스에는 5개의 변수가 포함되어 있고 이 5개의 변수는 반드시 ScoreVO 클래스를
 * 객체로 선언한 후 사용할 수 있다.
 */

public class ScoreVO {
	
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	// kor,eng,math 변수는 main() 메서드에서 사용자에 의해 값을 저장하기 위한 변수이다.
	// total,avg는 3과목의 점수를 사용하여 연산한 후 연산 결과를 저장하기 위한 변수이다.
	// kor,eng,math는 어디에서든지 저장,읽기가 가능한 상태이어야 하므로 public으로 선언한다.
	// 그런데 total, avg 변수도 public으로 선언을 해 두었더니 실제 계산된 결과와
	// 상관없이 임의의 값응ㄹ 저장할 수 있게 되었다
	// 코드가 진행되는 과정에서 total에 임의의 값이 저장되면 평균값이 엉뚱하게 계산되는 결과가
	// 나타난다.
	//이런경우 total, avg 변수를 임의로 수정(저장)하지 못하도록 막는 장치가 필요하다
	// VO 클래스의 멤버변수를 private으로 선언하면 다른곳에서 객체를 통해(점연결연산자를)
	// 직접 접근이 불가능 해진다.
	// total, avg를 private으로 선언하면 누구도 직접 total, avg에
	// 값을 저장할 수 없다.
	// total, avg 변수에 담긴 값을 객체를 통해 읽기 하기 위해
	// getTotal(), getAvg() 메서드를 만들어 두었다.
	// 이제부터 total, avg 변수는 저장기능은 되지않고 getTotal(),getAvg()
	// 메서드를 통해 읽기만 가능한 상태가 되었다.
	public int total;
	public float avg;
	
	public int getTotal() {
		this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	public float getAvg() {
		// int intTotal = this.getTotal();
		int intTotal = this.total;
		float floatAvg = intTotal /3;
		return floatAvg;
	}

}
