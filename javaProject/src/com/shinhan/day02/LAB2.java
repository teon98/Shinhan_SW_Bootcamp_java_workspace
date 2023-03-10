package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		//method1();//문제1
		//method2(); //문제2
		//method3(); //문제3
		//method4(); //문제4
		//method5(); //문제5
		//method6(); //문제6
		//method7(); //문제7
		method8();
	}

	private static void method8() {
		gcd(2,5);
		gcd(5,15);
		gcd(250,30);
	}

	private static void gcd(int a, int b) {
		int min = (a>b) ? b : a;
		int result = 0;
		for(int i=1; i<=min; i++) {
			if(a%i == 0 & b% i == 0) {
				result = i;
			}
		}
		System.out.println(result);
	}

	private static void method7() {
		Scanner key = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = key.nextInt();
		int year = 2000;
		
		numDay(year, month);
	}

	//void: return 값이 없다.
	//static: class가 메모리에 load될 때 method영역에 올라간다.
	//public: 모든 패키지에서 이 함수를 호출할수 있다.
	public static void numDay(int year, int month) {
		String day = "";
		switch (month) {
			case 1,3,5,7,8,10,12 -> day = "31";
			case 4,6,9,11 -> day = "30";
			case 2 -> day = method6(year)?"29":"28";
			default -> day = month + "월은 존재하지 않습니다. 다시 입력하세요.";
		}
		
		System.out.printf("numDays(%d) -> %s",month,day);
	}

	private static boolean method6(int year) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("년>>");
		//int year = sc.nextInt();
		
		boolean result = false;
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
		
		//System.out.printf("%d년 2월의 말일은 %d입니다.", year, result?29:28);
		/*
		[윤년의 조건]
				1)	4의 배수인 해는 윤년.
				2)	4의 배수이면서 100의 배수인 해는 윤년이 아님.
				3)	100의 배수이면서 400의 배수인 해는 윤년.
		*/
	}

	private static void method5() {
		int result = 0;
		int increase = 1; //증가값
		
		for(int i=1; i<=15; i++) {
			increase = result;
			result = increase + i;
		}
		System.out.printf("15번째까지의 합: %d", result);
		
	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		int count = 0; //배수의 개수
		int sum = 0; //배수의 합
		
		for(int i=1; i<=1000; i++) {
			if(i<num | i%num !=0) {
				continue;
			}else {
				count += 1;
				sum += i;
			}
		}
		
		System.out.printf("%d의 배수 개수 = %d\n", num, count);
		System.out.printf("%d의 배수 합= %d\n", num, sum);
	}

	private static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.: ");
		int num = sc.nextInt();
		
		if(num>=1 & num<10) {//길면 거꾸로 짜기
			for(int i=1; i<=num; i++) {
				int result = 1;
				for(int j=1; j<=i; j++) {
					result *= j;
				}
				System.out.printf("%d ! = %d\n",i, result);
			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~100사이의 정수를 입력하세요.: ");
		int num = sc.nextInt();
		String result = num + "는(은) 소수입니다.";
		for(int i=2; i<num; i++) {
			if(num % i ==0) {
				result = num + "는(은) 소수가 아닙니다.";
				break;
			}
		}
		System.out.println(result);
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.: ");
		int num = sc.nextInt();
		if(num>=1 & num<=10) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
		
	}

}
