package com.shinhan.day06;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		
		//0~1 사이의 실수
		double a = Math.random();
		//1~10정수
		int b = (int)(a*10)+1; //1<=...<=10
		System.out.println(a);
		System.out.println(b);
		
		//Exception: 1. 자동으로 발생 / 2. 강제로 발생
		//1. 자동
		//int a = 10/0; // 자동으로 발생됨. 
		
		//2. 강제 -> 업무상 정하는 오류이다. 자동으로 발생하는 오류가 아님
		String pass = "12345";
		char ch = pass.charAt(0);
		try {
			if(ch<'A' || ch > 'Z') {
				throw new LoginException("대문자로 시작해야 한다. "); //부모한테 들어감. 
			}
		} catch (LoginException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
			ex.printMessage();
		}
		

	}

}
