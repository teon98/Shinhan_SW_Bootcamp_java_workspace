package com.shinhan.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleConnectTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//String sql = "select * from EMPLOYEES where employee_id = 100";
		//String sql = "select * from EMPLOYEES";	
		System.out.println("조회하고자 하는 직원이름 입력 >>");
		Scanner sc = new Scanner(System.in);
		
		String inputName =  sc.nextLine();
		
		String sql = "select first_name, salary, hire_date"
				+ " from employees " 
				+ " where lower(first_name) = lower('" + inputName + "')";
		
		//1.driver load 
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.dirver load성공");
		
		//2.Connection
		//String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:mysql://localhost/hr";
		String userid = "hr";
		String pass = "hr";
		Connection conn = DriverManager.getConnection(url, userid, pass);
		System.out.println("2.Connection성공");
		
		//3.Statement를 통해서 SQL전송
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString("first_name"));
			System.out.println(rs.getInt("salary"));
			System.out.println(rs.getString("hire_date"));
			System.out.println("---------------------------------------");
		}
		
		rs.close();
		st.close();
		conn.close();
	}

}
