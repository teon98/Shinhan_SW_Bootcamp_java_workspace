package com.shinhan.day05;

public class Circle extends Shape{

	private double radius;
	double circumference;
	
	public Circle(String color, int radius) {
		super(color, "Circle");
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	//추상메서드 구현
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		circumference = 2*Math.PI*radius;
		return circumference;
	}
	
	
}
