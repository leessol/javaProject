package com.shinhan.day02;

import java.io.IOException;
import java.io.InputStream; // import 해야됨 
import java.util.Scanner;
//java.lang 패키지에 있는 class는 import 없이 사용해도 되지만 없는것은 반드시 import해야 한다. 

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f2();

	}
	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수>>>");
		int s = sc.nextInt();
		System.out.println("이름>>>");
		String name = sc.next();
		System.out.println("메모>>>");
		String memo = sc.nextLine();
		System.out.println(name + "==>" + s + ">>>"+ memo);
		
		
	}
	//error throws 알아서 에러처리 가상머신한테 맡김
	private static void f1() throws IOException {
		/*
		 * System.out.println("f1 function"); System.out.print("점수입력>>"); InputStream is
		 * = System.in; int j = is.read(); System.out.println((char)j);
		 * System.out.println(j);
		 * 
		 * //한 바이트만 읽으니깐 루프돌림
		 * 
		 * int i; while ((i=is.read())!=13) { System.out.println((char)i);
		 * 
		 * }
		 */
	}

}
