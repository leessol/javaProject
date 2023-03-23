package com.shinhan.day08;

public class Course {
	public static void registerCourse(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getCanonicalName() + "가 등록한 과정임...모두 올 수 있음");
	}
	
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getCanonicalName() + "가 등록한 과정임...Student/HighStudent/MiddleStudent");
	}
	
	//
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getCanonicalName() + "가 등록한 과정임...Worker/Person");
	}
}
