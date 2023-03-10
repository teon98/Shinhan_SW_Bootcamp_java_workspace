package com.shinhan.day01;

public class VariableTest2 {

	public static void main(String[] args) {
		System.out.println("main시작");
		//f1();
		//f2();//함수 호출(갔다가 돌아온다)
		f3();
		System.out.println("main끝");
	}

	private static void f1() {
		int a;
		System.out.println(a=10);
		System.out.println(a==10);
		
	}
	
	private static void f2() {
		//자바의 dataType : 
		//정수(byte-1, short-2, char-2, integer-4, long-8)
		//실수(float-4, double-8)
		//boolean-1(true, false)
		//00000000
		//01111111(양수) : 127
		//11111111(음수) : -128
		byte v1 = 127;//128넣으면 에러 뜸(범위를 초과했기 때문)
		byte v2 = -128;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		v1++;v1++;v1++;
		System.out.println(v1);//범위 안에 있는 값을 초과하면 마이너스 값이 뜬다.(값이 돈다.)
	}
	
	private static void f3() {
		short v1 = 32767; //음수 있음.
		char v2 = 'A'; //단일문자만 가능, '' 안됨., " "안됨.(이건 string). 음수가 없음
		int v3 = Integer.MAX_VALUE; //2,147,483,647
		System.out.println(v3);
		long v4 = 2147483648L; //뒤에 L(l)을 붙여줘야 한다.
		
		float v5 = 3.14f; //뒤에 F(f)을 붙여줘야 한다.
		double v6 = 3.14;
		
		char v7 = 65;
		char v8 = 0x0041;
		System.out.println(++v7);
		System.out.println(++v8);
		
		boolean result;
		result = 10 > 20;
		System.out.println(result);
	}

}
