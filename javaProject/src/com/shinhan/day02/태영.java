package com.shinhan.day02;

import java.util.Scanner;

public class 태영 {

	public static void main(String[] args) {
		
		//method1(); //3장1번
		//method2(); //3장2번
		//method3(); //3장3번
		//method4(); //3장4번
		//method5(); //3장5번
		//method6(); //3장6번
		//method7(); //3장7번
		
		//4장 1번 답: 2 
		//method8(); //4장2번
		//method9(); //4장3번
		//method10(); //4장 4번
		//method11(); //4장 5번
		//method12(); //4장 6번
		method13(); //4장 7번
	}

	private static void method13() {
		Scanner sc = new Scanner(System.in);
		int my_money = 0;
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("예금액>");
				my_money += sc.nextInt();
			}else if(choice ==2) {
				System.out.print("출금액>");
				my_money -= sc.nextInt();
			}else if(choice ==3) {
				System.out.printf("잔고>%d\n",my_money);
			}else if(choice ==4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

	private static void method12() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void method11() {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((4*x + 5*y) == 60){
					System.out.printf("(%d, %d)\n",x,y);
				}
			}
		}
		
	}

	private static void method10() {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			if(num1+num2 == 5) {
				System.out.printf("(%d , %d)\n",num1, num2);
				System.out.println("주사위 눈의 합이 5입니다.");
				break;
			}
			
			System.out.printf("(%d , %d)\n",num1, num2);
		}
	}

	private static void method9() {
		int sum = 0;
		for(int i=3; i<=100; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}

	private static void method8() {
		String grade = "B";
		
		int score1 = switch (grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100-20;
				yield result;
			}
			default -> 60;
		};
		
		System.out.println("score1: " + score1);
	}

	private static void method7() {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if(Double.isNaN(z)) {//정답
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z+10;
			System.out.println("결과: " + result);
		}
	}

	private static void method6() {
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5)); //정답: true
		System.out.println((x%3 == 2) || (y%2 != 1));//정답: false
		
	}

	private static void method5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		//double area = (lengthTop + lengthBottom)*height/2.0; - 1 
		//double area = (lengthTop + lengthBottom)*height*1.0/2; - 2 
		//double area = (double)(lengthTop + lengthBottom)*height/2; - 3
		double area = (double)((lengthTop + lengthBottom)*height/2); //4(52.0)이 나옴
		System.out.println(area);
		//정답: 1,2,3
	}

	private static void method4() {
		int value = 356;
		System.out.println((value/100)*100);//정답
	}

	private static void method3() {
		int pencils = 543;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils/students; //정답
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils % students; //정답
		System.out.println(pencilsLeft);
		
	}

	private static void method2() {
		int score = 85;
		String result = ((!(score>90)))?"가":"나";
		System.out.println(result);//정답:가
	}

	private static void method1() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); //정답:31
	}

}
