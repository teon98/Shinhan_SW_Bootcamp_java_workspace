package com.shinhan.day10;

import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day09.Account;

public class CollectionTest2 {

	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
		//f4();
		//f5();
		//f6();
		//f7();
		//f8();
		//f9();
		//f10();
		//f11();
		//f12();
		//f13();
		f14();
	}
	
	private static void f14() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("귤1", 100));
		data.add(new Fruit("귤2", 100));
		data.add(new Fruit("귤3", 100));
		data.add(new Fruit("귤4", 100));
		data.add(new Fruit("귤5", 100));
		Set<Fruit> data2 = Set.copyOf(data);
		for(Fruit f:data2) {
			System.out.println(f);
		}
		
	}

	private static void f13() {
		Map<String, Integer> data = Map.of("김", 100, "양", 90, "박", 80);
		for(String key: data.keySet()) {
			System.out.println(key + "===" + data.get(key));
		}
	}

	private static void f12() {
		Set<Integer> listData = Set.of(100,88,99,55,80);
		//listData.add(11);
		for(Integer a:listData) {
			System.out.println(a);
		}
	}

	private static void f11() {
		//수정불가한 Collection
		int[] arr = new int[] {100,88,99,55,80};
		List<Integer> listData = List.of(100,88,99,55,80);
		List<int[]> listDtat2 = Arrays.asList(arr);
		for(Integer a:listData) {
			System.out.println(a);
		}
	}

	private static void f10() {
		//Queue<FiFO> 큐는 인터페이스
		Queue<Fruit> data = new LinkedList<>();
		
		data.offer(new Fruit("귤2", 20000));
		data.offer(new Fruit("귤1", 40000));
		data.offer(new Fruit("귤4", 10000));
		data.offer(new Fruit("귤3", 30000));
		data.offer(new Fruit("귤5", 70000));
		
		while(!data.isEmpty()) {
			Fruit f = data.poll();	
			System.out.println(f);
		}
		
	}


	private static void f9() {
		//Stack (LIFO)
		Stack<Fruit> data = new Stack<>();
		
		data.push(new Fruit("귤2", 20000));
		data.push(new Fruit("귤1", 40000));
		data.push(new Fruit("귤4", 10000));
		data.push(new Fruit("귤3", 30000));
		data.push(new Fruit("귤5", 70000));
		
		while(!data.isEmpty()) {
			Fruit f = data.pop();	
			System.out.println(f);
		}
		
	}

	private static void f8() {
		//Map: HashMap, TreeMap
		
		TreeMap<String, Fruit> data = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		data.put("S", new Fruit("귤", 10000));
		
		data.put("A", new Fruit("귤", 10000));
		data.put("A", new Fruit("사과", 20000));
		
		data.put("B", new Fruit("귤", 30000));
		data.put("B", new Fruit("오렌지", 50000));
		
		for(Entry<String, Fruit> entry:data.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println();
		
		NavigableMap<String, Fruit> data2 = data.descendingMap();
		for(Entry<String, Fruit> entry: data2.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	private static void f7() {
		Set<Fruit> data = new TreeSet<>();
		data.add(new Fruit("포도", 3000));
		data.add(new Fruit("포도", 3000));
		data.add(new Fruit("딸기", 6000));
		data.add(new Fruit("수박", 10000));
		
		for(Fruit fruit:data) {
			System.out.println(fruit);
		}
	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board(1, "회식", "술마셔도 되나요?", "jin"));
		data.add(new Board(2, "자율학습","저녁개방", "jin"));
		data.add(new Board(3, "아침", "빨리와~", "jin"));
		data.add(new Board(4, "회식", "술마셔도 되나요?", "jin"));
		data.add(new Board(5, "회식", "술마셔도 되나요?", "jin"));
		
		for(Board board:data) {
			System.out.println(board);
		}
	}

	private static void f5() {
		//default: key로 sort한다.
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("홍길동5", 88);
		data.put("홍길동1", 99);
		data.put("홍길동4", 66);
		data.put("홍길동2", 77);
		data.put("홍길동3", 100); //같은 키가 있으면 값을 replace
		
		//entrySet 은 키-값 쌍
		//keySet은 키들의 집합
		for(String key :data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
		}
		
		System.out.println("firstKey:" + data.firstKey());
		System.out.println("firstKey의 값:" + data.get(data.firstKey()));
		System.out.println("lastentry:" + data.lastEntry());
		System.out.println("lowerentry" +data.lowerEntry("홍길동3"));
		
		NavigableMap<String, Integer> data2 = data.descendingMap();
		for(String key: data2.keySet()) {
			System.out.println(key + "==>" + data2.get(key));
		}
	}

	private static void f4() {
		TreeSet<Integer> scoreSet = new TreeSet<Integer>();
		scoreSet.add(100);
		scoreSet.add(20);
		scoreSet.add(80);
		scoreSet.add(50);
		scoreSet.add(80);
		for(Integer score:scoreSet) {
			System.out.println(score); //중복 X, sort 됨.
		}
		System.out.println("first: " + scoreSet.first());
		System.out.println("Last: " + scoreSet.last());
		System.out.println("higher>: " + scoreSet.higher(50));
		System.out.println("lower<: " + scoreSet.lower(50));
		System.out.println("ceiling>=: " + scoreSet.ceiling(50));
		System.out.println("floor<=: " + scoreSet.floor(50));
		
		System.out.println("========tailSet========");
		SortedSet<Integer> data = scoreSet.tailSet(50);
		for(Integer i:data) {
			System.out.println(i);
		}
		
		System.out.println("========headSet========");
		NavigableSet<Integer> data2 = scoreSet.headSet(50, true); //2번째 인자값은 자기 포함 여부
		for(Integer i:data2) {
			System.out.println(i);
		}
	}

	//List: 순서 있음, 중복가능 ArrayList, Vector(MultiThread환경에서 동기화 지원), LinkedList
	//Set: 순서 없음, 중복불가
	//Map: 키와 값의 쌍
	//HashSet: hashCode(), equals() 로 동등비교, 동등하면 add불가
	//TreeSet: compareTo()로 크기 비교
	private static void f3() {
		Set<Employee> data = new TreeSet<>();//HashSet이라면 동등비교만 하면 되니까 이쯔오케
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원5", "대리", 2000));
		data.add(new Employee("직원6", "과장", 3000));
		data.add(new Employee("직원3", "과장", 1200));
		
		for(Employee s :data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		Set<Account> data = new TreeSet<>();
		data.add(new Account("1234", "홍5", 9999));
		data.add(new Account("1235", "홍1", 9999));
		data.add(new Account("1236", "홍3", 9999));
		data.add(new Account("1234", "홍2", 10000));
		data.add(new Account("1234", "홍5", 9999));//이미 존재하므로 add안됨.
		
		for(Account s :data) {
			System.out.println(s);
		}
	}

	private static void f1() {
		Set<String> data = new TreeSet<>();
		data.add("월1");
		data.add("월5");
		data.add("월6");
		data.add("월3");
		data.add("월5"); //값은 값이 있음으로 add되지 않는다.
		
		for(String s :data) {
			System.out.println(s);
		}
	}

}
