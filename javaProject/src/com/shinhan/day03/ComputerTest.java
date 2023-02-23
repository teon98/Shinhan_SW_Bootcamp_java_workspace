package com.shinhan.day03;

public class ComputerTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Computer com1 = new Computer();
		System.out.println("생성된 컴퓨터 개수: " + Computer.count);
		Computer com2 = new Computer("SAMSUNG1234");
		System.out.println("생성된 컴퓨터 개수: " + Computer.count);
		Computer com3 = new Computer("WINDOW", 100);
		System.out.println("생성된 컴퓨터 개수: " + Computer.count);
		Computer com4 = new Computer("LG", "WINDOW", 100);
		System.out.println("생성된 컴퓨터 개수: " + Computer.count); //오버젝트 변수가 아니라 클래스 변수이기 때문에 이렇게 사용해주는 것이 옳다.
		display(com1);
		display(com2);
		display(com3);
		display(com4);

}

	private static void display(Computer com) {
		System.out.println("===========================");
		System.out.println(com.getModel());
		com.computerInfoPrint();

	}
}