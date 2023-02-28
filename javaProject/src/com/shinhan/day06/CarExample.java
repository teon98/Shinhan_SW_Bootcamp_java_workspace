package com.shinhan.day06;

class Car{
	class Tire{}
	static class Engine{}
	void go(int score2) {
		int score = 100;
		//score = 300; final이라서 사용도 못함.
		//score2 = 400; final이라서 사용 못함.
		class LocalClass{
			void f1() {
				//score=300; final이라서 수정안됨.
				//score2 = 400; final이라서 수정안됨.
				System.out.println(score);
				System.out.println(score2);
			}
		}
		LocalClass v1 = new LocalClass();
		System.out.println(v1);
		v1.f1();
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.go(200);
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
	
	}
}
