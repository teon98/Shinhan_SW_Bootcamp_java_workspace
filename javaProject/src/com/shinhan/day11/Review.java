package com.shinhan.day11;

import java.util.*;
import java.util.Map.Entry;

public class Review {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		List<Integer> data1 = new ArrayList<>();
		Set<Integer> data2 = new HashSet<>();
		Map<String,Integer> data3 = new HashMap<>(); //키와 값의 쌍이기 때문에 제네릭에 2개 이상 주기(<K,V>)
		data1.add(100);
		data2.add(200);
		data3.put("aa", 300);
		
		System.out.println(data1.get(0));
		
		//Set은 순서가 없기 때문에 get()함수로 가져올 수 없다.
		for(Integer i:data2) {
			System.out.println("Set을 for문으로 가져오기: " + i);
		}
		//내부반복자 생성
		Iterator<Integer> it = data2.iterator();
		System.out.println(it.hasNext()?it.next():"not found");
		
		//Map은 키 값을 알면 get함수를 이용할 수 있다.
		System.out.println(data3.get("aa"));
		//키 값을 모를 때
		Set<String> keys = data3.keySet();
		for(String key:keys) {
			System.out.println("Map을 iterator로 가져오기: " + data3.get(key));
		}
		//Map에서 (키-쌍)을 한번에 가져오는 방법
		Set<Entry<String,Integer>>entrys = data3.entrySet(); 
		for(Entry<String, Integer> entry:entrys) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		Iterator<Entry<String, Integer>> it2 = entrys.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> en = it2.next();
			System.out.println(en.getKey() + en.getValue());
		}
	}

	private static void f1() {
		//Collection: List(순서있고 중복가능), Set(순서없고 중복불가)
		//Map
		//List구현class: ArrayList, LinkedList, Vector
		//Set구현class:HashSet, TreeSet
		//data 추가 시 순서정해짐 (크기비교 compareTo()) TreeSet
		//Map구현class:HashMap, ThreeMap(이진트리), Properties
		//Map은 키와 값의 쌍 Entry(Key:set, Value)
	}

}
