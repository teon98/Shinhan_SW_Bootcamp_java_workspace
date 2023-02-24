package com.shinhan.day04;

//자바의 최상위 Class : Object Class (물려받고 싶지 않아도 무조건 물려받아야 함.)
//Object클래스에는 toString, equals 등의 메서드들이 기본적으로 들어있다.
//toStirng은 기본적으로 주소를 찍는데 override(덮어쓰기)를 통해 재정의할 수 있다.
public class Duck extends Object{//extends Object가 생략되어 있는 것
	private String name;
	private int legs;
	private int length;
	
	public Duck(String name, int legs, int length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	public void fly(){
		System.out.printf("오리(%s)는 날지 않습니다.\n",name);
	}
	
	public void sing() {
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Duck(오리) [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
	//override(덮어쓰기, 재정의): 이미 가지고 있는 기능을 수정할때
	//이름, 매개변수, return모두 같아야 한다.
	//단, 접근제한자는 같거나 더 넓어져야 한다. public>protected>생략>private
//	public String toString() {
//		return "오리의 이름은" + name + "입니다. 다리는 " + legs + "개이고 길이는 " + length + "입니다.";
//	}
	
}
