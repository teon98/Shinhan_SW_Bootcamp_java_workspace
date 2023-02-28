package com.shinhan.day05.확인문제;

public class 연습문제7장 {

	public static void main(String[] args) {
		//method6();
		//method7();
		//method8();
		//method11();
		method12();
	}

	private static void method12() {
		/*
		public class Example {
			public static void action(A a) {
				a.method1();
				if(a instanceof C c) {
					c.method2();
				}
			}
			
			public static void main(String[] args) {
				action(new A());
				action(new B());
				action(new C());
			}
		}
 
		*/
		
	}

	private static void method11() {
		MainActivity mc = new MainActivity();
		mc.onCreate();
		
		/*
		 public class MainActivity extends Activity{
			@Override
			public void onCreate() {
				super.onCreate();
				System.out.println("추가적인 실행 내용");
			}
		}
		 */
		
	}

	private static void method8() {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		/*결과
		스노우 타이어가 굴러갑니다.
		스노우 타이어가 굴러갑니다.
		 */
		
	}

	private static void method7() {
		Child child = new Child();
		
		/* 결과
		Parent(String nation) call
		Parent() call
		Child(String name) call
		Child() call
		*/
		
	}

	private static void method6() {
		//부모 class에 정의된 생성자를 호출하지 않아 super() 메서드에서 오류 발생.
		//super()를 이용해 정의된 부모 생성자를 호출해야 한다.
		
		/*
		 public class Parent {
			public String name;
			
			public Parent(String name) {
				this.name = name;
			}
		}
		*/
		
		/*
		public class Child extends Parent{
			public int studentNo;
			
			public Child(String name, int studentNo) {
				super(name);
				this.studentNo = studentNo;
			}
		}

		*/
	}

}
