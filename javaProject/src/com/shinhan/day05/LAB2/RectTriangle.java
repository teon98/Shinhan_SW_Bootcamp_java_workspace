package com.shinhan.day05.LAB2;

public class RectTriangle extends Shape{

	double width;
	double height;
	
	public RectTriangle(double w, double h) {
		super(3);
		width = w;
		height = h;
		
	}

	@Override
	public double getArea() {
		return (width*height)/2;
	}

	@Override
	public double getPerimeter() {

		double c = Math.sqrt((width*width) + (height*height));
		return c+width+height;
	}


}
