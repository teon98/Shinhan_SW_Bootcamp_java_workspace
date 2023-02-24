package com.shinhan.day04;

//Class: Object를 만들기 위한 틀(설계도)
//Object: class를 이용해서 만들어진 실체(instance)
public class Calculator {
	//1.Field(특징, 속성, 변수): static(클래스 변수), non-static(instance)
	private String color;//non-static(instance) 변수
	private int price;
	private String model;
	static String company = "신한"; //처음부터 초기화해도 된다. static을 붙이면 Calculator.model 이렇게 불러올 수 있다.
	//2.생성자메서드(new할때 자동실행되는 메서드)...컴파일시 자동으로 default생성자가 제공
	//생성자는 초기화가 목적
	//생성자를 정의하면 default생성자가 제공안됨.
	//생성자는 return 하면 안됨.
	//this: 이 class를 이용해서 만든 현재 객체
	//1.매개변수이름과 멤버변수 이름이 충돌(구분이 필요하다)
	//2.하나의 생성자가 다른생성자를 호출할때 사용
	//생성자 Overloading: 이름은 같고 매개변수사양이 다르다.
	Calculator(String color){
		this(color, 0, null);
	}
	
	Calculator(String model, String color){
		this(color, 1000, model);
	}
	
	Calculator(String color, int price, String model){
		this.color = color;
		this.model = model;
		this.price = price;
	}
	//3.method(일반메서드)...기능(동사): static, non-static
	//void: return값이 없다.
	
	//private로 정보은닉되어있는 멤버변수들을 읽는 기능만들기: getter
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getPrice(){
		return price;
	}
	
	//private로 정보은닉되어있는 멤버변수들을 수정하는 기능만들기: setter
	public void setModel(String model){
		this.model = model;
	}
	
	//eclipse에서 getter/setter를 만들어주는 기능이 들어있다.
	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Calculator.company = company;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//static이 붙은 메서드에서는 this를 사용할 수 없다.
	//instance 생성없이 사용되는 메서드이므로 instance 변수 사용이 불가능하다.
	//static이 붙은 메서드 안에서 static이 붙은 변수는 사용할 수 있다.
	public static void powerOn(){
		System.out.println(company + "회사의 계산기 전원을 켠다.");//this.color라고 해도 되고, color라고 해도 된다!
		return; //생략해도 된다.
	}
	public void powerOff(){
		System.out.println(this.color + "," + model + "모델의 계산기 전원을 끈다.");
	}
	int add(int a, int b){
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	//4.block (instance, static) - 문장을 여러개 묶었다. 여러개 생성된다.
	//instance 블럭은 잘 안사용하지만, static은 load될 때 실행되는 특징을 이용해 사용된다.
	{
		System.out.println("instance 생성시마다 수행된다.");
		System.out.println("-------------------------");
	}
	static{
		System.out.println("1class load시에 1회 수행된다.");
		System.out.println("************************");
	}
	static{
		System.out.println("2class load시에 1회 수행된다.");
		System.out.println("************************");
	}
	//5.inner class
	//이 클래스 안에서만 쓸 클래스
	//안드로이드 프로그래밍 할 때, 많이 쓰인다. ex)window안에 button 구현시 window안에서만 쓰이는 button을 정의할때
	class AA{
		
	}
}
