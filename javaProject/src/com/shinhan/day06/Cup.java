package com.shinhan.day06;

public class Cup implements Colorable{
	int size;
	String foregroundColor;
	String backgroundColor;
	
	@Override
	public void setForeground(String color) {
		foregroundColor = color;
		System.out.println("Cup의 Foreground 변경: " + color);
		System.out.println("-------------------------------");
	}

	@Override
	public void setBackground(String color) {
		backgroundColor = color;
		System.out.println("Cup의 Backgorund 변경: " + color);
		System.out.println("-------------------------------");
		
	}
	
}
