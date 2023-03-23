package com.shinhan.day06;

public class AnonymousTest {

	public static void main(String[] args) {
		f4();
	}

	private static void f4() {
		RemoteControl tv =  new RemoteControl() {
			int a = 10;
			public void method() {
				System.out.println("구현 class 에서 메서드 추가");
			}
			public void turnOn() {
				System.out.println("전원 켠다. ");
				method(); //내부에서 쓰려고 만든 것들. 외부에서 못쓴다. 
				System.out.println(a);
			}
			
			public void turnOff() {
				System.out.println("전원 끈다. ");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
		//tv.a  --> remotecontrol에 없다. 못씀. 
		
	}

	private static void f3() {
		//2. 익명객체: 변수 선언 조차도 안함

			(new Colorable() {
					
				@Override
				public void setForeground(String color) {
					System.out.println("익명.... setForegound: " + color);
						
				}
					
				@Override
				public void setBackground(String color) {
					System.out.println("익명.... backForegound: " + color);
						
				}
			}).setBackground("green");
		
	}

	private static void f2() {
		//2. 익명객체

		Colorable a = new Colorable() {
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명.... setForegound: " + color);
				
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명.... backForegound: " + color);
				
			}
		};
		
		a.setBackground("black");
		a.setForeground("purple");
	}

	private static void f1() {
		// 1. 일반적인 방법
		Book book = new Book();
		book.title = "이것이 자바다";
		book.setForeground("white");
		book.setBackground("blue");
		
		Cup cup = new Cup();
		cup.size = 10;
		cup.setForeground("white");
		cup.setBackground("blue");
	}

}
