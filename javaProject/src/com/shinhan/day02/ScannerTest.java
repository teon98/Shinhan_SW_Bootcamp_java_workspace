package com.shinhan.day02;

import java.io.IOException;

//java.lang 패키지에있는 class는 import없이 사용한다.

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f2();

	}

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수>>>");
		int score = sc.nextInt();
		System.out.print("이름>>>");
		String name = sc.next();
		System.out.print("메모>>>");
		sc.nextLine();
		String memo = sc.nextLine();
		System.out.println(name + "==>" + score);
		System.out.println(memo);
	}

	private static void f1() throws IOException {
		// 사용자입력 받기: System.in
		System.out.println("f1 function");
		System.out.print("정수입력>>");
		InputStream is = System.in;
		
		int i;
		while((i = is.read())!=13) {
			System.out.print((char)i);
		} //1byte만 읽음.
		
		//이런 방법도 있지만! 
		//java가 가지고 있는 라이브러리를 잘 사용하자
	}

}
