package com.shinhan.day06;

interface A{
	void method1();
}

class B implements A{
	public void method1() {
		System.out.println("B 메서드 재정의");
	}
}

class C implements A{
	public void method1() {
		System.out.println("C 메서드 재정의");
	}
}

class D extends B{

	public void method1() {
		System.out.println("D메소드에서 재정의");
	}
	public void method2() {
		System.out.println("D메소드에 메서드 c추가");
	}
	
}

class E extends C{
	public void method1() {
		System.out.println("E에서 메소드 재정의");
	}
}

public class InterfaceCastingTest {

	public static void main(String[] args) {
		A v1 = new D();
		B v2 = new D();
		D v3 = new D();
		((D)v1).method1();
		((D)v2).method2();
		
	}

}
