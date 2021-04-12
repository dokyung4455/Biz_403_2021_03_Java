package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		/*
		 * eClipse를 사용하여 프로젝트를 만들었을때 Project의 소스코드가 저장되는 곳은
		 * Project/src 폴더 이후에 패키지 이름으로 만들어진다. 새로운 파일을 만들기 위해서
		 * src/package-name 폴더를 지정하는데 타이핑을 직접하다보면 오타가 발생할 수 있기 때문에
		 * copy Qulalified를 사용하여 임이ㅡ 파일 이름을 가져오고 필요한 파일로 이름을 변경하여 사용한다.
		 * 
		 */
		
		Random rnd = new Random();
		// 2개의 난수로 4칙연산 수행
		// 뺄셈과 나눗셈은 반드시 큰수 / 작은수, 큰수 / 작은수
		int num1 = rnd.nextInt(101);
		int num2 = rnd.nextInt(101);
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		float div = (float)num1 / num2;
		
		
		String fileName = "src/com/callor/app/service/data.txt";
		// file과 관련된 클래스를 사용할때는 객체선언과 생성문을 분리하여 작성한다.
		// FileWriter, PrintWriter 
		FileWriter fileWriter = null; // 객체선언
		PrintWriter printWriter = null; // 객체선언
		
		// 객체 생성
		// FileWriter 클래스에 객체로 생성할때 만들(작성할, 새로생성할) 파일이름(경로포함)을 생성자 매개변수로 전달해주어야한다.
		
		// fileWriter 클래스의 객체만으로도 파일에 기록할 수 있지만 상당히 복잡하고, 불편한 코드를 만들어야한다.
		// PrintrWiter 클래스의 객체를 FileWriter 클래스의 객체와 연결하여 Stsytem.out 의 print 관련
		// method와 똑같은 방법으로 파일에 Text를 출력한다.
		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);
			
			printWriter.println("첫번째 수 : " + num1);
			printWriter.println("두번째 수 : " + num2);
			printWriter.println("=".repeat(50));
			printWriter.printf("%d + %d = %d\n",num1,num2,sum);
			if( min<0) {
				min = num2 - num1;
				printWriter.printf("%d - %d = %d\n",num2,num1,min);
			} else {
				printWriter.printf("%d - %d = %d\n",num1,num2,min);
			}
			printWriter.printf("%d * %d = %d\n",num1,num2,mul);
			if(div < 1) {
				div = (float)num2 / num1;
				printWriter.printf("%d / %d = %3.2f\n",num2,num1,div);
			} else {
				printWriter.printf("%d / %d = %3.2f\n",num1,num2,div);
			}
			printWriter.println("-".repeat(50));
			
			// PrintWriter를 닫으면 FileWriter도 같이 닫히기 때문에 일부러 close 하지 않아도 무방하다.
			printWriter.flush();
			printWriter.close();
			
			System.out.println("작업종료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
