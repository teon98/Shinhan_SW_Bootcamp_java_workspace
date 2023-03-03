package com.shinhan.day08;

public class FindCharacters {
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		int count2=fc.countChar("Boys, be ambitious", 'i');
		System.out.println(count);
		System.out.println(count2);
	}
	public int countChar(String str, char c) {
		/*
		-	문자열의 각 내용들을 비교하여 입력받는 char c의 값과 동일한 char의 개수를 리턴한다.
		-	대소문자는 각각 다른 것으로 간주한다.
		*/
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(c ==  str.charAt(i)) count ++;
		}
		
		return count;
	}
}
