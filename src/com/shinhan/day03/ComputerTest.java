package com.shinhan.day03;

public class ComputerTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		//애초에 걍 new하면 생성자로 생성이 된다고 생각하면됨. 걍 일반함수 호출하는거는 객체생성 된다음이고 
		// 맨 처음은 생성자 메소드로 값이 초기화 되는 것
		
		System.out.println("생성된 컴퓨터 갯수는: " + Computer.count);
		// 그래서 객체를 생성하기 전에 클래스 변수 static 을 사용할 수 있다. 객체 생성 전인데도,,, 0개 출력
		Computer com1 = new Computer();
		Computer com2 = new Computer("SAMSUNG1234");
		Computer com3 = new Computer("Window",100);
		Computer com4 = new Computer("LG","Window",200);
		System.out.println("생성된 컴퓨터 갯수는: " + Computer.count); // 객체 생성 후니깐 4대 생성됨. 
		display(com1);
		display(com2);
		display(com3);
		display(com4);
	}

	private static void display(Computer com) {
		System.out.println("========================");
		System.out.println(com.getModel());
		com.computerInfoPrint();
		
	}
	
	

}
