package com.shinhan.day05;

import java.io.Serializable;

//부모 class로 사용할 예정
public class Account extends Object implements Serializable{//extends Object는 생략 가능
	/**
	 * 
	 */
	private static final long serialVersionUID = -4313164987632495438L;
	//1.field
	private String accNo;
	private String owner;
	private int balance;
	
	//생성자
	public Account() {
		//super(); 자동으로 생성된다.
	}
	
	public Account(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;

	}
	
	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메서드
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔고부족");
			return 0;
		}
		balance -=amount;
		return amount;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
