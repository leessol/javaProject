package com.shinhan.day06;
/*
 * 1. 변수: data를 저장하기 위한 기억장소이름, 값 수정 가능 
 * 2. 상수: data를 저장하기 위한 기억장소이름, 값 수정 불가능
 * 3. enum: 관련있는 상수들의 묶음
 * 4. method: 문장들의 묶음
 * 5. class: object를 만들기 위한 틀(설계도) --> 변수 + 상수 + 메소드
 * 6. object: class로 new한 실체
 * 7. interface: 규격서, 상수 + 추상메소드 + default method + static method
 * 
 */
abstract class ParentClass {
	abstract void method1(); 
}


interface MyInterface{
	//규격서
	void method2();
}

interface MyInterface2{
	//규격서
	void method2_1();
}

interface MyInterface3 extends MyInterface, MyInterface2{
	//규격서 -> MyInterface3 이 MyInterface 와 MyInterface2를 상속 받으니깐 My3만 상속 받으면 된다. --> 인터페이스는 다중 상속이 된다. 
	void method3_1();
}


class MyClass1 extends ParentClass implements MyInterface3{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() { //interface 클래스 내에서 (public) 이 생략된 것이므로 반드시 public을 적어줘야 한다. 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyClass2 extends ParentClass implements MyInterface3 {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() { //interface 클래스 내에서 (public) 이 생략된 것이므로 반드시 public을 적어줘야 한다. 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}
		
}



public class Review {

	public static void main(String[] args) {
		ParentClass v1 = new MyClass1();
		work(v1);
	}
	
	static void work(ParentClass aa) {
		aa.method1(); //Parent 클래스에 method1이 있기 때문에 가능. 
		//아래의 것들은 전부 오류남 해결 어떻게? MyInterface3를 참조한 객체를 생성 해서 강제 형변환을 해준다
		// 왜냐면 그림상으로는 parent class와 myinterface3와는 전혀 관련이 없기 때문에. 상속관계도 아니고 ...
		// p.390 참고
		
		if(aa instanceof MyInterface3 ) {
			MyInterface3 my = (MyInterface3) aa;
 			//parent 타입인 aa를 myinterface3 로 강제 형변환
			my.method2();
			my.method2_1();
			my.method3_1();
		}
		
	}

}































