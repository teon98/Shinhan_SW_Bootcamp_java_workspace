package com.shinhan.day09;

import java.util.Arrays;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor //인자 없는 default 생성자 
//@AllArgsConstructor //모든 멤버변수를 가지고 있는 생성자
@Getter //모든 멤버변수 Get 함수
@Setter //모든 멤버변수 Set 함수
@ToString
@EqualsAndHashCode(of = {"title, price"}) //지정하지 않으면 모든 필드 //동등비교(기본: 주소, 재정의:내용)
public class Book<T> extends Object implements Comparable<Book>{
	private T title;
	private int price;
	private String publisher;
	private String[] author;
	
	private static int count;
	private static final String COMPANY="신한출판사";
	
	public static <T> Book<T> makeBook(T title, int price ) {
		//new Book();
		return new Book<>(title, price, "홍대출판사", new String[] {"김경윤","양유진"}); //선언할 때 생략가능하지만 바로 쓸 땐 new 를 써줘야 한다.
	}
	
	public Book(T title, int price, String publisher, String[] author) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.author = author;
		count ++;
	}
	
	
	
	@Override
	public int compareTo(Book obj) {
		return price - obj.price; // -1 0 1 순으로 나오면 오름차순 1 0 -1 순으로 나오면 내림차순
	}

	public static int getCount() {
		return count;
	}

	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	*/
	
}
