package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		int result = 0;
		int start = (num%2 != 0 ) ? 1 : 2; 

		for(int i=start; i<=num; i += 2) {
			result += i;
		}
			
		System.out.printf("결과 값 : %d",result);

	}

}
