package com.shinhan.day05;

//상속: 기존 class(변경가능) + 생성자, field와 method
public class CheckingAccount extends Account {
	
	String carNo;
	
	CheckingAccount(String accNo, String owner, int balance, String carNo){
		super(accNo,owner,balance); // 부모의 필드가 전부 private이므로 부모를 통해 초기화를 한다. 
	}
	
	public int pay(String carNo,int amount) {
		if (this.carNo.equals(carNo)) {
			return withdraw(amount);
		}else {
			System.out.println("카드번호 오류");
			return 0;
		}
	}
	
	void test() {
		System.out.println(getOwner());
		System.out.println(getOwner());
		System.out.println(getBalance());
		deposit(1);
		withdraw(2);
	}
}
