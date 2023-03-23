package com.shinhan.day12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.ToIntFunction;

public class Example {

	static Student[] studentList = {
			new Student("김1", 10, 20),
			new Student("김2", 10, 20),
			new Student("김3", 10, 20),
			new Student("김4", 10, 20),
			new Student("김5", 10, 20)
	};
	
	
	public static void main(String[] args) {
		double engAvg = avg(s->s.getEngScore());
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("영어평균:" + engAvg);
		System.out.println("수학평균:" + mathAvg);		
		engAvg = avg2(s->s.getEngScore());
		mathAvg = avg2(s->s.getMathScore());
		System.out.println("영어평균2:" + engAvg);
		System.out.println("수학평균2:" + mathAvg); 
	}
	//람다표현식과 스트림 사용예제
	private static double avg2(ToIntFunction<Student> f) {
		return Arrays.stream(studentList)
				.mapToInt(f).average().orElse(0);
	}
	
	//람다표현식 사용예제
	private static double avg(Function<Student> f) {
		double result = 0;
		for(Student st:studentList) {
			double d = f.apply(st);
			result += d;
		}
		return result/studentList.length;
	}

}






