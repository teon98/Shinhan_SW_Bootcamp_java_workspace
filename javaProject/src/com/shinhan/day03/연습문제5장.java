package com.shinhan.day03;

import java.util.Scanner;

public class 연습문제5장 {

	public static void main(String[] args) {
		//method7(); 
		//method8();
		method9();
	}

	
	private static void method9() {
		Scanner sc = new Scanner(System.in);
		
		int[] students = null;
		boolean switch_button = true;
		
		int best_score=0;
		int sum_score=0;
		int count_score=0;
		
		while(switch_button) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("학생수>");
				int input_students = sc.nextInt();
				students = new int[input_students];
				break;
			case 2:
				for(int i=0; i<students.length; i++) {
					System.out.printf("scores[%d]> ",i);
					int score = sc.nextInt();
					students[i] = score;
					sum_score += students[i];
					count_score += 1;
					
					if(students[i] > best_score) {
						best_score = students[i];
					}
				}
				break;
			case 3:
				for(int i=0; i<students.length; i++) {
					System.out.printf("scores[%d]: %d \n",i, students[i]);
				}
				break;
			case 4:
				System.out.println("최고 점수: " + best_score);
				System.out.println("평균 점수: " + (double)sum_score/count_score);
				break;
			case 5:
				System.out.println("프로그램 종료");
				switch_button = false;
			default:
				break;
			}
		}
		
	}


	private static void method8() {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total_sum = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				total_sum += array[i][j];
				count += 1;
			}
		}
		
		int total_avg = total_sum / count;
		System.out.println("전체 합: " + total_sum);
		System.out.println("전체 평균: " + total_avg);
		
	}

	private static void method7() {
		int [] array = {1,5,3,8,2};
		
		int max = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.printf("최댓값은 %d",max);
		
	}

}
