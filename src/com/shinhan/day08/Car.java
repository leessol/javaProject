package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car implements Comparable<Car >{
	String model;
	int price;
	
	
	@Override
	public int compareTo(Car obj) {
		int result =  price - obj.price;
		//0이면? 값이 같으면? 오름 차순 기준되는 것을 바꾸고 싶다. 
		if(result == 0 ) return obj.model.compareTo(model);
		return result;
	}
}
