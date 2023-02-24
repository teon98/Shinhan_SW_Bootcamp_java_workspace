package com.shinhan.day04;

public class EmployeeExam {

	public static void main(String[] args) {
		Employee[] person = new Employee[4];
		
		person[0] = new Employee("이부장","부장", 1500000);
		person[1] = new Employee("김과장","과장", 1300000);
		person[2] = new Employee("최대리","대리", 1200000);
		person[3] = new Employee("박사원","사원", 1000000);
		
		for(Employee s: person) {
			s.print();
		}
	}

}
