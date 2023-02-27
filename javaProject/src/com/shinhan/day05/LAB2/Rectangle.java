package com.shinhan.day05.LAB2;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height; 
	public Rectangle(double w, double h) {
		super(4);
		width = w;
		height = h;
	}
	@Override
	public double getArea() {
		return (width * height);
	}
	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}
	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
		
	}

}
