package com.shinhan.day03;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = new Person[100];
		persons[0]=new Person(29,"이솔");
		persons[0].selfIntroduce();
		persons[1] = new Person(30,"홍길동");
		persons[2] = new Person(40,"김자바");
		persons[3] = new Person();
		
		persons[3].selfIntroduce();
		
		//System.out.println(Person.getPopulation());
		
		
		
		
	}

}
