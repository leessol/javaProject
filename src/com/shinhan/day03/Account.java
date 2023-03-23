package com.shinhan.day03;

public class Account {
	private String accNo;
	private int balance;
	
	Account(String accNo,int money){
		this.accNo = accNo;
		this.balance = money;
	}
	
	//setter
	public void deposit(int money) {
		this.balance += money;
		prn("계좌에 " + money + " 원이 입급되었습니다. ");
		//rn();
	}
	
	public void withdraw(int money) {
		this.balance -= money;
		prn("계좌에 " + money + " 원이 출금되었습니다. ");
	}
	
	//getter
	public int getBalance() {
		return balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	private void prn(String message) {
		System.out.println(accNo + message);
		System.out.println(accNo + "계좌의 잔고는 " + balance + " 원 입니다. ");
	}
	
	
}
