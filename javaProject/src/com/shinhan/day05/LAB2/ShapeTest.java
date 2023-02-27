package com.shinhan.day05.LAB2;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 6);
		RectTriangle rt = new RectTriangle(6, 2);
		
		Shape[] shape = new Shape[2];
		shape[0] = r;
		shape[1] = rt;
		
		for(Shape s : shape) {
			System.out.println("area: " + s.getArea());
			System.out.println("perimeter: " + s.getPerimeter());
			if(s instanceof Rectangle) {
				Rectangle renew = (Rectangle) s;
				renew.resize(0.5);
				System.out.println("new area: " + renew.getArea());
				System.out.println("new perimeter: " + renew.getPerimeter());
			}
		}
	}

}
