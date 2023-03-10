package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		forTest4();

	}

	private static void forTest4() {
		// 1~10 합계
		int su = 1;
		int total = 0;
		for(;su<=10;++su) {
			if(su%2 !=0) continue; //반복문을 빠지지 않고 아래 문장을 무시한 후 계속 진행
			
			total += su;
			System.out.print(su + (su == 10? "" : "+"));
		}
		System.out.println("=" + total);
	}

	private static void whileTest2() {
		//1~10까지 출력한다.
		int i=100;
		do {
			if(i<=10) break;
			System.out.println(i);
			System.out.println("------------");
			i++;
		}while(i<=10);
		System.out.println("method end..." + i);
		
	}

	private static void whileTest() {
		//1~10까지 출력한다.
		int i=1;
		while(true) {
			if(i<=10) break;
			System.out.println(i);
			System.out.println("------------");
			i++;
		}
		System.out.println("method end..." + i);
	}

	private static void forTest2() {
		//1~10까지 출력한다.
		int i=1;
		for(;;i++) {
			if(i>10) break;
			System.out.println(i);
			System.out.println("-------------");
		}
		System.out.println("\nmethod end..." + i);
	}

	private static void forTest1() {
		//1~10까지 출력한다.
		int i;
		for(i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nmethod end..." + i);
	}

}
