package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;

	protected final int 학번 = 0;
	protected final int 이름 = 0;
	protected final int 학년 = 0;
	protected final int 반 = 0;
	protected final int 주소 = 0;

	// new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면
	// 고정된 파일이름 "src/com/callor/score/student.txt"을 사용하여 파일을 읽을 수 있도록 할 예정이다.

	// 생성자에서는 new StudentServiceImplV1("파일명") 의 생성자 method를 다시 호출하는 구조가 된다.
	public StudentServiceImplV1() {
		this("src/com/callor/score/student.txt");

	}

	public StudentServiceImplV1(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할때 method를 호출하여 데이터를 사용하도록 준비해 달라.
		this.loadStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		

	}

	// student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			String[] spl = new String[100];
			while (true) {
				String read = buffer.readLine();
				if (read == null)
					break;
				spl = read.split(":");
				// System.out.printf("%s\t%s\t%s\t%s\t%s\n",spl[0],spl[1],spl[2],spl[3],spl[5]);
				StudentVO vo = new StudentVO();
				vo.setNum(spl[0]);
				vo.setName(spl[1]);
				vo.setGrade(spl[2]);
				vo.setDept(spl[4]);
				vo.setAddress(spl[5]);

				//System.out.println(vo.toString());
				studentList.add(vo);

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(this.studentFile + "파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 동안 문제가 발생했습니다.");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		boolean flag = true;
		StudentVO vo = null;
		int nSize = studentList.size();
		
		// for(StudentVO vo : studentList){ 아래 for문과 같은효과.
		// {} 안에 if문만 넣어주면 됨
		for (int i = 0; i < nSize ; i++) {
			vo = studentList.get(i);
			String num2 = vo.getNum();
			if (num.equals(num2)) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			return vo;
		}
		return null;

	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");

		/*
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다 List에 담긴 개수를 알려주는 size() method는 호출될때마다 List에
		 * 담긴 데이터 개수를 다시 헤아리는 코드가 실행된다.
		 * 
		 * for() 반복문 내에서 i < list.size() 코드를 사용하면 반복되는동안 계속해서 데이터 개수를 헤아린다. 데이터의 개수가 많지
		 * 않을때는 큰 문제가 없지만 데이터 개수가 많아지면 그만큼 성능이 저하된다.
		 * 
		 * List 전체를 for 반복문을 사용하여 순회할때는 먼저 size값을 int 형 변수에 담아놓고 시작하자.
		 * 
		 */
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
		}
	}

}
