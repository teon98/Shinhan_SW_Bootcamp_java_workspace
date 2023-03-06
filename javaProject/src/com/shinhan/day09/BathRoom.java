package com.shinhan.day09;

//공유영역
public class BathRoom {
	boolean isFirst = true;
	public void use(String name) {
		//방법2
		synchronized (this) {
			if(isFirst && name.equals("김씨")) {
				try {
					wait();//신호가 올때까지 기다려 //일시정지 상태로 간다. notify(), notifyAll()에 의해 신호오기전까지
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			isFirst = false;
			System.out.println(name + "입장한다.");
			System.out.println(name + "사용한다.");
			System.out.println(name + "퇴장한다.");
			System.out.println("---------------------");
			notifyAll();//신호를 보낸다. wait()상태에 있는 Thread가 실행대기상태(Runnable)로 간다.
		}
	}
	
	//방법 1
//	public synchronized void use(String name) {
//		System.out.println(name + "입장한다.");
//		System.out.println(name + "사용한다.");
//		System.out.println(name + "퇴장한다.");
//		System.out.println("---------------------");
//	}
}
