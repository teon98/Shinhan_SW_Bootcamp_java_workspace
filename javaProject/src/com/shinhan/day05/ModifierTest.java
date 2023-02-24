package com.shinhan.day05;

import com.shinhan.day04.Phone;

//다른 패키지 연습
public class ModifierTest extends Phone{

	private void method() {
		System.out.println(model);
		f2(); //protected는 상속받았기 때문에 됨.
	}
	
	public static void main(String[] args) {
		Phone p = new Phone();
		//p.model = "갤럭시22";
		System.out.println(p);
		
		p.f1();
		//p.f2();
		//p.f3();
		//p.f4(); //private라 호출안됨.
	}

}
