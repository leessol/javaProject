package com.shinhan.day09;

class MovieThread extends Thread{
	public void run() {
		for (int i = 1;i<=3;i++) {
			System.out.println("동영상을 재생합니다...");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {

}
