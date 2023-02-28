package com.shinhan.day06;

public interface Resizable {//규격서
	//구현을 하고 싶으면
	//default, static, private 등을 붙여야 한다.
	//생략하면 추상
	public abstract void size(int width, int height); //public abstract 가 생략되어 있다.
	
	
}
