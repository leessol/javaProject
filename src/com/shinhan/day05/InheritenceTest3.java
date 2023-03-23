package com.shinhan.day05;
class A{
	
}
class B extends A {
	
}
class C extends A{
	
}
class D extends B{
	int max = 100; 
}
class E extends B{
	
}
class F extends C{
	
}



public class InheritenceTest3 {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		//자동형변환: 부모 타입 <- 자식객체 
		D v1 = new D();
		B v2 = new D();
		A v3 = new D();		
		System.out.println(v1.max);
		//강제형변환: 부모타입 -> 자식객체
		//자식객체 = (자식타입) 부모타입객체
		D v4 = (D)v2;
		System.out.println(v4.max);
		D v5 = (D) v3;
		System.out.println(v5.max);
		//E v6 = (E) v2; //컴파일 시에 오류 없음. 
		//실행 시에만 오류남 classCastException
		//본래 생성된instance로만 형변환 가능. 
		//new를 누구로 했는냐가 제일 중요!!!!!
		//E v7 = (E) v3;
		
		
		//형변환 가능한지 체크하자 
		System.out.println(v3 instanceof D?"OK" : "No 형변환");
		System.out.println(v3 instanceof E?"OK" : "No 형변환");
		if (v3 instanceof D dd) { //12버전부터 추가 됨.
			//원래는 D dd= (D) v3; 해야됨. 
			System.out.println(dd.max);
		}
	
	}
	private static void f4() {
		CarTest car = new CarTest();
		HanKokTire a = new HanKokTire();
		//KumhoTire b = new KumhoTire();
		//굳이 위처럼 할 필요 없다. 
		car.go(a);
		car.go(new KumhoTire());
		
	}

	//공통적으로 모듈이 작성되어야 할 때.
	private static void call(Animal any) {
		//자식이 부모한테 감. 자동 형변환
		any.method1();
		if(any instanceof Dog) {
			//부모가 강제로 자식한테 감. 강제 형변환 (작은 곳으로 가니깐)
			Dog d2 = (Dog) any; //나 원래 dog이었어. 
			// 대신 실행시 에러날 수도. 형제끼리 형변환 하면, cat 과 dog가 하면,
			d2.method3();
			System.out.println(d2.a + d2.c);
		} else if (any instanceof Cat) {
			//부모가 강제로 자식한테 감. 강제 형변환 (작은 곳으로 가니깐)
			Cat c2 = (Cat) any; //나 원래 dog이었어. 
			// 대신 실행시 에러날 수도. 형제끼리 형변환 하면, cat 과 dog가 하면,
			c2.method2();
			System.out.println(c2.a + c2.b);
		}
		
		
	}
	
	private static void f3() {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		c1.method1();
		d1.method1();
		//공통적으로 실행되어야 하는 코드. 
		call(c1);
		call(d1);
		
		
	}

	private static void f1() {
		Cat c1 = new Cat();
		System.out.println(c1.a); //Cat인 자식 클래스에서 만들어진 것이 없어서 Animal인 부모것으로 올라가서 참조한다. 
		c1.method1();
		
	}
	
	private static void f2() {
		Animal c1 = new Cat();
		System.out.println(c1.a); 
		
		//field와 method는 instance 가 아닌 타입을 따른다. 
		//System.out.println(c1.b);
		//c1.method2();
		//c1은 데이터 타입을 따른다. 
		
		c1.method1();
		
	}

}
