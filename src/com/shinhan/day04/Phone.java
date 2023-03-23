package com.shinhan.day04;

//class: public 또는 생략
//public: 모든 패키지에서 접근 가능
//protected: 같은 패키지 접근 가능, 다른 패키지는 상속받으면 가능. 
//default: 같은 패키지에서만 접근 가능
//private: 같은 class 에서만 접근 가능


public class Phone {
	
	
	public String model;
	public Phone() {
		System.out.println("default 생성자 정의함. ");
	}
	
	//3. 메소드
	public void f1() {
		
	}
	protected void f2() {
			
	}
	void f3() {
		
	}
	private void f4() {
		
	}
						}

