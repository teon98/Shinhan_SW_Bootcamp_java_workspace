package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

//명령행 매개변수 > java ObjectTest3 100 200
public class ObjectTest3 {

	public static void main(String[] args) {
		//f1();
//		try {
//			f2();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//f3(args);
		//f4();
		f5();
		System.out.println("main end~~~~");
	}

	private static void f5() {
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		Properties ps = System.getProperties();
		Set<Object> keys = ps.keySet();
		for(Object key:keys) {
			System.out.println("[" + key + "]" + ": " + System.getProperty((String) key));
		}
	}

	private static void f4() {
		//long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		for(int i=0; i<1000000; i++) {
			
		}
		//long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime-startTime));
	}

	private static void f3(String[] arr) {
		if(arr.length == 0) {
			//1.함수빠지기
			System.out.println("명령행매개변수가 없다");
			//return;
			//2.프로그램 당장 종료
			System.exit(0);
		}
		System.out.println("매개변수: " + Arrays.toString(arr));
	}

	private static void f2() throws IOException {
		//표준입력(default: 키보드)
		InputStream is = System.in;//1byte
		//한글을 출력하기 위해서 2byte가 필요하다.
		InputStreamReader ir= new InputStreamReader(is);//2byte
		int i;
		while((i=ir.read())!=13) {
			System.out.println((char)i);
		}
	}

	private static void f1() {
		//System class
		//1.out:표준출력(모니터출력)
		//2.err:에러(처럼) 표시 
		//3.in: 표준입력
		PrintStream ps = System.err;
		ps.print(false);
		ps.printf("%10d",100); //오른쪽정렬
		ps.printf("-%10d",200); //왼쪽정렬
		ps.println("자바");
		ps.println("--------------");
	}

}
