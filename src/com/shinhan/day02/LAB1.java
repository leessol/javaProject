package com.shinhan.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		method4();
	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수: ");
		int row = sc.nextInt();
		
		for (int i = 0; i<=row-1;i++) {
			for (int j=1;j<=10-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void method3() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요.: ");
		a = sc.nextInt();		
		int start=a%2==0?2:1;
		int result=0;
		for (int i=start;i<=a;i+=2) {
			result += i;
		}
		System.out.println("총합은 " + result + "입니다");
		sc.close();
	}

	private static void method2() {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine().toUpperCase();
		for (int i=0;i<=str.length();i++) {
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}

	private static void method1() {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요.: ");
		a = sc.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요.: ");
		b = sc.nextInt();
		System.out.print("증가분을 정수로 입력하세요.: ");
		c = sc.nextInt();
		int result=0;
		for (int i=a;i<=b;i+=c) {
			result += i;
		}
		System.out.println("총합은 " + result + "입니다");
		sc.close();
	}

}
