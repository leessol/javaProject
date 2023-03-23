package com.shinhan.day03;

public class Person {
	static int numberOfPersons;
	private int age;
	private String name;
	
	
	public Person() {
		this(12,"Anonymous");
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		++numberOfPersons;
	}
	
	public void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살입니다. ");
	}
	
	 int getPopulation() {
		
		return numberOfPersons;
	}
}
