package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		f8();
	}

	private static void f1() {
		//java.base모듈안에 java.lang.String class
		//기본형이 아님.
		//String: 고정문자열 
		//""는 리터럴.
		String s1 = "자바"; //컴파일 시점 .class의 상수pool에 집어넣음. 클래스가 로드될 때 class pool에 옮겨놓게 됨. 
		String s2 = "자바"; //상수는 한번 만들어지면 끝나기 때문에 s2는 같은 "자바"를 가리키게 됨.
		String s3 = new String("자바"); //new는 실행시점에 만들어짐.
		String s4 = new String("자바"); 
		System.out.println(System.identityHashCode(s1)); //93122545
		System.out.println(System.identityHashCode(s2)); //93122545
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s3)); //2083562754
		System.out.println(System.identityHashCode(s4)); //1239731077
		s1 = s1 + "프로그램";
		s2 = s2 + "프로그램";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		//dangling - 가비지 컬렉터: 아무도 참조하지 않는 값을 찾아 자동으로 정리해주는 것
	}
	
	private static void f2() {
		String str1 = "자바 \n'프로그램' \t완\\성";
		String str2 = "자바 \"프로그램\" 완성";
		String str3 = "{\"name\":\"홍\", \"age\":20}"; //json - javascript 형태의 문자열 (데이터 교환용으론 최고! - 원래는 xml)
		String str4 = """
				{ "name": "홍", "age": 20}
				""";
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
		
	}
	
	private static void f3() {
		//**자동 형변환 (사이즈를 알고 있어야 하는 이유)
		//큰방 = 작은값
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//          char(2)
		//boolean
		byte v1 = 127;
		short v2 = v1;
		int v3 = v1;
		long v4 = v1;
		float v5 = v1;
		double v6 = v1;
		System.out.println(v2); //short가 byte보다 방이 더 크다.
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		v3 = 10000;
		v4 = v3;
		v5 = v3;
		v6 = v3;
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
	}
	
	private static void f4() {
		//강제형변환... data손실가능성
		//작은방 = (작은방)큰값
		byte v1;
		int v3 = 130;
		v1 = (byte) v3;
		System.out.println(v1);
	}

	private static void f5() {
		byte v1 = 100;
		byte v2 = 100;
		//사칙연산식에서 byte가 int로 자동변환된다.
		byte v3 = (byte)(v1 + v2); //+연산자를 쓰면 int로 바뀐다. (byte) 붙여주기
		int v4 = v1 + v2;
		System.out.println(v3);
		System.out.println(v4);
	}
	
	private static void f6() {
		//자바기본타입: (목적) 데이터 저장 , 연산, 비교
		//byte, short, char, int, long, float, double, boolean
		//Wrapper Class : 자바기본타입 + 기능(함수)
		//Byte, Short, Character, Integer, Long, Float, Double, Boolean
		String score = "90";
		int i = 100;
		Integer i2 = 100;
		String str = String.valueOf(i); //문자로 바꿀때
		String str2 = i + ""; //잔머리로 문자로 바꾸기
		System.out.println(Integer.parseInt(score) + 10); //문자 + 숫자 => 문자
	}
	
	private static void f7() {
		int a=100;
		{
			int b=200;
			System.out.println(a+b);
		}//여기서 b가 없어짐.
		//block을 벗어나면 변수 사용 불가
		//System.out.println(a+b);
	}
	
	private static void f8() {
		int a=10;
		float b=20.12345f;
		System.out.println("!!a=" + a + ", !!b=" + b);
		System.out.println("--------------------------");
		//%-5d : -는 왼쪽정렬, d: decimal
		//%3.1f : 전체자리수.소수아래자리수 float, 
		System.out.printf("!!a=%-5d, !!b=%5.1f", a, b);
	}
}
