package com.shinhan.day07;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ObjectTest4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		f15();
		
	}

	private static void f15() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		String result = sdf.format(d1);
		System.out.println(result);
		System.out.println(d1);
	}

	private static void f14() {
		DecimalFormat df = new DecimalFormat("###,###"); //문자형태를 원하는데 어떤 형태를 원하는지 
		long money = 1000000000000000000L;
		String ss = df.format(money);
		System.out.println(ss);
	}

	private static void f13() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime()); // 시간을 long으로 바꿀때
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonth());
	}

	private static void f12() {
		System.out.println(Math.max(10,20));
		
		//round, ceil(올림), floor(내림)
		double c = 3.1;
		System.out.println(Math.ceil(c));
		
		
	}

	private static void f11() {
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b);
		System.out.println(a.intValue() == b.intValue());
		
	}

	private static void f10() {
		String s = "이것이 자바다 123456 This is Java 5877 Hi 55568";
		
		char [] ch = s.toCharArray();
		for(char ss:ch) {
			if(Character.isDigit(ss));
				//result.append(ss);
		}
		//System.out.println(result);
	}

	private static void f9() {
		String s = "이것이 자바다 This is Java";
		System.out.println(s.substring(0,1));
		for(int i =0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
		}
		System.out.println("----------------");
		char [] arr = s.toCharArray();
		for (char st:arr) {
			//System.out.println(st);
			if (Character.isUpperCase(st)) {
				System.out.println(st + "-------대문자");
			} else {
				System.out.println(st + "-------소문자");
			}
		}
		
	}

	private static void f8() {
		String score = "200";
		int score2 = Integer.parseInt(score);
		System.out.println(score2);
		
		int su = 10;
		
		System.out.println(Integer.toBinaryString(su));
		System.out.println(Integer.bitCount(su));
		
	}

	private static void f7() {
		int a = 10; //기본형(값 저장, 연산, 비교)
		Integer b = 20; //참조형(객체: 기본형 + 기능 추가됨) b.하면 기능들(메소들)이 보인다. 
		//Autoboxing 해줌 new Integer(20)
		System.out.println(a+b+200);
		//원래는 a+b.intValue()+200 -> 자동으로 unboxing을 해준다. 
		float f =b.floatValue(); //이런식으로 
		
		System.out.println(Integer.MAX_VALUE);
		int su = Integer.compare(10, 5);
		System.out.println(su); //앞의 수가 크면 1, 뒤에 수가 크면, 둘이 같으면 0 / -1 --> < = > // -1,0,1
		int [] arr = {10,90,20,70,50};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void f6() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.toString());
		String s = dt.toString();
		StringTokenizer st = new StringTokenizer(s,"T");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("===========");
		System.out.println(dt.getYear());
		
	}

	private static void f5() {
		String fruits ="010-5410-9701 010-5566-55408";
		StringTokenizer st = new StringTokenizer(fruits,"- ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}		
	}

	private static void f3() {
		String fruits = "사과,오렌지/키위 수박,참외";
		
//		String [] arr = fruits.split(",|/| ");
//		for(String f:arr) {
//			System.out.println(f);
//		}
		
		// token 사용
		StringTokenizer st = new StringTokenizer(fruits,",/ ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
	}

	private static void f2() throws UnsupportedEncodingException {
		String s1 = "자바"; // 가장 일반적, String은 고정 문자열
		System.out.println(s1 + "프로그램");
		s1 = s1 + "프로그램"; //문자열의 내용이 자주 바뀌면 String을 사용하는 것은 좋지 않다 
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("자바 StringBuilder"); 
		//새로 계속 객체가 생성되는 것이 아니라 기존의 것이 수정됨 : StringBuffer / StringBuilder
		StringBuffer sf = new StringBuffer("자바 StringBuffer");
		//sb = sb + "aaa";
		sb.append("프로그램");
		System.out.println(sb);
		sf.append("프로그램");
		System.out.println(sf);
		
		//다시 String으로 변경
		String s2 = new String(sf);
		String s3 = new String(sb);
		
		sb.insert(2,"dddd");
		System.out.println(sb);
		
		String s4 = "자바프로그램";
		byte[] arr1 = s4.getBytes("utf-8"); //한글 1글자 -> 3byte
		byte[] arr2 = s4.getBytes("euc-kr"); //한글 2글자 -> 2byte
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		
	}

	private static void f1() throws UnsupportedEncodingException {
		String s1 = "자바"; //가장일반적
		String s2 = new String("자바");
		byte[] arr1 = new byte[] {65,66,67,97,98,99};
		char[] arr2 = new char[] {'A','B','C','a','b','c'};
		String s3 = new String (arr1);
		String s4 = new String (arr2);
		System.out.println(s1 + s2 + s3 + s4);
		String s5 = new String(arr1,"utf-8"); //지원되지 않을 수도 있음. -> 예외 처리 해야 됨
		System.out.println(s5.length());
		
		System.out.println((int) '가');
	}

}
