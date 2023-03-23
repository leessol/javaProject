package com.shinhan.day01;

public class variableTest {
	int score;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수 선언
		int a; //지역변수(local)
		//System.out.println(a); -> 에러남 (지역변수는 초기화하지 않으면 사용불가)
		//System.out.println(score);
		
		// 2. 변수 사용 (재사용하려고)
		a = 10; // 할당
		System.out.println(a); //읽기
		
		// 3. 선언 + 사용
		int a2 = 30;
		
	}

}
