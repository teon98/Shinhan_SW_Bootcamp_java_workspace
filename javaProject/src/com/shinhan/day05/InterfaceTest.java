package com.shinhan.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InterfaceTest {

	public static void main(String[] args) {
		//f5();
		f3();
		//f2();
		//f1();

	}

	private static void f5() {
		String[] arr = new String[] {"자바", "SQL", "WEB", "Spring"};
		//List, Set, Map (interface)
		//List interface : 순서 있고 중복허용 ArrayList, Vector, LinkedList 
		//Set: 순서 없고 중복허용안함
		List<String> data = new LinkedList<String>();//기본으로 10개짜리 공간이 만들어지고 11번째의 데이터가 들어올때 10개의 추가 공간이 더 생긴다.
		data.add("10");
		data.add("자바");
		data.add("SQL");
		data.add("WEB");
		data.add("Spring");
		print(data);
	}

	static void print(List<String> data) {
		for(String s:data) {
			System.out.println(s);
		}
		
	}

	private static void f3() {
		f4(new Television());
		f4(new Audio());
	}

	//자동형변환 + override ==> 다형성
	//사용법은 같고 결과는 다양하다.
	private static void f4(RemoteController rc) {
		rc.powerOn();
		rc.powerOff();
		rc.display();
		RemoteController.display2(); //static method
		if(rc instanceof Audio audio) {
			audio.wifiTurnOn();
		}
		
		if(rc instanceof Wifi wf) {
			wf.wifiTurnOn();
		}
	}

	private static void f2() {
		String s1 = "Z";
		String s2 = "A";
		System.out.println(s1.compareTo(s2));
	}

	private static void f1() {
		// 1.객체 새성
		OracleDB db = new OracleDB();
		SybaseDB db2 = new SybaseDB();
		
		// OracleDB사용
		// SybaseDB사용
		use(db2);
	}

	private static void use(JDBCInterface db) {
		db.dbConnect("데이터베이스!!");
	}

}
