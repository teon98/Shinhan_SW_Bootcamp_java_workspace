package com.shinhan.day05;

//상속 - 기존class(변경가능) + 생성자, field와 method 추가
public class CheckingAccount extends Account {
	
	String cardNo;
	
	//default 생성자 생략 안에는 super();가 있는데
	//부모 default 생성자가 사라지면 에러 발생
	
	//default 생성자를 사용하지 않고 오류도 안나게 할려면
	//아래와 같이 지정해주면 된다.
	CheckingAccount(String accNo, String owner, int balance, String cardNo){
		super(accNo, owner, balance);//명시적으로 부모생성자 호출
		this.cardNo = cardNo;
	}
	//단, default 생성자는 가급적 지우지 않는 것이 좋다.(아무런 줄이 없더라도)
	
	public int pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)) {
			return withdraw(amount);
		}else {
			System.out.println("카드번호 오류");
			return 0;
		}
	}
	void test() {
		System.out.println(getOwner());//부모가 물려준 field
		System.out.println(getAccNo());
		System.out.println(getBalance());
		setAccNo("88888");
		setOwner("홍길동");
		setBalance(200);
		
		deposit(1);
		withdraw(2);
	}
}
