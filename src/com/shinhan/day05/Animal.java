package com.shinhan.day05;

//부모가 자식을 제한 할 수 있다. 무분별한 자식 생성을 막기 위해. 
public sealed class Animal permits Cat,Dog{
	int a = 10;
	void method1() {
		System.out.println("Animal의 method1");
	}
}
