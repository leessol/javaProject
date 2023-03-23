package com.shinhan.day07;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest2 {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		Computer c1 = new Computer();
		Computer c2 = new Computer("A",100,"LG");
		//System.out.println(c2.getModel());
	}

	private static void f2() {
		//단순히 데이터 전송만 구현하려면 레코드 기능 사용한다. 
		// 생성자, getter, toString, equals 메소드를 자동으로 생성한다. 
		//14버전부터 사용한다. 
		Person p1 = new Person("홍길동",20);
		System.out.println(p1);
		System.out.println(p1.age());
		System.out.println(p1.name());
		
	}

	private static void f1() {
		ProductVO p1 = new ProductVO("컴퓨터", 100, "삼성");
		ProductVO p2 = new ProductVO("컴퓨터", 100, "삼성");
		System.out.println(p1 == p2); // 주소비교, 자바는 연산자 재정의 불가. (함수만 재정의 가능하다)
		System.out.println(p1.equals(p2));//재정의 안하면 객체 주소 비교한다. String이 아니니깐.. 재정의 해야함. 
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Set <ProductVO> data = new HashSet<>();
		data.add(p1);
		data.add(p2);
		for(ProductVO p: data) {
			System.out.println(p);
		}
	}

}
