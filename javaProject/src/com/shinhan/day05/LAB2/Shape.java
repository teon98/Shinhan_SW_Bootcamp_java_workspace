package com.shinhan.day05.LAB2;

public abstract class Shape {
	private int numSides; //변의 수
	
	public Shape(int numSides){
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}
	
	public abstract double getArea(); //넓이
	
	public abstract double getPerimeter();//둘레길이
}
