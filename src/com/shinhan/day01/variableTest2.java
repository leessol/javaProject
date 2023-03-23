package com.shinhan.day01;

public class variableTest2 {

	public static void main(String[] args) {
//		int a;
//		System.out.println(a=10);
		System.out.println("main 시작");
		f3(); //함수호출(갔다가 다시 돌아옴)
		System.out.println("main 끝");
		
		
	}

	private static void f3() {
		short v1 = 32767;
		char v2 = 'A';
		int v3 = Integer.MAX_VALUE;
		long v4 = 21343252354L; //반드시 뒤에 L을 적어야 한다. 
		float v5 = 2.14f; //반드시 뒤에 f를 적어야 한다. 
		double v6 = 3.14 ; // 실수의 기본값은 double / 정수의 기본값은 int
		char v7 =  65;
		char v8 = 0x0041; //16진수로 매핑됨
		
		
				
	}

	private static void f2() {
		// 자바의 dataType: 정수 (byte(1), short(2), char(2), int(4), long(8))
		//실수 (float(4), double(8))
		// boolean(1): true, false
		// 00000000
		// 01111111: 127
		// 10000000: -128
		byte v1 = 127;
		byte v2 = -128;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		
		v1++;v1++;v1++; // 바이트 값이 변할 수 있음
		System.out.println(v1);
	}

	private static void f1() {
		int a;
		System.out.println(a=10);
		System.out.println(a==10);
	}

}
