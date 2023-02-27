package com.shinhan.day05;

public class CarTest {

	void go(Tire tire) {
		tire.roll();
		
		if(tire instanceof KumhoTire) {
			KumhoTire kum = (KumhoTire) tire;
			System.out.println(kum.intro);
			kum.method2();
		}else if(tire instanceof HankookTire han) { //새로나온 방법
			System.out.println(han.info);
			han.method1();
		}
	}

}
