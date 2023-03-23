package com.shinhan.day03;

public class CarTest {

	public static void main(String[] args) {
		f1();
	}
	
	private static void f1() {
		//자동차 객체를 만든다 
		//1.객체 참조 변수 선언
		int a;
		Car car1;
		Car car2;
		//2.객체생성... heap에 객체가 생성되고 주소는 변수에 담는다. 
		//객체가 생성되면 변수들은 자동으로 초기화 된다. 
		car1 = new Car(); //Car 클래스를 틀로하는 객체 하나 생성하겠다. 
		car2 = new Car();
		
		//3.객체사용
		car1.model = "A모델";
		car1.color = "black";
		car1.price = 5000;
		
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		car1.model = "B모델";
		car1.color = "red";
		car1.price = 4000;

		car1.go();
		car2.go();
		
		
	}

}
