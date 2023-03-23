package com.shinhan.day06;

public class Button {
	//field
	private ClickListener listener;
	//method
	//void f1(int a){
		//this.a= a;
	//}
	
	//set개념 
	void set(ClickListener listener) {
		this.listener = listener;
	}
	
	//get개념
	public void buttonClick() {
		listener.onClick();
	}
	//내부 interface: 규격서 내부에 만든 이유는 button 전용으로만 쓰고 싶어서 외부 접근 제한 시킬려고
	static interface ClickListener{
		void onClick();
	}
}
