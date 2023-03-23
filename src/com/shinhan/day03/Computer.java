package com.shinhan.day03;

public class Computer {
	//보통 이렇게 private한다. 기능을 통해서 조작을 하지 변수를 바꾸진 않는다. 
	//JavaBeans 기술 규격서에 나옴. 외부에서 데이터에 접근하지 못하도록 private 해버린다. (정보은닉)
	private String model;
	private String os;
	private int price;
	//int count; // 변수: instance 변수, static 변수(class 변수 / object 공유 변수 / c에서는 share변수라고 한다. )
	static int count; // class 변수이다. 클래스당 딱 하나 있는것 (c언어에서는 share 변수라고 도 함) 객체마다 생성되는 게 아니라ㅣ 틀 자체에서 클래스 자체에서 하나만 있음 서로 객체들이 공유하는 것이다. 
	
	//public사용하면 다른패키지에서도 new를 사용하여 객체 생성할 수 있다. 
	public Computer(){
		//System.out.println("default  생성자로 생성.");
		this("AA모델","Mac",500);
	}
	
	public Computer(String model){
		//System.out.println("arg1만 들어오는 생성자로 생성");
		//this.model = model;
		//model = model; computer의 model 변수와 매개변수 model은 완전히 다른 것이다
		//따라서 this라고 computer클래스에서 생성된 본래 변수를 의미하게 된다. 
		this(model,null,0);
	}
	
	//이렇게 하면 오류남, why? 위의 model 하나만 들어오는 생성자 이미 만듦. 아무리 이름을 다르게 한들 컴퓨터는 동일한 생성자로 읽는다. 
	//	public Computer(String os) {
	//		
	//	}
	
	// 매개변수를 다르게한다. 생성자는 얼마든지 만들어낼 수 있음
	// 이것이 오버로딩(overloading)이다!!! -> 같은 애가 여러개라는 뜻. 
	//생성자 오버로딩 -> 생성자 이름은 같고 매개변수 사양이 다르다!
	public Computer(String os, int price) {
		//System.out.println("arg2가 들어오는 생성자로 생성");
		this(null,os,price);
	}
	
	public Computer(String model, String os, int price) {
		//위의 생성자들의 모든 값들이 이 생성자로 온다.this 때문에
		System.out.println("arg3 생성자로 생성");
		this.model = model;
		this.os = os;
		this.price = price;
		count++; // 이렇게 instance 변수로 하면 힙에 각 인스턴스 객체 마다 다 생김. 
	}
	
	//일반 메서드
	public void computerInfoPrint() {
		System.out.println("model: " + model);
		System.out.println("os: " + os);
		System.out.println("price: " + price);
	}
	
	//이런 함수들을 내가 만들어내야 하는 것. 
	//데이터는 정보를 은닉해라 -> private
	//함수는 정보를 공개해라 -> public (정보 바꿔서 줄 수도 있으니깐)
	public String getModel() {
		return model;
	}
	
	public String getos() {
		return os;
	}
	
	
	public int getPrice() {
		return price;
	}
	
}
