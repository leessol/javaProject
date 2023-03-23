package com.shinhan.day05;

//new Chile(): Object 생성 Parents2 생성 Child2 생성
//final class: 자식 상속 불가
//final field: 값 수정 불가 
//final method: 재정의 불가 
class Parent2 {
	int a =10;
	Parent2(){
		super();
		System.out.println("부모 생성자 ");
	}
	
	void method1() {
		System.out.println("부모의 method");
	}
}

class Child2 extends Parent2 {
	//String a = "자바"; //부모것 덮어쓰기
	int b = 20;
	Child2(){
		//super(); 부모 생성자가 먼저 호출된다. 
		System.out.println("자식 생성자 ");
	}
	
	void method1() { //부모꺼 덮어쓰기(overriding)
		System.out.println("자식 method");
	}
//	
//	void method1(String b) { //추가(overloading)
//		System.out.println("자식 method but 새로 인자가 추가됨. 재정의함. ");
//	}
//	
	void method2() {
		System.out.println("자식 method 2");
	}
}

public class InheritenceTest2 {

	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		//부모를 통해서 자식을 본다..... 부모의 변수와 메서드만 호출가능
		Parent2  ch = new Child2();
		System.out.println(ch.a);
		ch.method1();
		
	}

	private static void f2() {
		Child2 ch = new Child2();
		System.out.println(ch.a + ch.b);
		ch.method1();
		ch.method2();
		
	}

	private static void f1() {
		Student st1 = new Student("123", "홍길동");
		Student st2 = new Student("124", "박길동","컴공");
		Student st3 = new Student("125", "양길동","화학과",99);
		ExchangeStudent st4 = new ExchangeStudent("126", "은빈", new String[] {"영어","프랑스"});
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count+"명");
	
		
	}

}
