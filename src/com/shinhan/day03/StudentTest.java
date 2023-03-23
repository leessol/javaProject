package com.shinhan.day03;

public class StudentTest {

	public static void main(String[] args) {
		f1();
		

	}

	private static void f1() {
		Student student1 = new Student("임채희","56789","WEB",200); ///정보은닉이다....
		Student student2 = new Student();
		student1.name = "이솔";
		student1.stdId = "1234";
		student1.subject = "java";
		student1.score = 10000;
		display(student1);
		display(student2);
	}

	private static void display(Student std) {
		System.out.println(std.name);
		System.out.println(std.score);
		
	}
	
	

}
