package com.shinhan.day05;

//abstract class: abstract mehotd가 1개 이상있다.
//직접객체생성불가 : new Shape() 불가능
public abstract class Shape {

	private String color;
	private String type;
	
	public Shape() {}
	
	public Shape(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getType()
	{
		return type;
	}
	
	//abstract 메서드: 정의는 있고 구현은 상속받은 자식 class에서 반드시 한다.(override)
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	public String toString()
	{
		return color + " " + type;
	}
	
}