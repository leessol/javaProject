package com.shinhan.day09;

import lombok.Getter;

@Getter
public class Calculator {
	int memory;
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName());
	}
}
