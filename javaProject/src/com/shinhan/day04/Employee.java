package com.shinhan.day04;

public class Employee {
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
	
}
