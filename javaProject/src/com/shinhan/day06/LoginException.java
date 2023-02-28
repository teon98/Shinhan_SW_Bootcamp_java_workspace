package com.shinhan.day06;

//사용자 정의 예외
//만드는 이유: 업무상 Exception 처리 일관성있께 하기 위해 만든다.
//extends 상위 Exception
public class LoginException extends Exception{
	String errMessage;
	public LoginException(String errMessage) {
		super(errMessage);
	}
	
	public void printMessage() {
		System.out.println("로그인: " + getMessage());
	}
}
