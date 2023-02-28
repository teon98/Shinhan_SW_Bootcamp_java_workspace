package com.shinhan.day06;

//int score = 100 이런 영역은 존재하지 않는다. 자바는 글로벌 영역을 가지지 않는다. 
public class OuterClass {
	//1.field(instance field, static field)
	int a=10;
	int score = 100; 
	static int b=20;
	
	//2.생성자..default 제공
	
	//3.메서드(instance method, static method)
	void method1() { System.out.println("OuterClass...instance method");}
	static void method2() { System.out.println("OuterClass...static method");}
	
	//4.block(instance block {}, static block : static {})
	
	//5.inner class: 3가지, instance, class, local

	class InstanceInnerClass{
		int score = 200; //field, 클래스 안에 들어 있는 멤버 변수: new 하면 만들어짐 그때 가리키는 것이 this
		String s1 = "InstanceInnerClass";
		static String s2 = "InstanceInnerClass";
		void method3() {//매개변수도 지역변수(그 지역에서만 쓸 수 있다.)
			int score = 300; //지역변수(함수내의 변수)
			System.out.println("InnerClass...instance method");
			System.out.println("외부의 instance field 접근: " + a);
			System.out.println("외부의 static field접근: " + b);
			System.out.println("지역변수 score = " + score);//가까운 score 먼저
			System.out.println("멤버변수 this.score = " + this.score);//현재 객체의 score
			System.out.println("OuterClass.this.score = " + OuterClass.this.score);//static이 아님(OuterClass가 만든 그 객체!! => this 사용)
			System.out.println("----------------------------");
		}
		static void method4() { //static은 처음 로드될때 메모리에 올라와야함.
			System.out.println("InnerClass...static method");
			//System.out.println("외부의 instance field 접근: " + a); a는 new를 해야 올라감.
			System.out.println("외부의 static field접근: " + b);
			System.out.println("----------------------------");
		}
	}
	
	static class StaticInnerClass{ //static이 static이 아닌 친구를 쓸 수 없어요.
		String s1 = "StaticInnerClass";
		static String s2 = "StaticInnerClass";
		void method3() { 
			System.out.println("StaticInnerClass...instance method");
			//System.out.println("외부의 instance field 접근 불가능: " + a); 쓸수 없다.
			System.out.println("외부의 static field접근: " + b);
			System.out.println("----------------------------");
		}
		static void method4() { 
			System.out.println("StaticInnerClass...static method");
			//System.out.println("외부의 instance field 접근 불가능: " + a); 접근이 불가능하다.
			System.out.println("외부의 static field접근: " + b);
			System.out.println("----------------------------");
		}
	}
	
	void f1() {//메서드 안에서만 사용하는 class를 local class라 한다.
		//--static에서 non-static 호출불가
		//LocalClass는 함수내에 있는 class, static불가
		//지역변수는 내부 class에서 사용하면 final 특성을 가진다.
		int max = 100;
		class LocalClass{ 
			String s3 = "LocalClass";
			static String s4 = "InstanceInnerClass";
			void method5() { 
				System.out.println("LocalClass...instance method");
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(a);
				System.out.println(b);
				System.out.println(max);
				//max=200;
				//min=0;
				System.out.println("-------------------------");
			}
			static void method6() { 
				System.out.println("LocalClass...static method");
				//System.out.println(s3); 쓸 수 없다.
				System.out.println(s4);
				//System.out.println(a);
				System.out.println(b);
				System.out.println("-------------------------");
			}
		}
		LocalClass local = new LocalClass();
		System.out.println(local.s3);
		System.out.println(LocalClass.s4);
		local.method5();
		LocalClass.method6();
	}
}