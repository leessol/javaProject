package com.shinhan.day04;

public class SingletonTest {

	public static void main(String[] args) {
		MyServlet a = MyServlet.getInstance();
		MyServlet b = MyServlet.getInstance();
		
		System.out.println(a=b); //-->  같은 주소의 값 부름 
		
	}

	public void print() {
		System.out.println("싱글톤 연습 1");
	}
}
