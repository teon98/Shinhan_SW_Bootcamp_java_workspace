package com.shinhan.day02;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		String subjects = "자바,DB#HTML CSS,JavaScript,React,Spring";
		String[] arr = subjects.split(",|#| ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[6]);
		for(String s:arr) {
			System.out.print(s+"\t");
		}
	}

	private static void f3() {
		//String은 고정문자열 
		String subject = "이것이 자바다";
		for(int index=0;index<subject.length();index++) {
			System.out.println(subject.charAt(index));
			System.out.println(subject.substring(index, index+1));
			System.out.println("--------------");
		}
		System.out.println(subject.replace("이", "A"));
		System.out.println(subject);
		subject = subject.replace("이", "BB");//대체
		System.out.println(subject);
		System.out.println(subject.indexOf("바다"));//indexOf는 위치
	}

	private static void f2() {
		String name = null; //null은 아직 값은 없지만 힙에 생성된 객체는 없다.
		System.out.println(name);
		System.out.println(name.length());
	}

	private static void f1() {
		int a = 10; //stack에 들어감(기본값이라)
		String s1 = "자바"; //컴파일시 class의 상수pool에 들어감. 
		String s2 = "자바"; //load시에 method영역에 상수 pool.
		String s3 = new String("자바");
		String s4 = new String("자바");
		System.out.println(s1 == s2); //주소같다.
		System.out.println(s3 == s4); //주소 다르다.
		s1 = s1 + "aa";
		s2 = s2 + "aa";
		System.out.println(s1 == s2);//다르다. - 문자열을 비교할 때 주소를 비교하지 말자.
		System.out.println(s1.equals(s2));//equals는 내용이 같은지 물어보는 함수
	}
}
