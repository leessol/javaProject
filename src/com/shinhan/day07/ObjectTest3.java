package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

//명령행 매개변수 > java 클래스이름 매개변수1 매개변수2 ...
public class ObjectTest3 {

	public static void main(String[] args)  {
		f5();
		System.out.println("end");
	}

	private static void f5() {
		String ss = System.getProperty("os.name");
		System.out.println(ss);
		
	
//		//특성을 모를 경우
		Properties sw = System.getProperties();
		Set<Object> keys = sw.keySet(); //Object 아무거나 다 올 수 있다는 뜻
		for(Object key:keys) {
			System.out.println(key + "==============" + System.getProperty((String) key));
		}
		
		//키 알때
		Properties ps = System.getProperties();
		System.out.println("===================");
		for(Object key:ps.keySet()) {
			
			System.out.println("key:" + key);
			
		}
	}

	private static void f4() {
		long startTime = System.nanoTime();
		for (int i=0;i<1000000;i++) {
			
		}
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime-startTime));
		
	}

	private static void f3(String[] arr) {
		if(arr.length == 0) {
			//1. 함수 빠지기
			System.out.println("명령행 매개변수가 없다. ");
			//return;
			
			//2. 프로그램 당장 종료
			System.exit(0);
		}
		System.out.println("매개변수: " + Arrays.toString(arr));
		
	}

	private static void f2() throws IOException {
		//표준 입력 (default: 키보드)
		//파일도 있음. 
		InputStream is = System.in; //현재는 1바이트씩 읽어서 한글이 깨짐(한글을 2바이트씩)
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		// 엔터가 아닐때까지 
		while((i = ir.read())!=13) {
			System.out.println((char)i);
		}
	}

	private static void f1() {
		//System class
		//1. out: 표준 출력(모니터 출력)
		//2. err
		//3. in: 표준 입력
		PrintStream ps = System.out;
		ps.print(false);
		ps.printf("%10d",100); //오른쪽 정렬
		ps.printf("%-10d",200); //왼쪽 정렬
		ps.println("자바");
		ps.println("================");
	}

}
