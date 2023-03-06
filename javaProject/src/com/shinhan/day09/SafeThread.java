package com.shinhan.day09;

import lombok.Setter;

@Setter
public class SafeThread extends Thread{
	
	private boolean stop;//false가 default임
	
	public void run() {
		
		while(true) {
			System.out.println("SafeThread...실행중");
			if(Thread.interrupted()) break;
		}
		
		System.out.println("자원정리");
		System.out.println("SafeThread 종료");
	}
}
	
		
		//안전하게 종료 -2
		/*
		try {
			
			while(true) {
				System.out.println("SafeThread...실행중");
				sleep(1);
			}
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("자원정리");
		System.out.println("SafeThread 종료");
	}
	*/
	
	/*안전하게 종료 -1
	public void run() {
		while(!stop) {
			System.out.println("SafeThread...실행중");
		}
		System.out.println("자원정리");
		System.out.println("SafeThread 종료");
	}
	*/
