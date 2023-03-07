package com.shinhan.day10;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Fruit implements Comparable<Fruit>{
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit obj) {
		int result = name.compareTo(obj.name);
		if (result == 0) {
			return obj.price-price;
		}else{
			return result;
		}
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
	
}
