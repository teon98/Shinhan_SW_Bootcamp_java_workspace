package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직각 역삼각형을 출력할 줄 수 : ");
		int line = sc.nextInt();
		
		for(int j=line; j>0; j--) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
