package com.shinhan.day03;

public class Account {
	private String accNo; //계좌번호
	private int balance; //잔고
	
	//생성자
	Account(String accNo, int balance){
		this.accNo = accNo;
		this.balance = balance;
		System.out.printf("%s 계좌가 개설되었습니다.\n",accNo);
		getBalance();
	}
	
	//일반함수
	void save(int money) {//입금
		System.out.printf("%s 계좌에 %d원이 입금되었습니다.\n",accNo,money);
		balance += money;
		getBalance();
	}
	
	void deposit(int money){//출금
		System.out.printf("%s 계좌에 %d원이 출금되었습니다.\n",accNo,money);
		balance -= money;
		getBalance();
	}
	
	//getter - 정보은닉에 의해 멤버변수를 직접 조정할수 없으니, 값을 읽을 수 있도록 함.
	int getBalance(){//잔고 확인
		System.out.printf("%s 계좌의 잔고는 %d원입니다.\n",accNo,balance);
		return balance;
	}
	
	String getAccNo() {//계좌번호 확인
		System.out.printf("계좌번호는 %s입니다.\n",accNo);
		return accNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
	
//	private void print(String message) {
//		System.out.println(accNo + message);
//		System.out.println(accNo + "계좌의 잔고는 "
//				+ balance
//				+ "원입니다.");
//		
//	}
}
