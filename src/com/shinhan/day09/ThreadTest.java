package com.shinhan.day09;

public class ThreadTest {

	//흐름이 하나: single thread
	public static void main(String[] args) {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...시작");
		Thread t1 = new MyThread1(); //자동 형변화
		Thread t2 = new MyThread2(); //자동 형변화
		//Thread t3 = new MyThread3(); //runnable 인터페이스를 구현한거니깐 Thread클래스 형변환 못씀
		Runnable r = new MyThread3();
		Thread t3 = new Thread(r);
		
		
		//쓰레드가 run을 수행하도록 한다. 
		t1.start(); //대문자
		t2.start(); //숫자
		t3.start(); //소문자
		
		for (int i = 100; i<=110;i++) {
			System.out.println(Thread.currentThread().getName() + "!!!!!!");
		}
		
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...끝");

	}
	
	private static void f1() {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...f1");
		for (int i = 1; i<=26;i++) {
			System.out.println(Thread.currentThread().getName() + " i = "+i);
		}
	}

	private static void f2() {
		System.out.println("쓰레드 이름: " + Thread.currentThread().getName()+"...f2");
		for (char i = 'A'; i<='Z';i++) {
			System.out.println(Thread.currentThread().getName() + " i = "+i);
		}
	}

	

}
