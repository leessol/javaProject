package com.shinhan.day03;

import java.util.Arrays;

public class ArrayTest {
	
	//cmd>java com/shinhan/day03/ArrayTest 100 200
	//명령행 매개변수: main 문에 매개변수 args 배열안에 던져주는 것이다. (외부에서 값이 들어오는 것을 받는다)
	public static void main(String[] args) {
		System.out.println(args.length);
		//따로 명령행 매개변수를 던져주지 않으면, 오류가 남.
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		System.out.println("더하기: " + (a+b));
		if (args.length < 2) {
			//main 빠지기
			//return
			System.exit(0); // 0: 정상종료 / -1: 비정상종료
		}
	}

	private static void f6() {
		int[] arr1 = new int[] {100,90,50,88};
		//갑자기 데이터가 10개로 늘었다면 이미 생성된 배열의 길이를 변경할 수 없다. 복사해야함,,,
		int[] arr2 = new int[10];
		for (int i = 0; i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.arraycopy(arr1,0,arr2,0,arr1.length);
	}

	private static void f5() {
		//선언 + 생성: 자동초기화됨
		int[] arr = new int[5];
		//선언 + 생성 + 수동 초기화 -> 수동으로 초기화 할 때는 배열의 길이를 언급하면 안된다. 
		int[] arr2 = new int[] {100,90,88,55,66};
		int[] arr3 = {100,500,60,5,9}; // new 생략가능
		// 단, 선언 먼저 그리고 초기화를 나중에 할떄는 반드시 new언급해야한다. 
		int[] arr4;
		arr4 = new int[] {100,500,60,5,9};
		//2차원 배열
		int[][] arr5 = new int[][] {{100,500,60,5,9},{100,500}};
 		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		for (int[] aa:arr5) {
			System.out.println(Arrays.toString(aa));
		}
		
	}

	private static void f4() {
		int[][] arr2;
		arr2 = new int[3][];
		//null로 되어있어서 따로 길이에 대해서 알 수 없음. 반드시 설정해 주어야 함. 
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		for(int i=0; i<arr2.length; i++) {
			for (int j=0;j<arr2[i].length;j++) {
				System.out.printf("%d행 %d열 = %d \n", i, j, arr2[i][j]);
			}
		}
	}

	private static void f3() {
		//2차원 배열: 배열의 배열
		//1.배열변수선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		//2.배열생성
		arr1 = new int[3][4];
		arr2 = new int[3][]; //큰 틀의 밖에 있는 배열은 반드시 길이를 알아야 한다. 뒷 배열은 Null로 선언해도 됨
		arr3 = new int[3][];
		
		//3.배열사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);
		
		//일반 for
//		for(int i=0; i<arr1.length; i++) {
//			for (int j=0;j<arr1[i].length;j++) {
//				System.out.printf("%d행 %d열 = %d \n", i, j, arr1[i][j]);
//			}
//		}
		
		//향상된 for
		for(int[] aa:arr1) {
			for(int j:aa) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

	private static void f2() {
		//배열: 하나의 이름으로 같은 타입의 Heap에 연속공간을 만드는 자료구조
		//1. 배열 변수 선언
		int[] score;
		//2. 배열 생성: 배열의 개수는 필수이다. 생성 시 자동으로 초기화된다. 
		// 초기화: 정수->0 / 실수-> 0.0 / boolean -> false / 객체 -> null
		score = new int[26];
		//3. 배열 사용: 자동 초기화가 된다. 
		score[0] = 100;
		score[1] = 150;
		score[2] = 80;
		
		int total = 0;
		System.out.println(score.length);
		for (int i = 0;i<score.length;i++) {
			total += score[i];
		}
		System.out.println(total);
		//향상된 포문
		int total2= 0;
		for(int scores:score) {
			total2 += scores;
		}
		System.out.println("totals: " + total2);
	}

	private static void f1() {
		//배열: 하나의 이름으로 같은 타입의 Heap에 연속공간을 만드는 자료구조
		//1. 배열 변수 선언
		int[] arr1; //지역변수는 초기화하지 않으면 사용할 수 없다. 
		int arr2[];
		double[] arr3;
		boolean[] arr4;
		String[] arr5;
		
		//2. 배열 생성: 배열의 개수는 필수이다. 생성 시 자동으로 초기화된다. 
		// 초기화: 정수->0 / 실수-> 0.0 / boolean -> false / 객체 -> null
		arr1 = new int[5];
		arr3 = new double[6];
		arr4 = new boolean[6];
		arr5 = new String[3];
		
		//3. 배열 사용: 자동 초기화가 된다. 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}

}
