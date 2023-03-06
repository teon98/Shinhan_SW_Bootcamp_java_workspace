package com.shinhan.day09;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장합니다.");
	}
	
	@Override
	public void run() {
		while(true) {//run의 시그니처가 변할 수 없기 때문에 throw 할 수 없다.
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}
}
