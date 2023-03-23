package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f8();
	}

	private static void f8() {
		// TODO Auto-generated method stub
		int a = 10;
		float b = 20.1235f;
		
		
		//.out.println("a = " + a + " b =" + b);
		//%-5d : -는 왼쪽정렬, d: decimal
		//%3.1f: 전체자리수. 소수점아래자리수 float
		System.out.printf("a=%10d, b=%3.1f",a,b);
	}

	private static void f7() {
		int a = 100;
		{
			int b = 500;
		}
		//블록을 벗어나면 안된다. 
		
	}

	private static void f6() {
		// 자바 기본 타입: byte, short, char, int, long, float, double, boolean (기본타입 8개)
		// 목적: data 저장, 연산, 비교
		// Wrapper Class: 자바기본타입(위의 8개) + 기능(함수) --> 자바의 기본 타입 함수들을 만들어 놓음
		// --> Byte, Short, Character, Integer, Long, Float, Double, Boolean --> 이것들이 Wrapper class이다. 
		String score = "100";
		System.out.println(score + 10); // 문자 + 숫자 ==> 문자이다. 
		
		//만약 110으로 숫자로 인식하게 하고 싶다면
		Integer i2 = 100;
		System.out.println(Integer.parseInt(score) + 10); //숫자 + 숫자 => 숫자
		
		int i = 100;
		String str = String.valueOf(10);
		//String str = i + "";
		//int형을 문자열로
		
		
		
	}

	private static void f5() {
		byte v1 = 10;
		byte v2 = 20;
		byte v3 = (byte) (v1 + v2);
		int v4 = v1 + v2; //자동으로 바이트ㄴ 연산은 결과값이 int로 형변환된다. 
		// 사칙연산에서 byte 가 int 로 자동변환 된다. 
		System.out.println(v3);
		System.out.println(v4);
		
		
	}

	private static void f4() {
		// 강제 형변환
		// 작은방 <- 큰값 / (작은방타입)큰값 타입을 바꾸어버린다... 하지만 데이터 손실 가능성 있음
		byte v1;
		int v3 = 100;
		v1 = (byte)v3;
		System.out.println(v1);
		
	}

	private static void f3() {
		// **자동 형변환
		// 큰방 = 작은값
		//byte < short < int < long < float < double
		// char
		//boolean
		byte v1 = 127;
		short v2 = v1;
		//수용 가능 방이 더 커서 --> 자동으로 형변환이 됨
		float v5 = v1; //값이 소숫점이 붙어서 나옴, float형으로 형변환이 자동으로 되어서 
		
		//char v3 = v1;
	}

	private static void f2() {
		// \n: new line
		// \t: tab
		// \": "
		String str1 = "자바 '프로그램' 완성";
		String str2 = "자바 \"프로그램\" 완성";
		String str3 = "{\"name\":\"홍\"}"; //json 형태 
		String str4 = """
				{"name":"홍","age":"20"}
				""";
	     //XML: 태그를 내맘대로 커스텀할 수 있음. / 태크때문에 3배이상의 용량이 들어간다.
		 //JSON: dictionary(파이썬) / map(자바) / javascript object notation(자바스크립트)
		 
		
	}

	private static void f1() {
		// TODO Auto-generated method stub
		// java.base모듈 안에 -> java.lang 패키지 안에 -> String class 에 있음
		// 기본형이 아님. (int,char 이런걸 기본형이라고 함)
		String s1 = "자바"; // 컴파일 시점에 .class의 상수 pool에 만들어진다. 
		String s2 = "자바"; // 따라서 이렇게 적으면 s1과 주소가 같다. 
		// 스택에 메모리 할당되면 힙 영역에 같은 것을 가리키게 된다. 
		
		String s3 = new String ("자바"); // 실행 시 만들어진다. 
		String s4 = new String ("자바"); // 실행 시 만들어진다. 
		// 이것들은 새로 아예 생성이 된다. 힙에 (낭비일 수도,,)
		
		s1 = s1 + "프로그램"; //s1 string이 스택에 이미 적혀있는데, s1 + "프로그램"이라는 것이 stringbuffer에 또 생김. 
		//s1.append("프로그램");//으로 하는게 좋다. 
		s2 = s2 + "프로그램";
		//s1과 s2는 이경우에는 다르다. 
		//stringbuffer가 생성돼서 아예 새로운 문자열을 생성한다. 메모리 낭비됨--> 웬만하면 스트링끼리 연산은 안하는 걸로,,,
		//dangling: 쓰레기 값들 메모리에서 정리 
		
			
	}

}
