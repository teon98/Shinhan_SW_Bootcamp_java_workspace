package com.shinhan.day05;

public class CreditLineAccount extends Account {
	int creditLine;
	
	
	
//	public CreditLineAccount(int creditLine) {
//		super();
//		this.creditLine = creditLine;
//	}
//

	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance);
		this.creditLine = creditLine;
	}
	
	//override(덮어쓰기, 재정의): 시그니쳐가 같아야 한다.
	//이름, 매개변수, return 타입 모두 같아야 한다. modifier는 같거나 더 넓어야 한다.
	
	@Override //생략가능
	public void deposit(int amount) {
		System.out.println("입금하다....override test");
		super.deposit(amount); //부모 메서드 그대로 쓰고 싶은데 내꺼 추가 하고 싶을 때
	}
	
	@Override
	public int withdraw(int amount) {
		int total = getBalance() + creditLine;
		
		if(amount > total) {
			System.out.println("잔고부족");
			return 0;
		}
		
		setBalance(getBalance() - amount);
		return amount;
	}

	void test() {
		System.out.println(getAccNo());
		System.out.println(getBalance());
		System.out.println(getAccNo());
		System.out.println(getOwner());
		deposit(100);
		withdraw(100);
	}


}
