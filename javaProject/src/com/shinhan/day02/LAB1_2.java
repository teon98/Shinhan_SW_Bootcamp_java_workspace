package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String word = sc.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			System.out.println((word.substring(0,i+1)).toUpperCase());
		}
		sc.close();
	}

}
