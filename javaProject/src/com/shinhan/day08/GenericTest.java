package com.shinhan.day08;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		whildcardTest();
		whildcardTest2();
		whildcardTest3();
		whildcardTest4();
//		HappyBox<String> box1 = Boxing("해피박스kind");
//		HappyBox<Integer> box2 = Boxing(100);
//		HappyBox<Money> box3 = Boxing(new Money(200));
//		
//		System.out.println(box1);
//		System.out.println(box2);
//		System.out.println(box3);
	
		//method2();
		method3();
	}
	
	private static void whildcardTest4() {
		HappyBox<String> box = new HappyBox<String>("A",10);
		whildf1(box);
		HappyBox<Integer> box2 = new HappyBox<Integer>(5,10);
		//whildf2(box2);
		HappyBox<Parent> box3 = new HappyBox<Parent>(new Parent(),10);
		whildf3(box3);
	}
	
	private static void whildf3(HappyBox<? super ChildA> param) {
		System.out.println("f3");
	}
	
	private static void whildf2(HappyBox<? extends Number> param) {
		System.out.println("f2");
	}

	private static void whildf1(HappyBox<?> param) {
		System.out.println("오늘 뭐먹지?");
	}
	
	private static void whildcardTest3() {
		// <? super Worker>
		Course.registerCourse3(new Applicant<Person>(new Person()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

	
	private static void whildcardTest2() {
		// ?, extend, Student: Student, Student 하위
		//Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

	private static void whildcardTest() {
		// ?, extend, super
		Course.registerCourse(new Applicant<Person>(new Person()));
		Course.registerCourse(new Applicant<Student>(new Student()));
		Course.registerCourse(new Applicant<Worker>(new Worker()));
		Course.registerCourse(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

	private static void method3() {
		genericExtendsMehotd(new ChildA()); //상속에 대한 제한을 걸겠다.
		genericExtendsMehotd(new ChildB()); 
		//genericExtendsMehotd(new Money(100));
		
		method4(new HappyBox<>("사과",0));
		method5(new HappyBox<>(500,0));
		method6(new HappyBox<>("aa",0));
	}
	
	private static void method6(HappyBox<? super Number> param) {
		System.out.println("? extends Number: Number의 자신과 상위만 가능");
	}
	
	private static void method5(HappyBox<? extends Number> param) {
		System.out.println("? extends Number: Number의 자식만 가능");
	}
	
	//제네릭타입 제한(extend, super, ?)
	private static void method4(HappyBox<?> param) {
		System.out.println("?는 제한이 없다.....");
	}

	private static <T extends Parent> void genericExtendsMehotd(T param) {
		System.out.println("genericExtendsMehotd......");
	}

	private static void method2() {
		Integer a = 10;
		Integer b = 20;
		boolean result = compare(a,b);
		System.out.println(result);
		
		String s1 = new String("자바");
		String s2 = new String("자바");
		//result = compare(s1, s2); //타입에 제한을 걸어서 Number 하위가 아니므로 불가
		//System.out.println(result);
	}

	//타입에 제한걸기: extends Number는 Number를 상속받은 하위 Class만 가능의 의미
	public static <T extends Number> boolean compare(T a, T b) {
		return a.equals(b);
	}
	
	private static <T> HappyBox<T> Boxing(T kind) {
		return new HappyBox<>(kind,1000);
	}
	
	private static <T,A,B> int Boxing2(T kind, A a, B b, String s) {
		return 100;
	}

	private static void f5() {
		Product<String, Integer> p1 = new Product<String, Integer>("책", 1000); //주의! int가 아닌 Integer야 해 (기본형이 아닌 객체!)
		Product<String, Integer> p2 = new Product<String, Integer>("책", 2000);
		System.out.println(p1);
		System.out.println(p1.equals(p2));
	}

	private static void f4() {
		ArrayList<Money> data = new ArrayList<>();
		data.add(new Money(1));
		data.add(new Money(10));
		data.add(new Money(12));
		data.add(new Money(16));		
		for(Money s:data) {
			System.out.println(s);
		}
	}

	private static void f3() {
		//E: Element
		ArrayList<String> data = new ArrayList<>();
		data.add("월요일");
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		for(String s:data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		HappyBox<String> b1 = new HappyBox<String>("딸기", 100);
		HappyBox<String> b2 = new HappyBox<>("컴퓨터", 100);
		HappyBox<String> b3 = new HappyBox<>("책", 100);
		
		String s1 = b1.kind;
		String s2 = b2.kind;
		String s3 = b3.kind;
		
		HappyBox<Money> b4 = new HappyBox<Money>(new Money(10), 100);
		HappyBox<Money> b5 = new HappyBox<>(new Money(3), 100);
		HappyBox<Money> b6 = new HappyBox<>(new Money(3), 100);
		Money m1 = b4.kind;
		Money m2 = b5.kind;
		Money m3 = b6.kind;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m2.equals(m3));
	}

	private static void f1() {
		//제네릭스 사용하지 않은 예제 - 불편하다!
		Box b1 = new Box("딸기", 100);
		Box b2 = new Box(500, 100);
		Box b3 = new Box(new Money(300), 100);
		
		String s1 = (String)b1.kind;
		int s2 = (Integer)b2.kind;
		//String m = (String)b3.kind;
		Money m = (Money)b3.kind;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}

}
