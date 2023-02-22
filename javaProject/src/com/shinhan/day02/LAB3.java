package com.shinhan.day02;

import java.util.Scanner;

public class LAB3 {
	//public: 모든 패키지에서 접근 가능
	//static: >java LAB3실행하면 실행하기 전 
	//LAB3 class의 byte코드가 method영역에 올라간다.
	//static붙은 method, variable들도 올라간다.
	//void: return 값이 없다. 함수 수행 후 돌아갈때 값을 가지고 가지 않는다.
	public static void main(String[] args) {
		printSeason(); //문제1
		abs(); //문제2
	}

	private static void abs() {
		//냥
		
	}

	private static void printSeason() {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 달을 입력하세요>>");
		int month = sc.nextInt();
		String message = "";
		switch (month) {
			case 3,4,5 -> message = "봄에 태어나셨네요.";
			case 6,7,8 -> message = "여름에 태어나셨네요.";
			case 9,10,11 -> message = "가을에 태어나셨네요.";
			case 12,1,2 -> message = "겨울에 태어나셨네요.";
			default -> message = "1~12 사이의 숫자만 입력하셔야 합니다.";
		}
		
		System.out.println(message);
		sc.close();
	}

}
