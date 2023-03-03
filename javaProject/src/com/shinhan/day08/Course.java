package com.shinhan.day08;

public class Course {

	public static void registerCourse(Applicant<?> applicant) {//? : 제한을 걸고 싶지 않소! 아무나 들어오시오!
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한 과정임...모두");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한 과정임...Student, HighStudent, MiddleStudent");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한 과정임...Worker, Person");
	}
}


