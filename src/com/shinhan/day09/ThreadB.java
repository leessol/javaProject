package com.shinhan.day09;

public class ThreadB extends Thread {
	WorkObject workObject;
	public ThreadB(WorkObject workObject) {
		setName("[ThreadB]");
		this.workObject = workObject;
	}
	
	
	@Override
	public void run() {
		workObject.methodB();
	}
	
	
}
