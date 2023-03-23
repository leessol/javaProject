package com.shinhan.day05;

public class MemberService {
	private String id="hong";
	private String password="12345";
	
	MemberService(){

	}
	
	public boolean login(String id, String password){
		if (id.equals(this.id) && password.equals(this.password)) {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println(id + " 님이 로그아웃 되었습니다");
	}
}
