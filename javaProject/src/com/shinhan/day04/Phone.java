package com.shinhan.day04;

//class: public또는 생략
//-----------접근제한자---------------------------------
//public: 모든 캐피지에서 접근 가능
//protected: 같은 패키지 접근 가능, 다른 패키지는 상속받으면 가능
//생략(default): 같은 패키지에서만 접근 가능
//private : 같은 클래스에서만 접근 가능
//-----------접근제한자---------------------------------
public class Phone {
	//1.field
	protected String model;
	//2.생성자:public/protected/생략/private
	public Phone(){
		System.out.println("default 생성자 정의");
	}
	//3.메서드
	public void f1() {
		
	}
	protected void f2() {
			
		}
	void f3() {
		f4();
	}
	private void f4() {
		
	}

}
