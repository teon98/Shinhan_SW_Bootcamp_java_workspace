package com.shinhan.day06;

public class Button {
	//field
	int a = 10;
	private ClickListener listener;
	
	//method
	void f1(int a) {
		this.a = a;
	}
	
	//버튼을 놓으면 그 동작을 수행해라!
	void setListener(ClickListener listener) {
		this.listener = listener;
	}
	
	public void buttonClick() {
		listener.onClick();
	}
	
	//내부 interface ..규격서
	//버튼 내부 에서만 쓰고싶어서 만듦 - 버튼 전용 규격서
	static interface ClickListener{//정의는 있고 구현은 없다.
		void onClick(); 
	} 
}
