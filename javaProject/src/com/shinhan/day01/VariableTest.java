package com.shinhan.day01;

//class = 변수 + 함수
//VariableTest.java -> 컴파일 VariableTest.class
//실행
//1. JVM이 VariableTest Class를 Loader에 의해 Load한다.(메모리에 올린다.) (static만 method 영역에 올라간다.)
//2. 검증
//3. main시작 
public class VariableTest {
	int score = 100; //인스턴스 변수 - static이 없는 변수
	public static void main(String[] args) {
		//1. 변수선언
		int a; //지역 변수(local) 
		// System.out.println(a); - 지역 변수는 초기화하지 않으면 사용불가
		
		/*System.out.prinln(score); - static이 non-static 사용불가
		  메모리에 올라가는 시점이 다름, static이라 써져있는 부분이 메모리에 올라감
		*/
		
		//2. 변수사용
		a=10; //할당
		
		System.out.println(a); //읽기
		System.out.println(a+20); //읽기
		
		//3. 선언+사용
		int a2=30;
		System.out.println(a2);
	}

}
