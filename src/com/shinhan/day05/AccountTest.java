package com.shinhan.day05;

public class AccountTest {

	public static void main(String[] args) {
		f3();
	}
	
	private static void f3() {
		CreditLineAccount acc = new CreditLineAccount("112-1888","jin",1000,500);
		acc.deposit(2000);
		int amount = acc.withdraw(3600);

		System.out.println(amount + " 출금");
		System.out.println("잔액은 : " +acc.getBalance());
		
		
	}

	private static void f2() {
		CheckingAccount acc = new CheckingAccount("112-1888","jin",1000,"12345-4444");
		acc.deposit(2000);
		int amount = acc.withdraw(100);
		System.out.println(amount + "원이 출금되었습니다. ");
		
		amount = acc.pay("9999", 200);
		System.out.println(amount + " 출금");
		System.out.println("잔액은 : " +acc.getBalance());
		
	}

	private static void f1() {
		Account acc = new Account("112-1888","jin",1000);
		acc.deposit(2000);
		int amount = acc.withdraw(100);
		System.out.println(amount + "원이 출금되었습니다. ");
	}

}
