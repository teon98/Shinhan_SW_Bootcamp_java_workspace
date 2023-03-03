package com.shinhan.day08;

public class Prob1 {

	//Caesar Cipher
	public static void main(String[] args) {
		String input_string = "everyday we have is one more than we deserve";
		String result = "";
		for(int i=0; i<input_string.length(); i++) {
			int change = (int)input_string.charAt(i);
			switch (change) {
				case 32 -> result += (char)32;
				case 120 -> result += (char)97;
				case 121 -> result += (char)98;
				case 122 -> result += (char)99;
				default -> result += (char)(change+3);
			}
		}
		
		System.out.println(result);
	}
}
