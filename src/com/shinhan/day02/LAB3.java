package com.shinhan.day02;

public class LAB3 {

	public static void main(String[] args) {
		gcd(2,5);
		gcd(5,15);
		gcd(250,30);
		
	}

	private static void gcd(int a, int b) {
		int min = a>b?b:a;
		int result = 1;
		for (int i=min;i>=1;i--) {
			if (a%i ==0 && b%i ==0) {
				result=i; 
				break;
			}
		}
		System.out.println(result);
	}

}
