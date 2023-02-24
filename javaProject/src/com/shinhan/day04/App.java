package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		
		//Integer a = new Integer(100); 이렇게 쓰지 말라고 뜸(오류!)
		Integer a2 = 100;
		System.out.println(a2.MAX_VALUE); //이렇게 쓰지말구
		System.out.println(Integer.MAX_VALUE);
		
		//f1();
//		App a = new App();
//		a.sum(1,2); //static변수가 아닐때는 이렇게 불러줘야 한다.
		sum(1,2);
		sum(1,2,3,4,5,6,7,8,9,10);
		sum(1,2,3);
		sum(1.5, 2.5);
	}
	
	//메서드 Overloading: 메서드이름은 같고 매개변수 사양이다르다.
	//파라메터 자동형변환된다.
	static void sum(double ...arr){//double[] arr 라고 해도 된다.
		int total = 0;
		for(double su:arr) {
			total += su;
		}
		if(total == 0) return; //return : 함수를 중단하고 호출한 곳으로 돌아간다.
		System.out.println("가변길이매개변수: " + total);
	}

	/*
	 * Method영역 - Calculator class - Compay="신한"(static이라)
	 * Heap 영역 - color = null, price = 0, model = null
	 * Heap 영역 - String은 기본형이 아니기 때문에 color때문에 생성됨.
	 * Stack 영역 - v1변수가 생성되고 Heap영역의 Calculator를 가리키게 됨.
	 */
	private static void f1() {
		Calculator.powerOn(); 
		//static 메서드는 객체를 생성하지 않아도 사용할 수 있다.
		Calculator[] arr = new Calculator[4];
		arr[0] = new Calculator("red");
		arr[0].setModel("A모델");
		arr[1] = new Calculator("black");;
		arr[2]= new Calculator("blue", "B모델");
		arr[3] = new Calculator("green", 2000, "C모델" );
		
		for(Calculator c: arr) {
			print(c);
		}
	}

	private static void print(Calculator cal) {//cal에는 v1과 v2의 주소가 들어간다.
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		cal.powerOn(); //Calculator.powerOn();이지만, 이렇게 써도 틀린 것은 아니다.
		cal.powerOff();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(10, 20));
		System.out.println("------------------------------");
	}

}
