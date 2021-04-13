package com.callor.score.vo;

// 데이터를 담아서 정보처리를 수행할때 편리하게 데이터를 묶어서 관리하기 위한 클래스
// VO 를 만드는 작업 : 데이터 모델링(설계하기)
// 1. 추상화
// 2. 정보은닉
// 3. 캡슐화
// 4. 재정의(Override)

// 모델링된 ScoreVO를 실제로 사용할때는 객체로 생성한다. >> ScoreVO scoreVO = new ScoreVO();
// 필요할때마다 객체로 생성하고, 데이터를 Setter하고 연산을 수행한 후 데이터를 Getter하는 방식으로 쓴다.

// DB항목에서는 Entity 모델링 이라고 한다.
// 모델링된 Entity를 data TABLE 로 생성하여 사용한다.
// 한번 TABLE을 생성하고 영구적으로 사용한다.
public class ScoreVO {
	
	// -- private 으로 정보은닉 --
	private String num;
	private String name;
	
	// VO 클래스에 숫자형변수를 선언할때 primitive 형이 아닌 wrapper 클래스 형으로 선언할때는 0으로 clear를 하자
	// 이러한 불편을 방지하기 위하여 primitive 형으로 만들기도 하지만 null값을 취급하기가 어려운 단점이 발생한다.
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;
	
	// -- 추상화단계 --
	
	/*
	 * VO 클래스를 모델링하고(추상화) 변수를 private 으로 선언하였다.(정보은닉)
	 * 은닉된 변수에 접근하기위해 getter, setter method를 생성했다.
	 * 
	 * getter와 setter를 생성하고 봤더니 총점(total)과 평균(avg)는 점수가 입력되면
	 * 항상 계산되어야 하는 항목이다.
	 * 
	 * 즉, 외부에서 이 변수에 값을 저장할일이 별로 없을 것 같아, 값을 요청할때마다 계산하여 retrun
	 * 
	 * total, avg 변수를 삭제하고
	 */
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}

	/*
	 * 캡슐화
	 * 외부에서 객체.getTotal() method를 호출하면 과목의 총점을 return 할수있다.
	 */
	public Integer getTotal() {
		Integer total = this.kor;
		total += this.eng;
		total += this.math;
		return total;
	}
	
	public Float getAvg() {
		Float avg = (float)this.getTotal()/3;
		
		return avg;
	}
	
	// 재정의(Override)
	// toString() method는 Object 클래스에 정의되어 있으며 모든 클래스는 자동적으로
	// Object 클래스를 상속받는다.
	
	// 따라서 ScoreVO 클래스에는 자동으로 toString() method 있는 것처럼 동작할 것이다.
	
	// 하지만, Object 클래스에 정의된 toString() method는 사용하는데 의미가 없다.
	
	// 그래서 toString() method를 VO 객체의 변수에 담긴 값들을 문자열로 만들어 return하는
	// 코드로 다시 작성을 한다
	// 이제 vo객체.toString() method를 호출하면 vo 객체의 변수들에 담긴 값들이 출력될 것이다.
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + this.getTotal() + ",avg=" + this.getAvg() + "]";
	}
	

}
