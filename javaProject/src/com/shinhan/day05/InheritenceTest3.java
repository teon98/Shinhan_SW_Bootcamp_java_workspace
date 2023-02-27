package com.shinhan.day05;

class A{}
class B extends A{}
class C extends A{}
class D extends B{int max = 100;}
class E extends B{}
class F extends C{}
public class InheritenceTest3 {

	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
		//f4();
		f5();
	}

	private static void f5() {
		//자동형변환: 부모타입 = 자식객체
		D v1 = new D(); 
		B v2 = new D(); 
		A v3 = new D(); 
		System.out.println(v1.max);
		//System.out.println(v2.max);
		//강제형변환: 자식타입 = (자식타입) 부모타입객체
		D v4 = (D) v2;
		System.out.println(v4.max);
		D v5 = (D) v3;
		System.out.println(v5.max);
		
		//E v6 = (E) v2; //컴파일시 오류 - v2는 D였고 E와 D는 형제 객체이다.
		//본래 생성된 Instance로만 형변환이가능하다.
		
		//E v7 = (E) v3;
		
		//형변환가능한지 체크하자
		System.out.println(v3 instanceof D?"OK":"NO형변환불가");
		System.out.println(v3 instanceof E?"OK":"NO형변환불가");
		if(v3 instanceof D dd) { //12버전부터 형변환결과받을 변수추가됨
			System.out.println(dd.max);
		}
		
	}

	private static void f4() {
		//다형성
		CarTest car = new CarTest();
		car.go(new HankookTire()); //한국타이어의 roll()이 실행됨.
		car.go(new KumhoTire()); //금호타이어의 roll()이 실행됨.
	}

	private static void call(Animal animal) {
		//공통적인 모듈 작성시 객체를 생성하는 업무와 객체를 사용하는 업무가 분리되는 것임.
		//이때 부모 타입을 받아야 함.
		animal.method1();
		if(animal instanceof Dog) {
			Dog d2 = (Dog) animal;
			d2.method3();
			System.out.println(d2.a + d2.c);
		}else if(animal instanceof Cat) {
			Cat c2 = (Cat) animal;
			c2.method2();
			System.out.println(c2.a + c2.b);
		}
	}
	
	private static void f3() {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
	
		//c1.method1();
		//d1.method1(); //자식들이 코드를 가지고 있지 않더라도 부모가 가지고 있기 때문에 호출 가능.
		call(c1);
		call(d1);
		
	}

	private static void f2() {
		//field, method는 instance가 아닌 타입을 따른다.
		//Type이 Animal
		Animal c1 = new Cat();
		System.out.println(c1.a); //부모의 a
		//System.out.println(c1.b); //볼 수 없다.
	
		c1.method1();
		//c1.method2(); //볼 수 없다.
		
	}

	private static void f1() {
		Cat c1 = new Cat();
		System.out.println(c1.a);
		c1.method1();
	}

}
