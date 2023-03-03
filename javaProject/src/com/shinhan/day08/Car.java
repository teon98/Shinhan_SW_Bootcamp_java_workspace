package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Car implements Comparable<Car>{
	String model;
	int price;
	
	@Override
	public int compareTo(Car obj) {
		if(price == obj.price) return obj.model.compareTo(model);
		return price - obj.price; //-1, 0, 1
	}

}
