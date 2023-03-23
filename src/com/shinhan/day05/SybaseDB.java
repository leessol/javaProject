package com.shinhan.day05;

public class SybaseDB extends Object implements JDBCInterface {

	@Override
	public void dbConnect(String dbName) {
		System.out.println("상수 접근: " + JDBC);
		System.out.println("상수 접근: "+ JDBC2);
		//1. default 메소드 호출
		select();
		//2. static 메소드 호출
		JDBCInterface.update(); //static 붙어서 interface꺼다. 그래서 인터페이스명.함수명 으로 해야한다 .
		//3. private는 호출이 불가하다. 
		
	}

	public void select() {
		System.out.println("sybaseDB....select 재정의");
	}
	
	
	@Override
	public void dbConnect2(String dbName) {
		System.out.println(dbName + "SybaseDB dbConnect2");
		
	}
}
