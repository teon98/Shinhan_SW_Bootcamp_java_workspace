package com.shinhan.day05;

//abstract class: 변수 + 상수 + 생성자 + 일반메서드 + 추상메서드
//규격서: 상수 + 추상메서드 + (새로 생긴 친구들: default메서드 + static메서드 + private메서드)
public interface RemoteController {
	public abstract void powerOn(); //public abstract 생략가능
	void powerOff(); //public abstract 기본으로 들어있는 것
	default void display() {
		System.out.println("모든 구현 class에 기능이 추가");
	}
	static void display2() {
		System.out.println("모든 구현 class에 기능추가...재정의 불가, interface 소유");
	}
}
