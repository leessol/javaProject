package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student {
	
	String[] language;
	
	
	public ExchangeStudent(String stdId,String name,String[] language) {
		super(stdId,name); // 오류남.... 부모 생성자에 default 생성자가 없다. 
		// 사실 원래는 ExchangeStudent에서도 할 수 있지만, 부모의 멤버 변수에 굳이 직접 접근하는건 바람직 하지 않음
		// this.setStdId(stdId);
		// this.name = name;
		// 해결방법: 
		// 1. 부모에서 default 생성자를 정의 
		// 2. 명시적으로 부모생성자를 호출한다.
		this.language = language;
	}
	
	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 메서드");
	}

	@Override
	//부모 클래스 Student 의 toString() 메소드 오버라이딩
	public String toString() {
		return "ExchangeStudent 정보 [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}

//	@Override 
//	// 이 클래스에서 생성된 language에 대한 정보는 부모 Student 클래스에는 없다. 
//	public String toString() {
//		String aa = super.toString();
//		return aa + "ExchangeStudent [language=" + Arrays.toString(language) + "]";
//	}
	
	
}
