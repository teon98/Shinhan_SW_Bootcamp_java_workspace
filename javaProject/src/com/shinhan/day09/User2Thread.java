package com.shinhan.day09;

import lombok.Setter;

@Setter
public class User2Thread extends Thread{

	Calculator calculator;
	User2Thread(){
		setName("user2Thread!!!");
	}
	public void run() {
		calculator.setMemory(50);
		
	}
	
}
