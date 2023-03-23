package com.shinhan.day09;

public class ThreadTest2 {

	public static void main(String[] args) {
		f1();
		System.out.println("main End");
	}

	private static void f1() {
		// Thread를 익명구현 객체로 만들기 -> 이방법을 더 많이 쓴다.
		// 원래는 Thread t1 = new MyThread1()만들었는데 MyThread1 클래스 만들지 마라
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 'A'; i <= 'Z'; i++) {
					System.out.println("[ " + getName() + " ]" + " i = " + i); // 부모 thread상속 받았으니 나 자체가 thread임 -> 어차피
																				// new하면 thread 생김
					try {
						sleep((int) Math.random() * 100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 'a'; i <= 'z'; i++) {
					System.out.println("[ " + getName() + " ]" + " i = " + i); // 부모 thread상속 받았으니 나 자체가 thread임 -> 어차피
																				// new하면 thread 생김
				}
			}
		};

		// Runnable r = new MyThread3();
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 'A'; i <= 'Z'; i++) {
					System.out.println("[ " + Thread.currentThread().getName() + " ]" + " i = " + i); // 부모 thread상속 받았으니 나 자체가 thread임 -> 어차피
																				// new하면 thread 생김
					try {
						Thread.sleep((int) Math.random() * 100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		});

	}

}
