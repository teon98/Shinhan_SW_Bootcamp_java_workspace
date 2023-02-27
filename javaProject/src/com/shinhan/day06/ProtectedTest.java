package com.shinhan.day06;

import com.shinhan.day05.Machine;

public class ProtectedTest extends Machine{
	void test2() {
		//System.out.println(a+b+c+d);
		System.out.println(b+d);
		f1();
		f2();
		//f3();
		//f4();
	}
	public ProtectedTest(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	void test() {
		//Machine m = new Machine(); //머신은 instance화 못함 (추상메서드이기 때문에)
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}
