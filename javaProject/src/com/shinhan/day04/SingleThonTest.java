package com.shinhan.day04;

import java.util.Calendar;

public class SingleThonTest {

	public static void main(String[] args) {
		MyServlet a = MyServlet.getInstance();
		MyServlet b = MyServlet.getInstance();

		System.out.println(a==b);
		a.print1();
		b.print2();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	}

}
