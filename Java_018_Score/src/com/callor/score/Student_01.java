package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			/*
			 * =======================================================
			 * while(true) 반복문의 사용
			 * 1. 조건없이 무한반복을 수행하는 코드
			 * 2. 무한반복 코드를 수행하는 과정에서 if() 조건문을 추가하여 반복을 중단하기
			 * 3. 조건을 부여하여 탈출구를 만들때 일반적으로 쉽게 구현할수 있는 코드
			 * 4. if() 조건문이 필요하고 때로는 추가되는 코드가 필요하기도 하다
			 * 5. 무한반복 코드가 실행되는 동안에 탈출구를 어떻게 만들지 고민해야 하고
			 * 6. 다양한 방법의, 다양한 조건의 탈출구를 필요할때 적절하게 구현할 수 있다.
			 */
			
			
			
			
			
			System.out.println("=".repeat(50));
			// 파일을 무조건 한 라인씩 읽어라
			while (true) {
				String read = buffer.readLine();
				if (read == null) {
					break;
				}
				String[] score = read.split(":");
				System.out.printf("%s\t%s\n",score[1],score[5]);
				
				
			}
			/*
			 * ========================================================
			 * while(조건식) 무한반복문
			 * 1. 무한반복코드가 중단되는 조건이 한개만 있을 경우 사용하기.
			 * 2. 조건식을 어떻게 만들것인가 잘 구상해야 한다.
			 * 3. while(조건식)이 시작되기전에 조건이 true가 되도록 만들어야 한다.
			 * 4. 적절하게 탈출을 하려면 코드 내에서 false 되도록 연산을 수행해야 한다.
			 * 5. 코드내에서 조건이 false가 되더라도 이후의 명령들이 한번씩 실행되고 나서 탈출이 이뤄진다.
			 */
			
			String reader = new String(); // ""
			
			// 최초의 while()문에서 reader != null은 ture가 된다.
			// != null 조건문을 실행하기 전에 reader = buffer.readLine()을 실행하고
			// reader 저장된 값이 null인지 비교한다.
			// 1. reader = 
			while( (reader = buffer.readLine()) != null) {
				// reader = buffer.readLine();
				System.out.println(reader);
			}
			System.out.println("=".repeat(50));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
