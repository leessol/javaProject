package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Container<T>{
	T dt;

	public T get() {
		return dt;
	}
		
	public void set(T data) {
		this.dt = data;
	}


}

