package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		forTest4();
	}

	private static void forTest4() {
		int su =1;
		int total = 0;
		for (;su<=10;su++) {
			total +=su;
			System.out.println(su + "+");
		}
		System.out.println("="+total);
		
	}

	private static void forTest() {
		//1~10까지 출력한다. 
		for (int i=1;i<=10;i++) {
			System.out.println(i);	
		}
	}
	
	private static void forTest2() {
		//1~10까지 출력한다.
		int i = 1;
		for (;;) {
			if (i >10){
				break;
			}
			
			System.out.println(i);
			i+=1;
		}
		
	}
	
//	private static void while() {
//		//1~10까지 출력한다.
//		int i = 1;
//		while (i <= 10) {			
//			System.out.println(i);
//			i+=1;
//		}
//		
//	}

}
