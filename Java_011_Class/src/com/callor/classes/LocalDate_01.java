package com.callor.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;


public class LocalDate_01 {
	
	public static void main(String[] args) {
		
		/*
		 * java 1.8 부터 사용할 수 있는 새로운 날짜관련 클래스
		 * 
		 * 기존에 date.calender 클래스가 있는데 날짜와 관련된 많은 이슈들이 있었다.
		 */
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println(local.getDayOfMonth());
		System.out.println(local.getDayOfYear());
		System.out.println(local.getDayOfWeek());
		
		System.out.println(local.plusDays(20));
		System.out.println(local.minusDays(10));
		
		System.out.println(local.plusMonths(1));
	}

}
