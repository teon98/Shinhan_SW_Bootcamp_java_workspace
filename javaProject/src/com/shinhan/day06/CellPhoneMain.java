package com.shinhan.day06;

class CellPhone{
	String model; //핸드폰 모델 번호
	double battery; //남은 배터리 양
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) {
		//강제Exception발생, 처리는 안함, RuntimeException에속한 Exception은 자동으로 thorws(던져진다)
		if(time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		
		battery -= (time*0.5);
		if(battery <0) {
			battery = 0;
		}
		System.out.println("통화 시간: " + time + "분");
	}
	
	public void charge(int time) {
		System.out.println("충전 시간: "+time+"분");
		
		try {
			battery += (time*3);
			if(battery > 100){
				battery = 100;
				throw new IllegalArgumentException("충전시간입력오류");
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양: "+battery);
	}
	
	//override: 함수이름, 매개타입과 갯수, return타입이 모두 같아야 하고, 접근제한자는 같거나 더 넓어져야 한다.
	//overloading: 매개타입과 갯수가 다르면 오버로딩이 된다.
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone c) {
			CellPhone p = (CellPhone) otherObject;
			return this.model.equals(p.model);
		}else
			return false;
	}
//	@Override
//	public boolean equals(Object obj){
//		CellPhone p = (CellPhone) obj;
//		
//		return this.model.equals(p.model);
//	}
}

public class CellPhoneMain {

	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
		
		//System.identityHashCode() 사용 예
		String s1 = new String("자바");
		String s2 = new String("자바");
		
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		
		System.out.println("System.identityHashCode(): " + (System.identityHashCode(myPhone) == System.identityHashCode(yourPhone) ? "동일 모델입니다." : "다른 모델입니다."));
	}
}
