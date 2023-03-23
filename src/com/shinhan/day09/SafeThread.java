package com.shinhan.day09;

import lombok.Setter;

@Setter
public class SafeThread extends Thread {
	
	private boolean stop; // false가 default임

	@Override
	public void run() {
		while(true){
			System.out.println("safeThread... 실행중");
			if (Thread.interrupted()) {
				break;
			}

		}
	}
	

	
}

	
	/*
	 * public void run() { while(!stop) { System.out.println("safeThread.... 실행중");
	 * }
	 * 
	 * System.out.println("자원정리"); System.out.println("safeThread 종료"); }
	 */

	/*
	public void run() {
		try {
			while (true) {
				System.out.println("safeThread... 실행중");

				sleep(1);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("자원정리");
		System.out.println("safeThread 종료");
	}
	*/
	
	

