package com.shinhan.day09;

//멀티쓰레드 만드는 방법:
//1. 상속 받기 (extends Thread -> run() 메소드 재정의 하여 구현한다. 
public class MyThread1 extends Thread{
	
	
	
	public MyThread1(String name) {
		super(name); //쓰레드 이름 넣는것
	}

	public MyThread1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 1; i<=26;i++) {
			System.out.println("[ "+getName()+" ]" + " i = "+i); //부모 thread상속 받았으니 나 자체가 thread임 -> 어차피 new하면 thread 생김
		}
	}
	
	
	
}
