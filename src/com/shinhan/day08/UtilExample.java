package com.shinhan.day08;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println("pair의 나이는 " +age);
		
		ChildPair<String,Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair,"홍삼순");
		System.out.println("childPair의 나이는" + childAge);
		

//		OtherPair <String,Integer> otherpair = new OtherPair<>("홍삼원",20);
//		Integer age3 = Util.getValue(childPair,"홍삼순");
//		System.out.println("OtherPair의 나이는" + age3);

	}

}
