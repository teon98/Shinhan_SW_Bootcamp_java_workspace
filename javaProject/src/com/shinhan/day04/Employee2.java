package com.shinhan.day04;

public class Employee2 {
	//멤버변수
	private String id; //사원번호
	private String name; //사원이름
	private int baseSalary; //사원의 기본급


	//생성자
	public Employee2(String id, String name, int baseSalary){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	//getter/setter 메소드
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(double bonus) {//보너스 값을 매개인자로 받아 봉급을 계산하여 반환
		double salary = baseSalary + (baseSalary * bonus);
		return salary;
	}
	
	public String toString() {
		return name + "사원의 기본급은 " + baseSalary + "원 입니다.";
	}
	
}
