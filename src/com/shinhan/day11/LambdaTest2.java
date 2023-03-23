package com.shinhan.day11;

public class LambdaTest2 {

	public static void main(String[] args) {
		f2(100);

	}

	static String subject = "자바";
	private static void f2(int num) {
		
		int num2 = 200; //지역 변수를 메소드 내 -> 내부 클래스에서 사용할 때는 final 특성을 갖는다. 
		int num3 = 800;
		num3++; // 얜 가능. 
		
		//1.익명구현
		//내부 class에서 지역변수를 사용한다면 final의 특성을 갖는다. (수정불가)
		Calculable2 f = (a,b)->{
			System.out.println("람다표현식 " + subject);
			return a+b+num2+num;
		};
		
		int result = f.calculate(1, 2);
		System.out.println(result);
	}
	
	private static void f1(int num) {
		
		int num2 = 200; //지역 변수를 메소드 내 -> 내부 클래스에서 사용할 때는 final 특성을 갖는다. 
		int num3 = 800;
		num3++; // 얜 가능. 
		
		//1.익명구현
		//내부 class에서 지역변수를 사용한다면 final의 특성을 갖는다. (수정불가)
		Calculable2 f = new Calculable2() {
			
			@Override
			public int calculate(int x, int y) {
				System.out.println("익명 구현 객체");
				//num+=6; 수정 불가
				return x+y+num2+num;
				
			}
			
			
		};
		
		int result = f.calculate(1, 2);
		System.out.println(result);
	}

}
