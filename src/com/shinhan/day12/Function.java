package com.shinhan.day12;


//interface: 규격서(반드시 규칙을 지켜라)
//정의되어있는 추상메서드를 구현 class가 반드시 구현해야한다. 
//T는 제네릭 타입... 사용시 결정한다.
//람다 표현식으로 가능한 interface이고자 한다. => 추상 메서드가 1개만 존재해야한다. 
//람다 표현식이 아니라면 구현 class를 만들거나 익명구현 class를 만든다. => 추상메서드 여러개 가능

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);

	
}
