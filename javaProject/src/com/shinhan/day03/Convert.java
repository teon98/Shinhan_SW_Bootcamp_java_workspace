package com.shinhan.day03;

public class Convert {

	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);
	

	}
	
	//함수: 문장의 묶음
	//함수생성이유: 반복코드없이 함수로 만들어서 재사용한다. 모듈화
	public static String myReplace(String string, char oldChar, char newChar) {
		String result = "";
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)==oldChar) {
				result += newChar;
			}else {
				result += string.charAt(i);
			}
		}
		return result;
	}

}
