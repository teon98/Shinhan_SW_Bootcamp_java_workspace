package com.shinhan.day05;

//구현 class
public class Audio extends Object implements RemoteController, Wifi{//RemoteController에서 동적하는 Television

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다");
	}

	@Override
	public void display() {
		RemoteController.super.display(); //부모것도 하고 싶어잉
		System.out.println("default method 재정의");
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on!!!");
		
	} 
	
	
	
	
}
