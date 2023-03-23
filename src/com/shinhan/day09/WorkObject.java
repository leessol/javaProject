package com.shinhan.day09;

//공유영역
public class WorkObject {
	public synchronized void methodA() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + ": methodA 작업 실행");
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + ": methodB 작업 실행");
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
