package com.shinhan.day05;
//다른 패키지
import com.shinhan.day04.Phone;

public class ModifierTest {

	
	public static void main(String[] args) {
		Phone p = new Phone();
		
		System.out.println(p);
		p.model = "갤럭시";
	}

}
