package com.shinhan.day04;

import java.util.Date;

import com.shinhan.day03.Car;

public class PackageTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);//Date라는 함수가 toString을 재정의하여 주소가 아닌 날짜가 나온다.
		
		java.sql.Date d2 = new java.sql.Date(2023-1900, 07, 12);
		//초창기에 1900년도를 기본으로 해서 그럼. 지금은 잘 쓰지 않음.
		java.sql.Date d3 = new java.sql.Date(d1.getTime());
		
		System.out.println(d2);
		System.out.println(d3);
		
		BookVO b1 = new BookVO("자바다", 10000);
		com.shinhan.day05.BookVO b2 = new com.shinhan.day05.BookVO("자바다2", 20000);
	}
}
