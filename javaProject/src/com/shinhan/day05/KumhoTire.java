package com.shinhan.day05;

public class KumhoTire extends Tire {
	String intro = "최고!!!";
	void method2() {
		System.out.println("금호타이어 우리만!!!");
	}
	@Override
	void roll() {
		System.out.println("KumhoTire...타이어가 굴러갑니다.");
		
	}
}
