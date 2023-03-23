package com.shinhan.day09;


public class PrintThread extends Thread{
	ShareArea share;
	
	public PrintThread(ShareArea share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=12;i++) {
//			synchronized (share) {
//				//잔액출력
//				System.out.println("잔액: " + 
//				(share.lee.getBalance() + share.sung.getBalance()));
//				
//			}
			share.printBalance();
			
			
		}
	}
}
