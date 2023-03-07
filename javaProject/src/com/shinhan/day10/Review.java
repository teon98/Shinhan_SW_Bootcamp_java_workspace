package com.shinhan.day10;

//----thread.start()하면 run()호출된다.
//1.Thread 상속
class MyThreadA extends Thread{
	
	MyThreadA(String string){
		super(string);
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(getName() + ":" + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//2.이미상속중이라면 Runnable interface 구현
class ThreadB extends Object implements Runnable{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Review {

	public static void main(String[] args) {
		Thread t1 = new MyThreadA("쓰레드A");
		Thread t2 = new Thread(new ThreadB());
		//익명 구현으로 Thread 만들기
		Thread t3 = new Thread() {
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println(getName() + ":" + i);
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		//익명 구현으로 Runnable 쓰레드 만들기
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start(); t2.start(); t3.start(); t4.start();
		System.out.println("main end");
	}

}
