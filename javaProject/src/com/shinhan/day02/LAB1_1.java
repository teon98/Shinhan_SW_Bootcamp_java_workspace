package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("초기값을 정수로 입력하세요.:");
		int first_num = sc.nextInt();
		
		System.out.print("마지막 값을 정수로 입력하세요.:");
		int last_num = sc.nextInt();
		
		System.out.print("증가분을 정수로 입력하세요.:");
		int count_num = sc.nextInt();
		
		int result = 0;
		for(int i=first_num; i<=last_num; i+=count_num) {
			result += i;
		}
		
		System.out.printf("총합은 %d 입니다.", (result >= 1000) ? result + 2000 : result);

	}

}
