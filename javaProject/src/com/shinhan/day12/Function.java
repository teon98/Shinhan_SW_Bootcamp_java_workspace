package com.shinhan.day12;


//interface: 규격서 (반드시 규칙을 지켜라)
//정의되어 있는 추상메서드를 구현class가 반드시 구현해야 한다.
//T는 제네릭타입...사용시 결정한다.
//람다표현식으로 가능한 interface이고자한다. -> 추상메서드가 1개만 존재해야한다.
//람다표현식이 아니라면 구현class만들거나 익명구현class를 만든다. -> 추상 메서드 여러개 가능

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
	//public double apply2(T t);//함수가 2개면 람다식을 쓸 수 없다.
}
