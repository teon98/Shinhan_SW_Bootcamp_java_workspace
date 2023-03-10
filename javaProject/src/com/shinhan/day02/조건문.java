package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		method4();

	}
	
	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월>>");
		int month = sc.nextInt();
		String message = "";
		
		//12이후 버전 : Expressions(표현식) 사용 가능
		switch (month) {
			case 12,1,2 -> message = "겨울";
			case 3,4,5 -> message = "봄";
			case 6,7,8 -> message = "여름";
			case 9,10,11 -> message = "가을";
			default -> message = "입력이 잘못되었습니다.";
		}
		
		System.out.println(message);
	}

	private static void method3() {
		//12 1 2 (겨울)
		//3 4 5 (봄)
		//6 7 8 (여름)
		//9 10 11 (가을)
		Scanner sc = new Scanner(System.in);
		System.out.print("월>>");
		int month = sc.nextInt();
		String message = "";
		if(month == 12 || month == 1 || month == 2) {
			message = "겨울이 왔어요";
		}else if(month == 3 || month == 4 || month == 5) {
			message = "봄이 왔어요";
		}else if(month == 6 || month == 7 || month == 8) {
			message = "여름이 왔어요";
		}else if(month == 9 || month == 10 || month == 11) {
			message = "가을이 왔어요";
		}else{
			message = "월 입력이 잘못되었습니다.";
		}
		
		System.out.println(message);
	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수>>");
		int score = sc.nextInt();
		String grade = "";
		
		//90-100 A
		//80-89 B
		//70-79 C
		//60-69 D
		//F
		switch (score/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D";break;
		default:
			grade = "F";
			break;
		}
		
		System.out.println("!!!결과는 " + score + "==>"+ grade);
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수>>");
		int score = sc.nextInt();
		String grade = "F";
		if(score >= 90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else if(score>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("!!!결과는 " + score + "==>"+ grade);
	}

}
