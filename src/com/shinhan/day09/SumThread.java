package com.shinhan.day09;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SumThread extends Thread{
	
	private long sum;
	private int a;
	private int b;
	
	public SumThread(int i, int j) {
		this.a = i;
		this.b = j;
	}

	

	@Override
	public void run() {
		for(int i=a;i<=b;i++) {
			sum += i;
		}
	}
	
	
}
