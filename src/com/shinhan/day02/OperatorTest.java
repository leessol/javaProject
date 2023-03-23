package com.shinhan.day02;

public class OperatorTest {

	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		int a = 70;
		if (a>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println(a>=70?"합격":"불합격");
		String result = a>=70?"합격":"불합격";
		System.out.println(result);
		
		System.out.println(++a>10 && ++a<=20);
	}

	private static void method4() {
		int a = 10;
		int b = 20;
		boolean result = a >10 | ++b==20;
		System.out.println(result);
		//&&(단축): 앞의 결과가 참이면 뒷부분 수행안함.
		// &: 무조건 끝까지 수행한다. 
		
	}

		
	private static void method3() {
		int a = 10;
		int b = 20;
		boolean result = a >=10 && b==20;
		//&&(단축): 앞의 결과가 거짓이면 뒷부분 수행안함.
		// &: 무조건 끝까지 수행한다. 
		
	}

	private static void method2() {
		int a = 10;
		int b = 0; //정수는 0으로 나눌 수 없다. (ArithmeticException)
		// RuntimeException이다. 컴파일시에느 오류가 없으나 실행 시에 오류가 난다. 
		double d = 0.0;
//		System.out.println(a/b);
		System.out.println(a/d);
		if (Double.isInfinite(a/d)) {
			System.out.println("계산불가");
		}else {
			System.out.println(a/d);
		}
		
		System.out.println(a%b);
		if (Double.isNaN(a%d)) {
			System.out.println("계산불가");
		} else {
			System.out.println(a%d);
		}
		
		
	}

	private static void method1() {
		int a=10;
		int b=20;
		a++;
		++a;
		System.out.println(++a); //증가 후 사용
		System.out.println(a++); //사용 후 증가
		System.out.println(a);
		
		
	}

}
