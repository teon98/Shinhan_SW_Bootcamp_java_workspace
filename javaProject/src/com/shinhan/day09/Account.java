package com.shinhan.day09;

import java.util.Objects;

//부모 class로 사용할 예정
public class Account extends Object implements Comparable<Account>{//extends Object는 생략 가능
	//1.field
	private String accNo;
	private String owner;
	private int balance;
	
	//생성자
	public Account() {
		//super(); 자동으로 생성된다.
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

	@Override
	public int hashCode() {
		return Objects.hash(accNo, balance, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accNo, other.accNo) && balance == other.balance && Objects.equals(owner, other.owner);
	}

	@Override
	public int compareTo(Account acc) {
		// TODO Auto-generated method stub
		//return owner.compareTo(acc.owner); //ascending sort
		//return owner.compareTo(acc.owner)*-1; //descending sort
		//return accNo.compareTo(acc.accNo);
		int result = acc.balance - balance;//(기본형이라 빼기 해줌 - descending)
		if(result == 0) {
			return owner.compareTo(acc.owner)*-1; 
		}
		return result; 
	}
	
	
	
}
