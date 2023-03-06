package com.shinhan.day09;

//멀티쓰레드 만드는 방법
//1.extends Thread....run()메서드 재정의하여 구현
public class MyThread1 extends Thread{
	
	//다른 곳에 영향을 주지 않기 위해 기본 생성자 생성
	public MyThread1() {}
	
	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.println("["+ getName() +"]"+ "i=" + i);
		}

		super.run();
	}
	
}
