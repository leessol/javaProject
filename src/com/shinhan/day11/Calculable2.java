package com.shinhan.day11;

//함수형 표현 --> 람다식 --> 람다 표현식으로 표현 가능한지 알아보려면 아래의 어노테이션 사용한다. 
//interface에 1개의 메서드만 존재해야 한다. (반드시)
@FunctionalInterface
public interface Calculable2 {
	//추상 메서드 정의
	int calculate(int x, int y);
	//void calculate2(int x, int y); //함수를 두개 선언하면 @functionalInterface 불가 함수가 하나여야 한다. 
	
}
