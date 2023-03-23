package com.shinhan.day05;

//구현 class: 인터페이스를 구현한 클래스 
public class Audio implements RemoteControl, WIFI{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "오디오 전원 ON. ");
		
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "오디오 전원 OFF. ");
		
	}
	
	@Override	
	public void display() {
		// TODO Auto-generated method stub
		RemoteControl.super.display();
		System.out.println("default method 재정의");
	}
	
	static void display2() {
		// TODO Auto-generated method stub
		System.out.println("ㅇㄹㅇㄴㄹㄴㅇ");
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on!!!");
		
	}
}
