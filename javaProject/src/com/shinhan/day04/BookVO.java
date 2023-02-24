package com.shinhan.day04;

//Book에는 업무로직은 없다.
//VO(Value Object): data를 저장하는 가방이다.
//DTO(Data Transfer Object): data를 저장해서 전송하려는 목적으로 만든 class이다.
//JavaBeans기술에서 사용한다.
//멤버변수는 private로 설정, 멤버메서드는 public으로 설정한다.
//JspServlet, Spring, MyBatis framework에서 사용된다.

//final: 변수(값 수정불가), 메서드(override불가), 클래스(
public class BookVO {
	//instance 변수
	private String title;
	private int price;
	//class 변수
	static int count; 
	//final : 수정 불가능, instance 변수, 선언시 또는 생성시
	final String isbn = "12345";//초기화를 한번 하면 수정할 수 없음
	final String isbn2;//초기화는 선언할때와
	//static final : 수정불가, 상수, class 변수, 선언시 초기화, 생성시(X)
	static final String PUB = "한빛"; 
	
	//생성자
	BookVO(String title, int price){
		super(); //생략 가능
		System.out.println("day04에 있는 BookVO");
		this.title = title;
		this.price = price;
		isbn2 = title + "67890";//new로 선언할때 가능하다.
		count ++;
	}

	//getter/setter 메서드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + "]";
	}
	
	
}
