package com.shinhan.day11;

//함수형표현: 람다식
//함수형 인터페이스 안에서 람다식은 함수가 2개 이상일 땐 사용할 수 없다.
//interface에 1개의 메서드만 존재해야한다.
@FunctionalInterface
public interface Calculable {
	//추상메서드 정의
	void calculate(int x, int y);
}
