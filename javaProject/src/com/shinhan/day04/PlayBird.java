package com.shinhan.day04;

public class PlayBird {

	public static void main(String[] args) {
		Duck d = new Duck("꽥꽥이", 2, 15);
		d.fly();
		d.sing();
		//d.display();
		
		Sparrow s = new Sparrow("짹짹", 2, 10);
		s.fly();
		s.sing();
		//s.display();

		//toString메서드를 오버라이드 하지 않을 때
		//System.out.println(d); //주소가 나옴(hashCode를 16진수로 바꾼 것)
		//System.out.println(d.toString());
		
		System.out.println(d);
		System.out.println(s);
	}

}
