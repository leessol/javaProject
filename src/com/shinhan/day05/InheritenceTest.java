package com.shinhan.day05;

class Parent{
	int a  = 10;
	Parent(){
		System.out.println("부모생성");
	}
	
	void f1() {
		System.out.println("부모의 f1메서드");
	}
	
}

class Child extends Parent{
	int b = 20;
	String a = "자바";
	Child(){
		System.out.println("Child 생성");
	}
	
	void f2() {
		System.out.println("부모의 f2메서드");
	}
}


public class InheritenceTest {

	public static void main(String[] args) {
		//Child ch = new 
	}

}
