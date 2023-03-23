package com.shinhan.day09;
import com.shinhan.day05.Account;

import lombok.AllArgsConstructor;

//공유자원으로 이용할 class 2개의 계좌가 있다. 
@AllArgsConstructor
public class ShareArea {
	
	Account sung;
	Account lee;
	
	//메서드 활용방법 이용
	synchronized void printBalance() {
		System.out.println("잔액: " + 
				(lee.getBalance() + sung.getBalance()));
	}
	
	void transfer() {
		//synchronized block  이용
		synchronized (this) {
			//출금한다. 
			int amount = this.lee.withdraw(100);
			System.out.println("lee계좌에서" + amount + "출금");
			//입금한다
			this.sung.deposit(amount);
			System.out.println("sung 계좌에서" + amount + "입금");
			
		}
	}
}
