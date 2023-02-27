package com.shinhan.day05;

public class Rectangle extends Shape{
	int length;
	int width;
	
	public Rectangle(String color, int length, int width) {
		super(color, "Rectangle");
		this.length = length;
		this.width = width;
	}
	
	//추상메서드 구현
	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return (length + width) *2;
	}

}
