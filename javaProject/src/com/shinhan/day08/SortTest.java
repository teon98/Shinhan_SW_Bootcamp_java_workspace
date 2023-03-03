package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
		f4();
	}
	
	
	
	private static void f4() {
		Car[] arr = {new Car("A", 5000), new Car("C", 5000), new Car("D", 5000),
				new Car("E", 1000), new Car("B", 2000)};
		//System.out.println("before: " + Arrays.toString(arr));
		print("befor", arr);
		Arrays.sort(arr); //Comparable인터페이스를 구현하지않으면 비교불가
		//System.out.println("after: " + Arrays.toString(arr));
		print("가격asc, 모델desc after", arr);
		
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				int result = o2.price - o1.price;
				if(result == 0) return o2.model.compareTo(o1.model);
				return result;
			}
			
		});
		print("가격desc, 모델asc after", arr);
	}

	private static void print(String title, Car[] arr) {
		System.out.println("======" + title + "======");
		for(Car car:arr) {
			System.out.println(car+"\t");
		}
	}

	private static void f3() {
		//ASCII code: 'A' => 65 'a' => 97
		Money [] arr = {new Money(10), new Money(5), new Money(7), new Money(3), new Money(6)};
		System.out.println("befor: " + Arrays.toString(arr));
		Arrays.sort(arr);//Comparable인터페이스를 구현하지 않으면 비교불가
		System.out.println("asc after: " + Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Money>() {//descending

			@Override
			public int compare(Money o1, Money o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});//Comparator인터페이스를 익명구현
		System.out.println("desc after: " + Arrays.toString(arr));
	}

	private static void f2() {
		//ASCII code: 'A' => 65 'a' => 97
		String[] arr = {"Spring", "Java", "JSP", "Servlet", "HTML", "CSS", "React"};
		System.out.println("before: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("befoe: " + Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {//익명 구현 클래스
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}});
		System.out.println(Arrays.toString(arr));
	}

	
	private static void f1() {
		Integer[] arr = {100,30,80,20,99};
		System.out.println("after: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("before: " + Arrays.toString(arr));
		
		System.out.println("Comparator");
		Arrays.sort(arr, new DescendingInteger());
		System.out.println("before: " + Arrays.toString(arr));
	}

}
