package com.shinhan.day10;

//----thread.start()하면 run() 호출된다. 
//1. Thread 상속
class MyThreadA extends Thread{
	public MyThreadA(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(getName() + ":" + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//2. 이미 상속중이라면 Runnable interface 구현
class ThreadB extends Object implements Runnable{

	
	
	@Override
	public void run() {
		for(int i = 1;i<=110;i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class Review {

	public static void main(String[] args) {
		Thread t1 = new MyThreadA("[스레드A]");
		Thread t2 = new Thread(new ThreadB());
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 300;i<=310;i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread t3 = new Thread() {
			
			public void run() {
				for(int i = 200;i<=210;i++) {
					System.out.println(getName() + ":" + i);
					try {
						sleep(500); //자체가 thread니깐 앞에 Thread 안붙여도 됨. 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//main 스레드까지 총 5개가 움직인다
		System.out.println("main 끝");

	}

}
