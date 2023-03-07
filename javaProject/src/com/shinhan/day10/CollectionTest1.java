package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day09.Account;

public class CollectionTest1 {

	public static void main(String[] args) throws InterruptedException {
		//f1();
		//f2();
		//f3();
		//f4();
		//f5();
		//f6();
		//f7();
		//f8();
		//f9();
		f10();
	}
	
	private static void f10() {
		Properties pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/com/shinhan/day10/oracleInfo.properties");
			//InputStream is = CollectionTest1.class.getResourceAsStream("oracleInfo.properties"); - 배포할땐 이런식으로 불러오는 것이 굿
			pro.load(fis);
			//pro.load(CollectionTest1.class.getResourceAsStream("oracleInfo.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		String driver = pro.getProperty("driver");
		System.out.println(driver);
		
		for(Object key:pro.keySet()) {
			String value = pro.getProperty((String)key);
			System.out.println(key + "---" + value);
		}
	}

	private static void f9() {
		//Key는 Set이다.
		//Set은 add시에 동등객체인지 확인, 동등하면 add불가
		//Map은 put()시에 key를 찾고 값을 넣는다.동등한 것을 찾으면 replace한다.
		HashMap<Employee, Account> data = new HashMap<>();
		data.put(new Employee("용희", "대리", 1000), new Account("1234", "용희", 2000));
		data.put(new Employee("용희", "대리", 1000), new Account("5555", "용희", 5000));
		data.put(new Employee("용희2", "과장", 7000), new Account("12345", "용희", 2000));
		data.put(new Employee("용희3", "부장", 8000), new Account("12346", "용희", 2000));
		data.put(new Employee("용희4", "사장", 9000), new Account("12347", "용희", 2000));
		
		for(Employee emp:data.keySet()) {
			System.out.println("key:" + emp);
			System.out.println("value" + data.get(emp));
		}
		
		System.out.println("key 찾기");
		System.out.println(data.containsKey(new Employee("용희", "대리", 1000)));
		System.out.println(data.containsKey(new Employee("용희", "대리", 999999)));
		
		System.out.println("value 찾기");
		System.out.println(data.containsValue(new Account("12347", "용희", 2000)));
		System.out.println(data.containsValue(new Account("12347", "용희99", 2000)));
	}

	private static void f8() {
		//Map: 키와 값의 쌍이다.(Entry), 키는 set이므로 (중복 불가)
		//구현 Class: HashMap, HashTable
		HashMap<String, Integer> data = new HashMap<>();
		data.put("김", 100);
		data.put("박", 90);
		data.put("정", 95);
		data.put("양", 50);
		data.put("김", 200);
		
		System.out.println("키가 중복되면 마지막값이 유효: " + data.get("김"));
		
		//1.일반 for---index 불가
		//2.향상 for
		//entry는 1건을 의미, entrySet은 여러건을 의미
		int sum = 0;
		for(Entry<String, Integer> entry :data.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			sum += entry.getValue();
		}
		System.out.println("총점은 " + sum);
		//keyset(): 키들을 의미
		for(String key :data.keySet()) {
			System.out.println(key+"-->"+data.get(key));
		}
		
		//Iterator 이용
		Iterator<String> it = data.keySet().iterator();
		while(it.hasNext()) {//다음 data가 있는지 확인하기
			String key = it.next();//다음 data읽기
			System.out.print(key + "-->");
			System.out.println(data.get(key));
		}
		
		//키 찾기
		System.out.println("키 찾기: "+data.containsKey("김"));
		System.out.println("키 찾기: "+data.containsKey("김2"));
		
		//값 찾기
		System.out.println("값 찾기: " + data.containsValue(90));
		System.out.println("값 찾기: " + data.containsValue(150));
	}

	private static void f7() {
		//Set interface => 구현 class: HashSet, TreeSet
		//순서 없고 중복 불가(단, Tree는 순서있음.)
		Set<Account> data = new HashSet<>();
		data.add(new Account("1234", "홍", 1000));
		data.add(new Account("1234", "홍", 1000));
		data.add(new Account("1235", "홍1", 1000));
		data.add(new Account("1236", "홍2", 1000));
		data.add(new Account("1237", "홍3", 1000));
		//1.일반 for -- 불가..순서가 없음으로 index 사용이 불가능
		
		System.out.println("===============향상 for===============");
		//2.항상 for
		for(Account week:data) {
			System.out.println(week);
		}
		
		System.out.println("===============Iterator===============");
		//3.iterator(내부반복자)
		Iterator<Account> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //println은 무조건 toString()을 호출하게 되어있다.
		}	
		
