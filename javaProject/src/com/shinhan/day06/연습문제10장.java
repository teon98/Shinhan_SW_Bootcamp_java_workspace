package com.shinhan.day06;

class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message); 
	}
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}

public class 연습문제10장 {

	public static void main(String[] args) {
		//method6();
		method7();
	}

	private static void method7() {
		try {
			login("white", "12345");
			login("blue", "54321");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
		try {
			login("blue", "54321");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void login(String id, String password)throws NotExistIDException,WrongPasswordException{
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		//password가 12345가 아니라면 WrongPasswordException을 발생시킴.
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 존재하지 않습니다.");
		}
	}

	private static void method6() {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
		/* 실행결과 */
		//10
		//숫자로 변환할 수 없음
		//10
		//인덱스를 초과했음
		//10

	}

}
