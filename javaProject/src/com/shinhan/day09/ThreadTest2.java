package com.shinhan.day09;

public class ThreadTest2 {

	public static void main(String[] args) {
		f1();
		System.out.println("main End");
	}

	private static void f1() {
		//Thread를 익명구현객체로 만들기
		//Thread t1 = new MyThread1(); //부모=자식 //대문자 찍기
		//Thread t2 = new MyThread2(); //부모=자식 //숫자 찍기
		
		//Runnable r = new MyThread3(); //부모=자식 //소문자 찍기
		//Thread t3 = new Thread(r);
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(char i='A'; i<='Z'; i++) {
					System.out.println("["+ getName() +"]"+ "i=" + i);
					try {
						sleep((int)Math.random()*100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				super.run();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=26; i++) {
					System.out.println("["+ getName() +"]"+ "i=" + i);
				}
				try {
					sleep((int)Math.random()*100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				super.run();
			}
		};
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(char i='a'; i<='z'; i++) {
					System.out.println("["+ Thread.currentThread().getName() +"]"+ "i=" + i);
					try {
						Thread.sleep((int)Math.random()*100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();//run()호출
		t2.start();//run()호출
		t3.start();//run()호출
	}

}
