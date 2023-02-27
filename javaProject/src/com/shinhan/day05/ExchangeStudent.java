package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student{
	String[] language; 
	
	public ExchangeStudent(String stdId, String name, String[] language) {
		//1.부모에서 default 생성자를 정의
		//2.명시적으로 생성자를 호출(O - 지금 선택한 방법)
		super(stdId, name);
//		this.setStdId(stdId); super로 이미 초기화 완료! 이런 방법은 권장하지 않는다.
//		this.setName(name);
		this.language = language; //language는 ExchangeStudent의 변수이므로 초기화를 해야한다.
	}
	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 메서드");
	}
	
	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}
	
//	@Override
//	public String toString() {
//		String praent_toString = super.toString();
//		return "ExchangeStudent [language=" + Arrays.toString(language) + "]";
//	}
	
	
	
	
}
