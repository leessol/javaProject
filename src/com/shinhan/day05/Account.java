package com.shinhan.day05;

import java.io.Serializable;
import java.util.Objects;

//부모 class로 사용할 예정
public class Account implements Comparable<Account>, Serializable{
	//1. field 
	// 아무리 부모라고 하더라도 필드가 private이면 상속할때 자식들은 사용불가하다. 
	private String accNo;
	private String owner;
	private int balance;
	
	// 생성자 -> 기본 생성자는 아무것도 없어도 웬만하면 지우리 말라
	public Account() {
		
	}

	public Account(String accNo, String owner, int balance) {
		super(); //눈에 보이지 않은 최상위 클래스인 Object 를 상속해서 콜하는 개념
		// 굳이 안써도 자동으로 생성해준다. 
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	public Account(String accNo, String owner) {
		super(); //눈에 보이지 않은 최상위 클래스인 Object 를 상속해서 콜하는 개념
		// 굳이 안써도 자동으로 생성해준다. 
		this.accNo = accNo;
		this.owner = owner;
		
	}
	

	//메서드
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔고 부족");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accNo, balance, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accNo, other.accNo) && balance == other.balance && Objects.equals(owner, other.owner);
	}

	@Override
	public int compareTo(Account acc) {
		
		if(this.equals(acc)) return 0;
		
		//return owner.compareTo(acc.owner)*-1;
		//return accNo.compareTo(acc.accNo)*-1;
		int result = acc.balance - balance;
		if(result == 0 ) {return owner.compareTo(acc.owner)*-1;}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
