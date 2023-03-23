package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter

public class Student2 implements Comparable<Student2>{
	private String name;
	private int score;
	private String gender;
	
	//chain방식
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=")
		.append(name)
		.append(", score=")
		.append(score)
		.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Student2 obj) {
		int result = score - obj.score;
		return result;
	}

	

	
	
	
}
