package com.shinhan.day05;

//구현 class: 인터페이스를 구현한 클래스 
public class Television implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원을 ON. ");
		
	}

	
	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원을 OFF. ");
		
	}
	
	
	@Override	
	public void display() {
		// TODO Auto-generated method stub
		RemoteControl.super.display();
		System.out.println("default method 재정의");
	}
	
	static void display2() {
		// TODO Auto-generated method stub
		System.out.println("static method 재정의,,, 재정의 불가... interface꺼다. ");
	}


}
