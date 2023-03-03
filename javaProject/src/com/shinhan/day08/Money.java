package com.shinhan.day08;

import java.util.Objects;

public class Money implements Comparable<Money>{//제네릭스: 사용한 쪽에서 결정한다.
    int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
		return new Money(amount + money.amount);
        //더하기 구현
    }
    public Money minus(Money money) {
		return new Money(amount - money.amount);
        //빼기 구현
    }
    public Money multiply(Money money) {
    	return new Money(amount * money.amount);
        //곱하기 구현
    }
    public Money devide(Money money) {
    	return new Money(amount / money.amount);
        //나누기 구현
    } 
    
    public boolean equals(Object object) {
    	if(this == object) return true; //주소가 같으면 같다.
    	if(object == null || getClass()!=object.getClass()) return false;
    	return amount == ((Money)object).amount;
        //Object equals 메쏘드 재정의
    }
    
	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}
	
	public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        System.out.println(five);
        System.out.println(two.add(three));
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }
	@Override
	public int compareTo(Money obj) {//제네릭으로 했기 때문에 형변환할 필요가 없다.
		//return amount - obj.amount; //-1, 0, 1
		return obj.amount - amount;
	}
}
