package com.shinhan.day11;

public class LamdaTest {

	public static void main(String[] args) {
		f4();
	}

	private static void f4() {
		Person p1 = new Person();
		
		//변형
		Workable f = (name, job) -> {
			System.out.println("이름은 " + name);
			System.out.println("job " + job);
			System.out.println("==================");
		};
		
		//매개변수 2개 일때
		p1.action1(f);
		
		//Speakable s = content -> System.out.println(content + "라고 말했습니다.");
		
		//매개변수 1개일 때
		//p1.action2(s);
		
		/* 람다식을 쓰지 않았을 때
		p1.action1(new Workable() {
			
			@Override
			public void work(String name, String job) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		Speakable f2 = (s)-> s + "!!!!!!";
		p1.action2(f2);
	}

	public static void work(Runnable r) {
		Thread t1 = new Thread();
		t1.start();
	}
	
	private static void f3() {
		work(()->{System.out.println("A1");});
		work(()->{System.out.println("A2");});
		work(()->{System.out.println("A3");});
		work(()->{System.out.println("A4");});
	}

	private static void action(Calculable func) {
		func.calculate(10, 30);
	}
	
	private static void f2() {
		/*
		(new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("---익명구현class이용---");
				System.out.println("더하기" + (x+y));
			}
		}).calculate(10, 20);
		*/
		
		Calculable f = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("---익명구현class이용---");
				System.out.println("더하기" + (x+y));
			}
		};
		
		Calculable f2 = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("---익명구현class이용---");
				System.out.println("빼기" + (x-y));
			}
		};
		
		
		Calculable f3 = (a,b) -> {
			System.out.println("---람다 표현식---");
			System.out.println("곱하기"+(a*b));
		};
		
		action(f);
		action(f2);
		action(f3);
	}

	private static void f1() {
		//1.구현 class이용
		MyInterface a = new MyClassImplement();
		a.print();
		
		//2.익명구현class 이용
		//만들자마자 실행
		(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("익명구현class를 이용해서 구현");
			}
		}).print();
		
		//변수 있는 ver. - 장점: 여러번 호출 가능
		MyInterface b = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명구현class 변수 있는 ver.");
			}
			
		};
		b.print();
		
		//3.람다식 이용...JS에선 화살표 함수(=>)
		MyInterface c = ()->System.out.println("람다식 이용......");
		c.print();
	}

}
