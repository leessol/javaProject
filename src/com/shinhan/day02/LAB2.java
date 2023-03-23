package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("년 입력 : ");
		int year = key.nextInt();
		System.out.println("월 입력 : ");
		int month = key.nextInt();
		
		if (month>12) {
			System.out.println("존재 안함"); return;
		}
		numDay(year, month);
	}

	//void: return 값이 없다
	//static: class가 메모리에 load될 때 method 영역에 올라간다;
	//public: 모든 패키지에서 이 함수를 호출할 수 있다. 
	private static void numDay(int year, int mon) {
		int lastDay=0;
		String yoon = "윤년해당없음";
		switch(mon) {
		case 1, 3, 5, 7, 8, 10, 12:lastDay=31;break;
		case 4, 6, 9,11:lastDay=30;break;
		case 2:
			lastDay=28;
			yoon = method6(year)?"윤년":"윤년아님";
			break;
		}
		System.out.println(lastDay);
		System.out.println(yoon);
	}

	private static boolean method6(int year) {
		
		boolean flag = false;
		if(year%4==0) {
			if (year%400 == 0 || year%100!=0) {
				flag =true;
			}
		}
		
		return flag;
		//System.out.println(flag?"윤년":"윤년아님");
		
	}

	private static void method5() {
		int a = 1;
		int result = 0;
		for(int i = 1;i<=15;i++) {
			result += a;
			a += i;
		}
		System.out.println(result);
	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 :");
		int a = sc.nextInt();
		int count = 0;
		int result = 0;
		for (int i = 1;i<=1000;i++) {
			if(i%a == 0) {
				result += i;
				count +=1;
			}
		}
		System.out.println(result);
		System.out.println(count);
	}

	private static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int a = sc.nextInt();
		if (a<2 || a>10) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		int result;
		for (int i = 1; i <= a; i ++) {
			result = 1;
			for (int j = 1; j<=i; j++) {
				result *= j;
			}
			System.out.println(i + " ! = " + result);
			
		}
		
	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 100사이의 정수를 입력하세요. : ");
		int a = sc.nextInt();
		boolean flag= true;
		for (int i = 2; i<=100; i++) {
			if (a%i == 0 ) {
				
				break;
			}
		}
		
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int a = sc.nextInt();
		
		if (a<2 || a>10) {
			System.out.println("잘못된 숫자가 입력되었습니다. ");
			return;
		}
		for (int i = 1; i<=9;i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
		
	}

}
