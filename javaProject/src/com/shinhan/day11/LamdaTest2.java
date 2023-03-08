package com.shinhan.day11;

public class LamdaTest2 {

	public static void main(String[] args) {
		f2(100);
	}
	
	static String subject = "자바";
	
	private static void f2(int su1) {//파라메터는 지역변수
		int su2 = 200; //지역변수(함수 안에 있는 변수)
		int su3 = 300;
		su3++; //사용하지 않았기 때문에 사용가능
		//내부 class에서 지역변수를 사용한다면 final의 특성을 갖는다.(수정불가)
		//su1++; - final의 성질을 가져 변형할 수 없다.
		//su2++; - final의 성질을 가져 변형할 수 없다.
		//1.익명구현 class
		
		Calculable2 f = ((a,b) ->{
			System.out.println("람다식으로 표현" + subject);
			return a+b+su1+su2;
		});
		
		int result = f.calculate(1, 2);
		System.out.println(result);
	}

	private static void f1(int su1) {//파라메터는 지역변수
		int su2 = 200; //지역변수(함수 안에 있는 변수)
		int su3 = 300;
		su3++; //사용하지 않았기 때문에 사용가능
		//내부 class에서 지역변수를 사용한다면 final의 특성을 갖는다.(수정불가)
		//su1++; - final의 성질을 가져 변형할 수 없다.
		//su2++; - final의 성질을 가져 변형할 수 없다.
		//1.익명구현 class
		Calculable2 f = new Calculable2() {
			public int calculate(int x, int y) {
				System.out.println("익명구현객체");
				//su1++; - final의 성질을 가져 변형할 수 없다.
				//su2++; - final의 성질을 가져 변형할 수 없다.
				return x+y+su1+su2;
			}
		};
		int result = f.calculate(1, 2);
		System.out.println(result);
	}

}
