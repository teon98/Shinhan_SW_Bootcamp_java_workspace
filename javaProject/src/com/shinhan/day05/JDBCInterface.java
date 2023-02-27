package com.shinhan.day05;

//interface: 규격서(정의있고 구현없음)
public interface JDBCInterface {
	//1.상수(변수는 불가)
	public static final String JDBC="JAVA Database Connection";
	//[public static final] 생략가능
	String JDBC2="JAVA Database Connection";
	//2.추상메서드: public abstract 생략 가능
	public abstract void dbConnect(String dbName);
	void dbConnect2(String dbName);//생략하면 기본이 public abstract
	//3.상위버전에서 추가된 default method: public 생략가능
	public default void select() {
		System.out.println("default method: 인터페이스를 구현한 모든 class의 공통코드");
		System.out.println("구현 class에서 재정의 가능하다.");
		insert();
	}
	//4.상위버전에서 추가된 static default method
	static void update() {
		System.out.println("static method: 인터페이스 소유의 코드");
		System.out.println("구현 class에서 재정의 불가능하다.");
		insert2();
	}
	//5.private: default에서 호출
	private void insert() {
		System.out.println("----------------------------------");
	}
	//6.private static:static에서 호출
	private static void insert2() {
		System.out.println("----------------------------------");
	}
}
