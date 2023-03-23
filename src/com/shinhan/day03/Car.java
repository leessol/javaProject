package com.shinhan.day03;

//class: 설계도, object를 만드는 틀
//Object는 class를 이용해서 만든 개체(실체 instance)
public class Car {
	//1. field (속성, 변수 = property, 명사)
	String model;
	String color;
	int price;
	
	//2. 생성자 메소드 (생성시 초기화가 목적)
	//컴파일 시에 자동으로 .class에 default(파라미터가 없는) 생성자가 만들어진다. 
	//즉, 생성자를 정의하는 것은 필수가 아니다. 필요 시에만 한다. 
	//사용하고 싶다면, 생성자를 재정의한다. --> 재정의하면 자동으로 만들어지는 default 생성자가 만들어지지 않는다. 
	//생성자는 return 정의가 없다. 
	public Car(){
		System.out.println("Car의 default 생성자");
	}
	
	//3. 일반 메소드 (method, 함수, 기능, 어떤 동작, 동사)
	void go () {
		System.out.println("자동차가 간다. ");
	}
	
	//4. block (instance block, static block)
	{
		System.out.println("instance block .... 객체가 생성될때마다 실행됨. ");
	}
	//static 블록
	static {
		System.out.println("static blcock ... class load시 제일 먼저 수행됨.");
	}
	//5. inner class
}
