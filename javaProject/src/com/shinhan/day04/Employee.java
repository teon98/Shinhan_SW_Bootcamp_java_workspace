package com.shinhan.day04;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	//멤버변수
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	//생성자
	public Employee(String name, String title, int baseSalary) {
		this.name = name + "님";
		this.title = title;
		this.baseSalary = baseSalary;
		getTotalSalary();
	}

	//일반메서드
	private int getTotalSalary() {
		if(title.equals("부장")) {//문자의 값을 비교할 땐 equals()를 사용하는 것에 주의한다.- 사용하지 않을 시엔 주소 값 비교
			totalSalary = baseSalary+(baseSalary*25/100); //(int)(baseSalary + baseSalay * 0.25)
		}else if(title.equals("과장")){
			totalSalary = baseSalary+(baseSalary*15/100);
		}else {
			totalSalary = baseSalary+(baseSalary*5/100);
		}
		return totalSalary;
	}
	
	public void print() {
		System.out.printf("%s 직급의 %s의 본봉은 %d원이고 총급여는 %d 원입니다.\n",title, name, baseSalary, totalSalary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, name, title, totalSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return baseSalary == other.baseSalary && Objects.equals(name, other.name) && Objects.equals(title, other.title)
				&& totalSalary == other.totalSalary;
	}

	@Override
	public int compareTo(Employee emp) {
		int result = title.compareTo(emp.title);
		int result2 = emp.baseSalary - baseSalary;
		if(result == 0) {
			return emp.totalSalary - totalSalary;
		}
		if(result == 0) {
			return result2;
		}
		return result;
	}
	
	
	
	
}
