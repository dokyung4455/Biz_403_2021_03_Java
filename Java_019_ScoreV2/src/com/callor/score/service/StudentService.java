package com.callor.score.service;

import com.callor.score.model.StudentVO;

public interface StudentService {
	
	public void insertStudent();
	public void loadStudent();
	public StudentVO getStudent(String num);
	public void printStudent();
	
//	public class StudentVO{
//		
//		String num;
//		String name;
//		String grade;
//		String dept;
//		String address;
//		
//		
//		
//		
//		
//		public String getNum() {
//			return num;
//		}
//		public void setNum(String num) {
//			this.num = num;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getGrade() {
//			return grade;
//		}
//		public void setGrade(String grade) {
//			this.grade = grade;
//		}
//		public String getDept() {
//			return dept;
//		}
//		public void setDept(String dept) {
//			this.dept = dept;
//		}
//		public String getAddress() {
//			return address;
//		}
//		public void setAddress(String address) {
//			this.address = address;
//		}
//		
//		
//	}

}
