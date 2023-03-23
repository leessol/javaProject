package com.shinhan.day05;

//interface(규격서): 상수 + 추상메소드 + (default 메소드 + static 메소드 + private 메소드) -> 추가된 부분(일반 메소드라고는 하지 않음)
//일반적으로는 상수 와 추상메소드만으로 이뤄져있다. 
//abstract class: 변수 + 상수 + 생성자 + 일반메소드 + 추상메소드
//일반 class: 변수 + 상수 + 생성자 + 일반메소드
public interface RemoteControl{
	public abstract void powerOn();
	void powerOff(); //원래 public abstract이 생략된 것이다. 
	
	
	//원래는 상수 + 추상메소드만 있었는데, 인터페이스에 기능을 추가한것이다. 
	//다른 클래스에서 접근을 해야하기 때문에 default로 접근제한자를 설정해야한다. 
	//유일하게 override가 된다. (클래스들이 각자 원하는대로 커스텀가능)
	default void display() {
		System.out.println("모든 구현 class에 기능이 추가된다. ");
	}
	
	
	static void display2() {
		// TODO Auto-generated method stub
		System.out.println("!!!!!!!!!!!!!!!!!");
	}
	
}
