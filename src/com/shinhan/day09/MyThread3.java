package com.shinhan.day09;

//멀티쓰레드 만드는 방법:
//1. 상속 받기 (extends Thread -> run() 메소드 재정의 하여 구현한다. 
//2. 이미 부모 class를 상속받고 있다면 runnable interface를 구현한다. 
public class MyThread3 extends Object implements Runnable{ //thread처럼 쓸 수 있다는 것이지 thread는 아니다. 
	

	
	@Override
	public void run() {
		
		for (char i = 'a'; i<='z';i++) {
			System.out.println(Thread.currentThread().getName() + " i = "+i); //thread가 아니니깐 thread.해줘야 함. 
		}
	}
	
	
	
	
}
