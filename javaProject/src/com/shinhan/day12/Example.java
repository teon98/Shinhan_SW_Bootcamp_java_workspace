package com.shinhan.day12;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEngScore());
		double mathAvg = avg(s->s.getMathScore());
		
		System.out.println(englishAvg);
		System.out.println(mathAvg);
		
		System.out.println("-----------------");
		double englishAvg2 = avg2(s->s.getEngScore());
		double mathAvg2 = Arrays.stream(students)
				.mapToInt(s->s.getMathScore())
				.average().orElse(0);
	
		System.out.println(englishAvg);
		System.out.println(mathAvg);
	}
	
	//람다표현식과 스트림 사용 예제
	private static double avg2(ToIntFunction<Student> f) {
		return Arrays.stream(students).mapToInt(f).average().orElse(0);
	}

	//람다표현식만 사용한 예제
	private static double avg(Function<Student> f) {
		double result = 0;
		for(Student s : students) {
			double d = f.apply(s);
			result += d;
		}
		return result;
	}
}
