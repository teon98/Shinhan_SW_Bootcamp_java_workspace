package com.shinhan.day04;

public class BookExample {

	public static void main(String[] args) {
		System.out.println("책 생성 후: " + BookVO.count);
		
	    BookVO[] b = new BookVO[5];
		b[0] = new BookVO("Java Program",30000);
		b[1] = new BookVO("JSP Program",25000);
		b[2] = new BookVO("SQL Fundamentals",20000);
		b[3] = new BookVO("JDBC Program",32000);
		b[4] = new BookVO("EJB Program",25000);
		
		System.out.println("책 생성 후: " + BookVO.count);
		System.out.println(b[0].isbn);
		System.out.println(b[0].isbn2);
		System.out.println(b[0].PUB);
		System.out.println(BookVO.PUB);
		
		/* final은 수정이 불가능하다!*/
		//b[0].isbn = "23444"; //(오류)
		//b[0].isbn2 = "23444"; //(오류)
		//b[0].publisher = "AA"; //(오류)
		//BookVO.publisher = "23444"; //(오류)
	}

}
