package com.shinhan.day07;

public class CellPhone {
	private String model;
	private double battery;
	
	CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) {
		
		if (time <0) {
			throw new IllegalArgumentException("통화시간입력오류 "); 
		} 
		System.out.println("통화시간: " + time);
		this.battery -= time*0.5;
		if (this.battery<0) {this.battery = 0;}
		
	}
	
	//throws IllegalArgumentException: 생략가능
	//강제 Exception 발생, 처리는 안함. RuntimeException에 속상 Exception은 자동으로 throws에 던져짐. 
	void charge(int time) throws IllegalArgumentException {
		
		if(time<0) {
			throw new IllegalArgumentException("충전시간입력오류 ");
		} 
		System.out.println("충전시간: " + time);
		this.battery +=time*3;
		if (this.battery >100) {this.battery = 100;}
		
	}
	
	void printBattery() throws IllegalArgumentException{
		System.out.println("남은 배터리: " + battery);
	}
	
	//override: 함수 이름, 매개타입과 갯수, return 타입이 모두 같아야 하고, 접근 제한자는 같거나 더 넓어져야 한다. 
	public boolean equals(Object otherObject) {
		if (otherObject instanceof CellPhone && this.model.equals(((CellPhone)otherObject).model)){
			return true;
		}
		return false;
	}
	
	//overloading: 매개 타입과 갯수가 다르면 overloading
	public boolean equals(CellPhone otherObject) {
		if (otherObject instanceof CellPhone && this.model.equals(otherObject.model)){
			return true;
		}
		return false;
	}

}