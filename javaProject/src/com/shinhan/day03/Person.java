package com.shinhan.day03;

public class Person {
	//멤버변수: instance변수, static 변수(instance변수공유변수)
	static private int numberOfPersons; //전체 인구 수 
	int age;
	String name;
	
	//생성자
	public Person() {
		this(12, "Anonymous");
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons ++;
	}
	
	//일반메서드
	public void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d입니다.\n",name, age);
	}
	
	static public int getPopulation() {
		return numberOfPersons;
	}
}
