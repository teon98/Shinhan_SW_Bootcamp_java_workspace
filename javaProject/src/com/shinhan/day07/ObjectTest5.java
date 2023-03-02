package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//f1();
		//f2();
		//f3();
		//f4();
		//f5();
		//f6();
		f7();
	}

	private static void f7() throws IOException {
		InputStream is = ObjectTest5.class.getResourceAsStream("Person.class");
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i = ir.read())!=-1) {
			System.out.print((char) i);
		}
		is.close();
	
		URL url2 = ObjectTest5.class.getResource("연준이.jpg");
		System.out.println(url2.getPath());
	}

	private static void f6() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day07/Person.java");
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		fr.close();
	}

	private static void f5() throws ClassNotFoundException {
		Class cls = Person.class;
		Class cls2 = Class.forName("com.shinhan.day07.Person");
		Person person = new Person("AA", 10);
		Class cls3 = person.getClass();
		
		Method[] ms = cls.getDeclaredMethods();
		for(Method m :ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount()+"개 파라메터");
		}
		
		/*
		Field[] fs = cls.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f.getName());
			System.out.println(f.getType().getSimpleName());
			System.out.println("----------------------");
		}
		*/
		
		/*
		Constructor[] constructors = cls.getDeclaredConstructors();
		
		for(Constructor con:constructors) {
			System.out.println(con.getModifiers());
		}
		*/
		
	}

	private static void f4() {
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.\\w+";
		String data = "연락처1: k55416325@gmail.com 연락처2: aaa@naver.com 연락처3: bbb@google.com";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			//System.out.println(matcher.group());
			System.out.println(matcher.group(2));
			System.out.println("----------------------");
		}
	}

	private static void f3() {
		String p1 = "010-([0-9]{3,4})-\\d{4}";
		String data = "010-1234-5678 이곳으로 연락바람 010-7865-6321 혹은 010-8888-7777";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}

	private static void f2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.\\w+";
		String data = "k55416325@gmail.com";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"NO");
	}

	private static void f1() {
		String p1 = "010-[0-9]{3,4}-\\d{4}";
		String data = "010-1234-5678";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"NO");
	}

}
