package com.shinhan.day09;

//멀티쓰레드 만드는 방법
//1.extends Thread....run()메서드 재정의하여 구현
//2.이미 부모 class를 상속받은 경우는 Runnable interface를 구현한다.
//이 경우 Thread가 아니라 Thread인 척 하는 칭구
public class MyThread3 extends Object implements Runnable{

	@Override
	public void run() {
		for(char i='a'; i<='z'; i++) {
			System.out.println("["+ Thread.currentThread().getName() +"]"+ "i=" + i);
		}
	}
	
}
