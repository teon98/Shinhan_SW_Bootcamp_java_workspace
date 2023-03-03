package com.shinhan.day08;

public class 연습문제13 {

	public static void main(String[] args) {
		//ContainerExample2(); //연습문제2번
		//ContainerExample3(); //연습문제3번
		UtilExample(); //연습문제4번
	}

	private static void UtilExample() {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println("pair 나이는" + age);
		System.out.println("---------------------");
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair,"홍삼순");
		System.out.println("childpair 나이는" + childAge);
		
//		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//		Integer otherPair = Util.getValue(childPair,"홍삼순");
//		System.out.println(otherPair);
	}

	private static <K,V> Container2<K,V> makeContainer(K key, V value) {
		return new Container2<K,V>(key, value);
	}
	
	private static void ContainerExample3() {
		Container2<String, String> container1 = makeContainer("aa","100");
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		System.out.println(name1);
		System.out.println(job);
		
		Container2<String, Integer> container2 = makeContainer("홍",200);
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		System.out.println(name2);
		System.out.println(age);
		
	}

	private static void ContainerExample2() {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}

}

class Container<T>{
	T data;

	public T get() {
		return data;
	}

	public void set(T data) {
		this.data = data;
	}
}

class Container2<K, V>{
	K key;
	V value;
	
	
	
	public Container2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	
}
