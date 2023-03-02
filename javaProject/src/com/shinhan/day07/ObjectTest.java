package com.shinhan.day07;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car{
	private String model;
	private int price;
	public Car(String model, int price) {
		super(); //Object를 상속받고 있다.
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	//동등비교를 위해선 해쉬코드와 equals를 함께 비교해줘야 한다.
	//동등비교(예, HashSet은 중복불가): hashCode(), equals()가 모두 같아야 같은객체로 판별.
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
		//f4();
		f5();
		//f6();
	}
	
	private static void f6() {
		//Set: 순서가 없다. 중복허용안함
		Set<String> data = new HashSet<String>(); //제네릭 => 이곳엔 꼭 문자만 들어가야해! 하고 고정시켜주는 것
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("화");
		data.add("수");
		data.add("월");
		data.add("월");
		for(String s:data) {
			System.out.println(s);
		}
	}

	private static void f5() {
		Set<Car> data = new HashSet<Car>();
		data.add(new Car("A", 100));
		data.add(new Car("C", 100));
		data.add(new Car("B", 100));
		data.add(new Car("F", 100));
		data.add(new Car("A", 100));
		data.add(new Car("A", 100));
		for(Car s:data) {
			System.out.println(s);
			System.out.println(s.hashCode());
			System.out.println("-----------");
		}
	}

	private static void f4() {
		Car obj1 = new Car("A모델", 1000);
		Car obj2 = new Car("B모델", 1000);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"주소같다.":"주소다르다"); //== 객체는 주소를 비교한다.
		//equals를 Car안에서 재정의하지 않으면 주소를 비교한다.
		System.out.println(obj1.equals(obj2)?"모델이같다.":"모델이다르다"); 
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

	private static void f3() {
		Date obj1 = new Date();
		Date obj2 = new Date();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"주소같다.":"주소다르다"); //== 객체는 주소를 비교한다.
		System.out.println(obj1.equals(obj2)?"날짜같다":"날짜다르다"); //Date equals() : 내용비교로 재정의됨
	}

	private static void f2() {
		String obj1 = new String("자바");
		String obj2 = new String();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"주소같다.":"주소다르다"); //== 객체는 주소를 비교한다.
		System.out.println(obj1.equals(obj2)?"내용같다":"내용다르다"); //String equals() : 내용비교로 재정의됨
	}

	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"주소같다.":"주소다르다"); //== 객체는 주소를 비교한다.
		System.out.println(obj1.equals(obj2)?"주소같다":"주소다르다"); //Object equals() : 객체의 주소비교
	}

}
