package com.shinhan.day05;

public class CreditLineAccount extends Account {

	
	int creditLine;

	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance); //부모의 필드들은 private이므로 자식이 접근을 못한다. 
		//그래서 부모한테 매개변수를 보내고 부모한테 초기화하라고 하는것.
		// 나중에 자식 클래스가 해당 값을 set하거나 get하고 싶으면 부모의 클래스에 set/get 함수를 정의해서 세팅하고 뽑아쓰면 된다. 
		// 결국 원 필드(데이터는) 안건들이기 위해서 . 
		this.creditLine = creditLine;
	}

	public void deposit(int amount) {
		System.out.println("입금하다.... override test");
		super.deposit(amount); //부모로 올라가서 계산 어차피 계산은 똑같으니
	}
	
	//override (덮어쓰기, 재정의): 시그니처가 같아야 한다. -> 완전히 함수안에 내용만 달라져야 함. 
	//시그니처가 같다?: 이름, 매개변수, return타입 모두가 같아야 한다. modifier는 같거나 더 넓어야 한다. (범위가 public>protected..._
	@Override
	public int withdraw(int amount) {
		int total = getBalance() + creditLine;
 		if (amount > total) {
			System.out.println("잔고 부족");
			return 0;
		}
		setBalance(getBalance()-amount);
 		return amount;
	}
	
	
	
	
	
	//	void test() {
//		System.out.println(get);
//	}
}
