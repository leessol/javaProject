package com.shinhan.day09;


public class TransferThread extends Thread{
	ShareArea share;
	
	public TransferThread(ShareArea share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=12;i++) {
			share.transfer();
		}
	}
}
