package com.shinhan.day06;

/*
 1.변수: data를 저장하기위한 기억장소, 값 수정 가능
 2.상수: data를 저장하기위한 기억장소이름, 값 수정 불가능
 3.enum: 관련있는 상수 묶음
 4.method: 문장들의 묶음
 5.class: object를 만드는 틀, 변수+상수+method
 6.object: class로 new한 실체
 7.interface: 규격서 상수+추상 메서드+default method+static method
 */

abstract class ParentClass{
	abstract void method1();
}

//규격서
interface MyInterface{
	void method2();
}

interface MyInterface2{
	void method2_1();
}

interface MyInterface3 extends MyInterface, MyInterface2{ //interface를 상속받을 수 있다. (다중상속)
	void method3_1();
}



class MyClass1 extends ParentClass implements MyInterface3{

	@Override
	void method1() {}
	@Override
	public void method2() {} //interface에 (default)이기 때문에 더 넓은 접근 제한자를 가져야 한다.
	@Override
	public void method2_1() {}
	@Override
	public void method3_1() {}
}

class MyClass2 extends ParentClass implements MyInterface3{

	@Override
	void method1() {}
	@Override
	public void method2() {} 
	@Override
	public void method2_1() {}
	@Override
	public void method3_1() {}
}

public class Review {
	public static void main(String[] args) {
		ParentClass v1 = new MyClass2(); //자식은 부모에 담을 수 있다. 부모 = 자식 (부자 - 자동변환) 대신 부모안의 메서드만 보인다.
		work(v1);
	}
	
	static void work(ParentClass aa) {
		aa.method1();
		System.out.println(aa instanceof MyClass1);
		System.out.println(aa instanceof ParentClass);
		System.out.println(aa instanceof MyInterface);
		System.out.println(aa instanceof MyInterface2);
		System.out.println(aa instanceof MyInterface3);
		
		if(aa instanceof MyInterface3 my) {//강제형변환을 줄이기 위해 만든 코드
			my.method2();
			my.method2_1();
			my.method3_1();			
		}
	}
}
