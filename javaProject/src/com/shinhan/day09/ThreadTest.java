package com.shinhan.day09;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...시작");
		
		Thread t1 = new MyThread1(); //부모=자식 //대문자 찍기
		Thread t2 = new MyThread2(); //부모=자식 //숫자 찍기
		
		Runnable r = new MyThread3(); //부모=자식 //소문자 찍기
		Thread t3 = new Thread(r);
		//쓰레드가 run을 수행하도록 한다.
		t1.start(); //run()호출
		t2.start();
		t3.start();
		for(int i=100; i<=210; i++) {
			System.out.println(Thread.currentThread().getName()+ i + "!!!!!"); //main
		}
		
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...끝");
	}

	private static void f2() {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...f2");
//		for(int i=1; i<=26; i++) {
//			System.out.println(Thread.currentThread().getName() + "i=" + i);
//		}
		
	}

	private static void f1() {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...f1");
//		for(char i='A'; i<='Z'; i++) {
//			System.out.println(Thread.currentThread().getName() + "i=" + i);
//		}
	}

}
