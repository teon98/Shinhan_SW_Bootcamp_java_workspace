package com.shinhan.day06;

public class Book implements Colorable{
	String title;
	String foregroundColor;
	String backgroundColor;
	
	
	@Override
	public void setForeground(String color) {
		foregroundColor = color;
		System.out.println("Book의 Foreground 변경: " + color);
		System.out.println("-------------------------------");
	}

	@Override
	public void setBackground(String color) {
		backgroundColor = color;
		System.out.println("Book의 Backgorund 변경: " + color);
		System.out.println("-------------------------------");
		
	}
	
}
