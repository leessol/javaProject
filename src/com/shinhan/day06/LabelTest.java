package com.shinhan.day06;

public class LabelTest {

	public static void main(String[] args) {
		Label v1 = new Label("이름입력", 20, 5, "Black", "Large");
		//Colorable v2 = new Label("이름입력", 20, 5, "Black", "Large");
		Changeable v3 = new Label("이름입력", 20, 5, "Black", "Large");
		//Resizable v4 = new Label("이름입력", 20, 5, "Black", "Large");

		work(v1);
		//work(v2);
		work(v3);
		//work(v4);
	}
	
	//자동형변환: 부모의 타입 객체참조변수 = 자식 객체
	static void work(Changeable aa) {
		if (aa instanceof Label label) {
//			label.setBackground(null);
//			label.setFont(null);
//			label.setForeground(null);
//			label.size(0, 0);
		}
	}

}
