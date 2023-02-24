package com.shinhan.day04;

public class Sparrow {
	private String name;
	private int legs;
	private int length;
	
	public Sparrow(String name, int legs, int length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	public void fly(){
		System.out.printf("참새(%s)는 날아다닙니다.\n",name);
	}
	
	public void sing() {
		System.out.printf("참새(%s)가 소리내어 웁니다.\n", name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sparrow(참새) [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
//	public void display() {
//		System.out.printf("참새의 이름은 %s입니다. 다리는 %d개이고 길이는 %d입니다.\n", name, legs, length);
//	}
	
//	public String toString() {
//		return "참새의 이름은" + name + "입니다. 다리는 " + legs + "개이고 길이는 " + length + "입니다.";
//	}
	
	
}
