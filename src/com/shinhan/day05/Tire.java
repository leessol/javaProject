package com.shinhan.day05;

//abstract class: 추상 메소드가 1개 이상 있음. 
// 그럼 추상메소드는?: 정의는 있고 구현은 없는{} 
// 구현은 상속받은 자식 class가 반드시 한다. (override 의무)

public abstract class Tire {
	//아무리 부모가 정의하고 있어도 자식이 재정의하고 있으면 자식의 것으로 출력된다. 
	// 근데,,, 사실상 구현할 필요가 없음.. 왜? 자식에서 재정의 하고 있으니깐
	// 그럼 정의만 있고 구현은 없어도 되게 만들면 됨
	// --> 그것이 바로 "추상화"라는 개념이다. 
//	void roll() {
//		System.out.println("타이어가 굴러갑니다. "); -> 자식에서 재정의하고 있어서 사실상 구현할 필요 없음.
//	}
	public abstract void roll();
	// 추상 메소드 : 정의는 있고 구현 {} 은 없다. 
	
	void f1() {
		System.out.println("Tire class f1 method~");
	}
	void f2() {
		System.out.println("Tire class f2 method~");
	}
}

