package com.shinhan.day07;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car{
	String model;
	int price;
	
	public Car(String model, int price) {
		super(); //extends Object생략. Object의 객체도 만들어짐. 
		this.model = model;
		this.price = price;
	}

	// 동등비교 (예, HashSet은 중복불가): Hashcode(), equals()가 같아야 같은 객체로 판별한다 .
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	//내용만 같은지 확인하려면 이것만 보면됨. 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

//	@Override //hash 코드 재정의: 좋은 소스는 아니다. 
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return model.hashCode() + price; // 해시코드(모델명과) + 가격이 같으면 같은 것이다 라고 재정의함. 그래서 set함수에서 걸러짐
//	}
	
	
	
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
		f5();
		
	}

	private static void f6() {
		//Set: 순서가 없다. 중복을 허용 안함. --> 키로 사용
		//Set data = new HashSet();
		//이렇게 아무 타입의 문자를 넣으면 나중에 힘들다. --> 제한해야함. Gerneric <>
//		data.add(100);
//		data.add("월");
		
		Set <String> data = new HashSet<String>();
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("월");
		data.add("화");
		
		for(String s :data) {
			System.out.println(s);
			
		}
		
		
	}

	private static void f5() {
	
		
		Set <Car> data = new HashSet<Car>();
		//Car 타입을 넣을 것이다. 
		data.add(new Car("A", 100));
		data.add(new Car("B", 100));
		data.add(new Car("C", 100));
		data.add(new Car("A", 100));
		data.add(new Car("A", 100));
		data.add(new Car("G", 100));
		
		for(Car s:data) {
			System.out.println(s);
		}
		
	}

	private static void f4() {
		Car obj1 = new Car("A모델",100);
		Car obj2 = new Car("B모델",300);
		
		
		
		
	}

	private static void f3() {
		Date obj1 = new Date();
		Date obj2 = new Date();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"같음":"다름"); //== 시 객체는 주소 비교
		System.out.println(obj1.equals(obj2)?"내용 같다":"내용다름"); //Date equals(): 주소 비교 --> Date 클래스가 내용 비교로 재정의 한것임. 
		
	}

	private static void f2() {
		String obj1 = new String();
		String obj2 = new String();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"같음":"다름"); //== 시 객체는 주소 비교
		System.out.println(obj1.equals(obj2)?"내용 같다":"내용다름"); //String equals(): 주소 비교 --> String 클래스가 내용 비교로 재정의 한것임. 
		
	}
	
	

	private static void f1() {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2?"쥬소같음":"다름"); //== 시 객체는 주소 비교
		System.out.println(obj1.equals(obj2)?"주소같다":"주소 다름"); //Object equals(): 주소 비교
		
	}

	
}