		//원하는 객체 찾기
		Account searchData = new Account("1235", "홍1", 3000);
		boolean result = data.contains(searchData);
		System.out.println(result?"찾음":"not found");
	}

	private static void f6() {
		//순서 없고 중복 불가(단, Tree는 순서있음.)
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("수요일");
		data.add("목요일");
		data.add("목요일");
		data.add("금요일");
		//1.일반 for -- 불가..순서가 없음으로 index 사용이 불가능
		
		System.out.println("===============향상 for===============");
		//2.항상 for
		for(String week:data) {
			System.out.println(week);
		}
		
		System.out.println("===============Iterator===============");
		//3.iterator(내부반복자)
		Iterator<String> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void f5() {
		//ArrayList는 중간의 data를 삽입하거나 삭제시 앞으로 당기는 것 때문에 느리다.
		List<Account> data = new ArrayList<>();
		long start = System.nanoTime();
		
		for(int i=1; i<=1000; i++) {
			data.add(new Account(i+"", "홍"+i, 100));
		}
		
		for(int i=100; i<200; i++) {
			data.remove(i);
		}
		
		for(int i=100; i<200; i++) {
			data.add(i, new Account(i+"", "park"+i, 500));
		}
		
		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간:" + df.format(end-start)+"ns");
		
	}

	//Vector는 멀티 쓰레드에 안정적...동기화된다.
	private static void f4() throws InterruptedException {
		List<Account> data = new Vector<>();//참고: 기본적으로 비어있으면 10개를 만든다. (필요시 10개씩 추가해서 생성)
		//2000건을 add하고자 한다. 2개의 흐름을 만들어서 각자 1000건씩 넣고자 한다.
		long start = System.nanoTime();
		
		Thread t1 = new Thread() {//이 흐름(쓰레드)이 1000건을 넣어라!
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add(new Account(i+"", "홍"+i, 100));
				}
			}
		};
		
		Thread t2 = new Thread() {//이 흐름(쓰레드)이 1000건을 넣어라!
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add(new Account(i+"", "박"+i, 100));
				}
			}
		};
		t1.start(); t2.start();
		t1.join(); t2.join();
		System.out.println(data.size()+"건이 저장되었습니다."); 
		
		for(int i=100; i<200; i++) { //삭제!
			data.remove(i);
		}
		
		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간:" + df.format(end-start)+"ns");
		
		/*
		 2000건이 출력된다.
		 Vector는 쓰레드에서 사용이 안정적임을 알 수 있다.
		*/
	}

	
	private static void f3() throws InterruptedException {
		List<Account> data = new ArrayList<>();//참고: 기본적으로 비어있으면 10개를 만든다. (필요시 10개씩 추가해서 생성)
		//2000건을 add하고자 한다. 2개의 흐름을 만들어서 각자 1000건씩 넣고자 한다.
		long start = System.nanoTime();
		
		Thread t1 = new Thread() {//이 흐름(쓰레드)이 1000건을 넣어라!
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add(new Account(i+"", "홍"+i, 100));
				}
			}
		};
		
		Thread t2 = new Thread() {//이 흐름(쓰레드)이 1000건을 넣어라!
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add(new Account(i+"", "박"+i, 100));
				}
			}
		};
		t1.start(); t2.start();
		t1.join(); t2.join();
		System.out.println(data.size()+"건이 저장되었습니다."); 
		
		
		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간:" + df.format(end-start)+"ns");
		
		/*
		 1918건이 출력된다.
		 ArrayList는 쓰레드에선 안정적이지 않음을 알 수 있다.
		*/
	}

	private static void f2() {
		//List interface: 구현 class => ArrayList, Vector, LinkedList
		List<String> data = new ArrayList<String>();		
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
		System.out.println(data.size()+"개");
		
		System.out.println("===============일반 for===============");
		//1. 일반 for문으로 가져오기
		for(int i=0; i<data.size(); i++) {
			System.out.print(data.get(i) + '\t');
		}
		
		System.out.println("\n==============향상 for===============");
		//2. 향상된 for문으로 가져오기
		for(String s: data) {
			System.out.print(s+"\t");
		}
		
		System.out.println("\n===============Iterator===============");
		
		//3. iterator: 내부적으로 돎.
		Iterator<String> it = data.iterator(); //iterator 안에 String이 있는 타입이야
		while(it.hasNext()) {//hasNext(): 다음값이 존재하는가?
			String s = it.next();
			System.out.printf(s + "\t");
		}
		
	}

	//제네릭스를 사용하지 않는 것은 바람직하지 않다.
	private static void f1() {
		//List interface: 구현 class => ArrayList, Vector, LinkedList
		List data = new ArrayList();
		data.add(100);
		data.add("자바");
		data.add(new Account());
		
		//가져올 때
		int a = (Integer) data.get(0); 
		String s = (String) data.get(1);
		Account acc = (Account) data.get(2);
		
		//형변환을 잘못하면 에러가 발생할 수 있다.
	}

}
