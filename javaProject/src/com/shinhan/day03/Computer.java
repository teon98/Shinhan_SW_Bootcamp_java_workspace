package com.shinhan.day03;

//JavaBeans기술 규격서: field는 private(정보은닉)
public class Computer {
	private String model; //인스턴스 변수
	private String os; //인스턴스 변수 
	private int price; //인스턴스 변수 - new하면 생성
	static int count; //변수: instance변수, static변수(class 변수 - 클래스당 한개 있는 것 (힙영역 X, 메소드 영역에 있다.), object가 공유하는 변수)
	
	//생성자 Overloading: 생성자 이름은 같고 매개변수 사양이다르다.
	//하나의 생성자가 다른모양의 생성자를 호출할 수 있다. ->this()
	public Computer(){ //public을 붙여주면 다른 패키지에서 new로 Computer 객체를 만들 수 있다.
		this("AA모델", "MAC", 500);
	}
	
	public Computer(String model) {
		this(model, null, 0);
	}
	
	public Computer(String os, int price) {
		this(null, os, price);
	}
	
	public Computer(String model, String os, int price) {
		System.out.println("**************arg3생성자로 생성*************");
		this.model = model;
		this.os = os;
		this.price = price;
		count++; //new할때마다 count 증가
	}
	
	//일반메서드
	public void computerInfoPrint() {
		System.out.println("model:" + model);
		System.out.println("os:" + os);
		System.out.println("price:" + price);
	}
	
	//정보은닉을 이용하기 위해 
	//data는 은닉하고 함수는 공개해라
	public String getModel() {
		return model;
	}
	
	public String getOs() {
		return os;
	}
	
	public int getPrice() {
		return price;
	}
}
