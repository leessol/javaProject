package com.shinhan.day04;


// Class: Object를 만들기 위한 틀(설계도)
// Object: class를 이용해서 만들어진 실체(instance)

public class Calculator {
	//1. Field(특징, 속성, 변수): static(class 변수), non-static(instance 변수)
	String color;
	int price;
	String model;
	static String company = "신한"; //모든 계산기는 신한 모델이라는 뜻. (약간 상수 느낌)
	//2. 생성자(new 할 때 자동 실행되는 메소드)...컴파일 시 자동으로 default 생성자가 제공된다. 
	// 생성자를 정의하면 default 생성자가 제공안됨
	// 생성자 목적: 초기화가 목적
	Calculator(String color){
		//this.color = color; //this는 사실 충돌 가능성이 있을 때만 사용한다. 
		//this: 현재 있는 클래스를 이용해서 만든 현재 객체
		//<this 를 사용하는 시점>
		//1. 충돌 가능성이 있을때:  매개변수가 있을 때,,,, -> 이름을 아무리 달리한들 충돌될 가능성은 있음 color = color
		//2. 하나의 생성자가 다른 생성자를 호출할 때: 
		//여러개의 생성자를 생성할 때(생성자 overloading: 이름은 같고 매개변수 사양이 다르다. ) 코드가 중복이 된다. 이 때, 중복된 코드를 줄이기 위해 this를 사용한다. 
		// 위의 경우 2가지를 제외하고는 굳이 충돌이 일어나지 않으면 this를 무조건 쓰는건 아니다. 
		this(null,color,0);
	}
	
	Calculator(String model, String color){
		this(model,color,1000);
	}
	
	Calculator(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	//3. method(일반 메서드) ... 기능(동사)
	
	//private 으로 정보 은닉되어있는 멤버 변수들을 읽기하는 기능을 만들기 : Getter (누구나 가져가야 하는 정보니간 public으로 한다.)
	//private으로 정보 은닉 되어이있는 멤버 변수들을 세팅/수정 하는 기능 만들기: Setter (누구나 가져가야 하는 정보니간 public으로 한다.)
	//아래처럼 손으로 직접 쓰지는 않는다. 에디터가 보통 기능을 제공한다. 
//	public String getModel() {
//		return model;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	
//	public int getPrice() {
//		return price;
//	}
	
	//왼쪽 마우스 - > source -> getter / setter --> 자동생성됨
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	public static void powerOn() {
		//static 에서는 this 사용 불가. instance 생성 없이 사용되는 메소드이므로 instance 변수 사용불가
		//System.out.println(this.color + "," + model + "모델의 계산기의 전원을 킨다");
		System.out.println(company +" 회사의 계산기의 전원을 킨다");
	}
	
	

	public static void powerOff() {
		//System.out.println(this.color + "," + model + "모델의 계산기의 전원을 끊다");
		System.out.println(company +" 회사의 계산기의 전원을 끊다");
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	//4. block (instance, static)
	{
		System.out.println("instance 생성시마다 수행된다.");
		System.out.println("=========================");
	}
	
	
	static {
		System.out.println("class load시에 1회 수행된다");
		System.out.println("=========================");
	}
	
	static {
		System.out.println("static 블록은 여러개 있을 수 있다. ");
		System.out.println("=========================");
	}
	
	
	//5. inner class
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
