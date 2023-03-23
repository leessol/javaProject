package com.shinhan.day09;

public class WorkThread extends Thread {

	public boolean work  = true;
	
	WorkThread(String name){
		//super(name); // Thread 이름 저장
		setName(name); //Thread 클래스에 setName도 있다. 
 	}
	
	@Override
	public void run() {
		while(true) {
			if (work) {
				System.out.println(getName() + ".... 작업처리");
			} else {
				Thread.yield(); //나의 쓰레드가 잠깐 멈춤... 다른 쓰레드에게 양보,,, 계속 진행
			}
		}
	}
	
}
