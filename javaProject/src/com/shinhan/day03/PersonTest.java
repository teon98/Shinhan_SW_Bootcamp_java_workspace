package com.shinhan.day03;

public class PersonTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Person[] persons = new Person[3];
		
		persons[0] = new Person();
		persons[1] = new Person(30, "홍길동");
		persons[2] = new Person(20, "기와집");
		
		for(Person p:persons) {
			p.selfIntroduce();
		}
		
		System.out.println(Person.getPopulation());
	}

}
