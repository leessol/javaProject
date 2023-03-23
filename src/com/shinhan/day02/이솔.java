package com.shinhan.day02;

public class 이솔 {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
	}

	private static void method8() {
		String grade = "B";
		
		int score1 = 0;
		switch (grade) {
		case "A" -> {
			score1 = 100;
			break;
		}
		case "B" -> {
			int result = 100-20;
			score1 = result;
			break;
		}
		default ->{
			score1 = 60;
		}
		}
		
	}

	private static void method7() {
		double x = 5.0;
		double y = 0.0;
		double z = 5%y;
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다. ");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
		
	}

	private static void method6() {
		int x = 10;
		int y = 5;
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
		
	}

	private static void method5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop + lengthBottom)*height/2.0;
		double area2 = (lengthTop + lengthBottom)*height*1.0/2;
		double area3 = (double)(lengthTop + lengthBottom)*height/2;
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		
	}

	private static void method4() {
		int value = 356;
		System.out.println(356-(356%300));
		
	}

	private static void method3() {
		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = 534/30;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = 534%30;
		System.out.println(pencilsLeft);
		
	}

	private static void method2() {
		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
		
	}

	private static void method1() {
		int x =10;
		int y =20;
		int z =(++x) + (y--);
		System.out.println(y);
	}
	
	

}
