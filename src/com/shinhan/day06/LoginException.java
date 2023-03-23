package com.shinhan.day06;

//사용자 정의 예외
//만든 이유: 문법적인 오류가 아니라 업무상 exception 처리를 일관성 있게 하기 위해서 사용자 정의(커스텀)한 것이다. 
//만들라면 extends Exception 상속 받아야 한다. 
//Exception: 기타 예외/사용자 정의 /일반 예외 / 강제 예외처리 --> 강제로 발생하는 예외이므로 예외 상황을 강제로 만들어야 한다. 
//RuntimeException: 자동예외 / 컴파일 에러가 아니라 실행 시 일어나는 예외이다. 
// 어떤 예외로 할지 고르고 부모로 정해서 상속 받아야 한다. 
public class LoginException extends Exception{
	
	
	public LoginException (String errMessage) {
		super(errMessage); //부모한테 들어가는 명시적인 오류 메세지
	}
	
	
	public void printMessage() {
		System.out.println("로그인: " + getMessage());
	}
}
