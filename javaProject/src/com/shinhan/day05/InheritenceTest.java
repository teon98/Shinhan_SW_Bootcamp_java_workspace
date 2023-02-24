package com.shinhan.day05;

class Parent{
	int a = 10;
	Parent(){
		System.out.println("부모생성");
	}
	void f1() {
		System.out.println("부모의 f1메서드");
	}
}

class Child extends Parent{
	String a = "자바"; //a가 이미 있다. 부모의 a가 필요없어져서 가져오지 않는다. 고로 a는 "자바"가 된다.
	int b = 20;
	Child(){
		super();
		System.out.println("Child생성");
	}
	void f1() {//오버라이딩
		super.f1();//부모의 f1();
		System.out.println("자식의 f1메서드");
	}
	void f2() {
		System.out.println("부모의 f2메서드");
	}
}

public class InheritenceTest {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.f1();
		ch.f2();
	}
}