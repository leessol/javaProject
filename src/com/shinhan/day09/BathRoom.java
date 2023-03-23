package com.shinhan.day09;

//공유 영역
public class BathRoom {
	boolean isFirst = true;
	public void use(String name) {
		synchronized (this) {
			if (isFirst && name.equals("김")) {
				try {
					wait(); // 일시정지 상태로 간다. notify(), notifyAll()에 의해 신호 오기 전까지 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			isFirst  = false;
			System.out.println(name + "입장한다. ");
			System.out.println(name + "사용한다. ");
			System.out.println(name + "퇴장한다. ");
			System.out.println("==================");	
			notifyAll(); //신호를 보낸다. wait() 상태에 있는 Thread가 실행대기 상태로 간다.  (Runnable)
		}
	}
}
