package com.shinhan.day03;

public class Student {
	//1. field -> 변수, 속성 선언, 특징
	String name;
	String stdId;
	String subject;
	int score;
	
	//2. constuctor -> 생성자메소드 (필수가 아니다. 컴파일 시에 자동으로 default 생성자가 제공된다. 
	//사용자 재정의 가능
	
	Student(String name, String stdId, String subject, int score){
		//생성자의 매개변수를 이렇게 해놓으면 객체 생성 시 매개변수를 설정해놓은 것만 돌아가고 기본 default생성한 것들은 안돌아 간다. 
		System.out.println("argument가 있는 생성자");
		//멤버변수(Field)와 매개변수(arguement) 가 충돌됨. --> 아래처럼 하면 충돌!!! 구별이 필요함. 이 클래스로 만든 현재 객체를 this를 사용한다 !!
//		name = name;
//		stdId = stdId;
//		subject = subject;
//		score = score;'
		//this 안쓰면 넘어온 매개변수 충돌 날 가능성 200프로 
		this.name = name;
		this.stdId = stdId;
		this.subject = subject;
		this.score = score;
		

	}
	
	Student(){
		System.out.println("default  생성자에 의해 Student가 만들어짐.");
	}
	
	//3. 일반 method -> 
	void study(){
		System.out.println(name + "학생이 공부합니다. ");
	}
	
	//4. block(instance block-생성시마다 수행(거의 잘 안씀 . 거의 생성자 메소드 이용), static block-laod 시 1회 수행
	//instance block =>  객체 새로 생성할 때마다 수행됨. 생성자랑 거의 비슷하다고 보면됨. 
	{
		System.out.println("");
	}
	
	//static block => 클래스가 초기에 한번 로드될 때 1회성으로 젤 먼저 수행됨. 여러 객체가 같은 클래스를 참조하여 생성되어도 단 한번만, 맨처음에 수행된다. 
	static {
		
	}
	//5. inner class -> 클래스 안에 또 클래스가 들어가 있는. 
	class Phone{
		
	}
}	
