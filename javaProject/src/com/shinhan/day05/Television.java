package com.shinhan.day05;

//구현 class
public class Television extends Object implements RemoteController{//RemoteController에서 동적하는 Television

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다");
	} 
	
}
