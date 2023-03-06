package com.shinhan.day09;

public class 확인문제14 {

	public static void main(String[] args) {
		
		//ThreadExample();//2번
		//ThreadExample2();//6번
		ThreadExample3(); //8번
		
	}

	private static void ThreadExample3() {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}

	}

	private static void ThreadExample2() {
		Thread thread = new MovieThread2();
		thread.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		thread.interrupt();
	}

	private static void ThreadExample() {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		//익명으로 만드는 방법이 더 좋을 듯 하다.
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++) {
					System.out.println("동영상을 재생합니다.");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {}
				}
			}
		});
	}

}


class MovieThread2 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			//구현
			if(Thread.interrupted()) break;
		}
	}
	
}

class MovieThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
	
}

class MusicRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("음악 재생합니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
	
}
