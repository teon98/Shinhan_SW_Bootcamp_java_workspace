package com.shinhan.day05;

public class OracleDB extends Object implements JDBCInterface{

	@Override
	public void dbConnect(String dbName) { //접근제한자는 같거나 더 넓어야한다!
		System.out.println("상수접근: " + JDBC);
		System.out.println("상수접근: " + JDBC2);
		//default 메서드 호출
		select();
		//static 메서드 호출
		JDBCInterface.update();
		//private는 호출이 불가하다.
	}
	
	/*
	public void select() {
		System.out.println("select 재정의  가능");
	} */

	@Override
	public void dbConnect2(String dbName) {
		System.out.println(dbName + "OracleDB dbConnect2");
	}
	
}
