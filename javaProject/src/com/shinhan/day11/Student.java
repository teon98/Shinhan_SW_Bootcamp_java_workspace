package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=").append(name).append(", score=").append(score).append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Student obj) {
		int result = score - obj.score;
		if(result == 0) return obj.name.compareTo(name);
		return result;
	}
	

	
	
}
