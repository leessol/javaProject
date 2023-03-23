package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		method3();

	}

	private static void method3() {
		// 12 1 2
		// 3 4 5
		// 6 7 8
		// 9 10 11
		Scanner sc = new Scanner(System.in);
		System.out.print("월>>");
		int month = sc.nextInt();
		String message = "";
		switch (month) {
		case 12,1,2: message = "겨울입니다"; break;
		case 3,4,5: message = "봄입니다"; break;
		case 6,7,8: message = "여름입니다"; break;
		case 9,10,11: message = "가을입니다"; break;

		default: message="잘못 입력하셨습니다"; break;
		}
		System.out.println(message);
		
	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 >>");
		int score = sc.nextInt();
		String grade = "F";
		
		//대신 8버전은 ,(컴마)를 스위치 문에 사용할 수 없다. 
		//더 낮은 버전은 switch 문 안에 key 값에 string 을 사용할 수 없다. 
		switch (score/10) { //원래는 그냥 십의자리로 나누었는데 그렇게 되면 결과가 커지고 비교하면서 무거워짐.. 그래서 생각한 것이 10으로 나워서 일의 자리로 비교한다. 
		case 10: grade = "A"; break;
		case 9: grade = "B"; break;
		case 8: grade = "C"; break;
		case 7: grade = "D"; break;
		default: grade = "F"; break;
		}
		
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 >>");
		int score = sc.nextInt();
		String grade = "F";
		
		if (score >= 90) {
			grade = "A";
		}
			System.out.println("결과" + score + "==>" + grade);
	}

}
