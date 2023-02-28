package com.shinhan.day06;

public class AnonymousTest {
	public static void main(String[] args) {
		//f1();
		//f2();
		//f3();
		f4();
	}

	private static void f4() {
		//new RemoteControl(); //추상클래스는 new할 수 없다.
		RemoteControl tv = new RemoteControl() {//구현은 된다.
			int a=10;//RemoteControl에 없어서 호출 불가능, 내부에서는 가능
			public void method() {
				System.out.println("구현class에서 메서드 추가");
			}
			
			public void turnOn() {
				System.out.println("전원을 켠다."+a);
			}
			
			public void turnOff() {
				System.out.println("전원을 끈다.");
			}
		};
		tv.turnOn();
		tv.turnOff();
	}

	private static void f3() {
		//2.익명객체 사용법2
		(new Colorable() {
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명...setForeground: " + color);
				
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명...setBackground: " + color);
				
			}
		}).setBackground("green");
		
	}

	private static void f2() {
		//2.익명 객체 사용법1
		Colorable a = new Colorable() {
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명...setForeground: " + color);
				
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명...setBackground: " + color);
				
			}
		};
		a.setBackground("black");
		a.setForeground("purple");
		
	}

	private static void f1() {
		//1.일반적인 방법
		Book book = new Book();
		book.title = "이것이 자바다";
		book.setForeground("white");
		book.setBackground("blue");
		
		Cup cup = new Cup();
		cup.size = 10;
		cup.setForeground("white");
		cup.setBackground("blue");
	}
}
