package com.shinhan.day07;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;

public class 확인문제12장 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//studentExample();//확인문제5번
		//MemberExample();//확인문제6번
		//method8(); //확인문제8번
		//DecodingExample(); //확인문제9번
		//StringBuilderExample(); //확인문제10번
		//method11(); //확인문제11번
		//IntegerCompareExample(); //확인문제12번
		method15(); //확인문제15번
	}

	private static void method15() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2023, 12, 31, 0,0,0);
		
		long remainDay = now.until(end, ChronoUnit.DAYS);
		
		System.out.println("남은 일: " + remainDay);
	}

	private static void IntegerCompareExample() {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		//이유: 포장 객체의 효율적 사용을 위해 int의 경우 -128~127 범위의 값을 갖는 포장 객체는 ==으로 비교가 가능하다.
		//단, 내부 값을 비교하는 것이 아니라 객체 번지를 비교한다.
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
		
		System.out.println(Math.round(5.7));
	}

	private static void method11() {
		String str = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

	private static void StringBuilderExample() {
		StringBuilder str = new StringBuilder("");
		for(int i=1; i<=100; i++) {
			str.append(i);
		}
		System.out.println(str);
	}

	private static void DecodingExample() throws UnsupportedEncodingException {
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str = new String(bytes, "utf-8");
		System.out.println("str: " + str);
	}

	private static void method8() {
		long start = System.nanoTime();
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		long end = System.nanoTime();
		System.out.println("걸린시간: " + (end-start));
	}

	private static void MemberExample() {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		
	}

	private static void studentExample() { 
		//Student를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		//Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); //같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("2"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 Studnet 수: " + hashSet.size());
	}

}

class Student{
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	//코드 작성
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}	
}

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	//코드 작성
	@Override
	public String toString() {
		return id + ":" + name;
	}	
}