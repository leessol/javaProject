package com.shinhan.day09;

import com.shinhan.day05.Account;

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		f10();

	}

	
	private static void f10() {
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true); //main thread 종료 시 데몬이 종료 
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 끝");
		
	}


	//인터럽트3
	private static void f9() {
		// TODO Auto-generated method stub
		
	}

	//인터럽트2
	private static void f8() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//인터럽트 거는 방법 2
		t1.interrupt();
		
		
	}

	//인터럽트 1
	private static void f7() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.setStop(true);
		
		//t1.stop();//은 사용하지 않는게 좋다. 그냥 다 닫아버림
		
	}

	//Thread에서 다른 쓰레드 신호보내기: wait(), notify()
	private static void f6() {
		WorkObject obj = new WorkObject();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		t1.start();
		t2.start();
		
	}

	private static void f5() {
		ShareArea share = new ShareArea(
				new Account("12345","성춘향",2000),
				new Account("45677","이몽룡",1000));
		TransferThread f1 = new TransferThread(share);
		PrintThread f2 = new PrintThread(share);
		f1.start();
		f2.start();
	}

	//동기화
	private static void f4() {
		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();
		//calculator는 2개의 thread가 공유하는 영역
		Calculator cal = new Calculator();
		//t1.setCalculator();
		//t2.setCalculator();
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		
	}

	//동기화 (공유영역을 하나의 쓰레드가 사용중일 떄 다른 쓰레드가 접근금지)
	private static void f3() {
		BathRoom bathroom = new BathRoom();
		BathThread t1 = new BathThread(bathroom, "김씨");
		BathThread t2 = new BathThread(bathroom, "박씨");
		BathThread t3 = new BathThread(bathroom, "이씨");
		BathThread t4 = new BathThread(bathroom, "홍씨");
		t1.start();t2.start();t3.start();t4.start();
		
		
	}

	private static void f2() {
		SumThread t1 = new SumThread(1,50);
		SumThread t2 = new SumThread(51,100);
		t1.start();
		
		//join 이 필요하다 . //원래는 thread안써야 하는데 동기라 근데 써야만하는 상황일떄
		
		try {
			t1.join(); t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getSum()+t2.getSum()); //비동기라 아직 계산이 안끝났을 수도 있다. 
		System.out.println("main end");
	}

	private static void f1() throws InterruptedException {
		WorkThread t1 = new WorkThread("[쓰레드A]");
		WorkThread t2 = new WorkThread("[쓰레드B]");
		
		t1.start();
		t2.start();
		
		//5초간 일시정지
		Thread.sleep(5000); // 5초간 sleep
		//t1의 work를 false ... t1쓰레드가 다른 쓰레드에 양보한다. 
		t1.work = false;
		//5초후
		Thread.sleep(5000);
		//t1의 work를 true
		t1.work = true;
		
	}

}
