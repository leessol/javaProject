package com.shinhan.day02;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		String subjects = "자바, DB, HTML, CSS, JavaScript, React, Spring";
		String [] arr = subjects.split(","); //배열로 반환함. |(or)로 split할것을 나열할 수 있다. 
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[6]);
		for(String s:arr) {
			System.out.println(s);
		}
	}

	private static void f3() {
		String subject = "이것이 자바다";
		for (int index = 0;index<subject.length();index++) {
			System.out.println(subject.charAt(index));
			System.out.println(subject.substring(index, index+1));
			//같은 결과가 출력된다. 
			System.out.println();
			
		}
		System.out.println(subject.replace("이","AA")); // 원본이 바뀌지는 않음 (고정문자열이다) 그 순간에만 바뀐다. 
		//원본을 바꾸고 싶다면,  바꾼것을 다시 subject에 넣는다
		subject = subject.replace("이","BB");
		System.out.println(subject.indexOf("바다")); //index를 출력한다. 
		
		
		
	}

	private static void f2() {
		String name=null; //null 은 힙에 생성된 객체는 없다. 
		System.out.println(name.length());
		
		
	}

	private static void f1() {
		int a = 10;
		String s1 = "자바"; 
		//메소드 안에 들어갔으니 스택에 저장됨 // 컴파일 시에 class의 상수 pool에 들어간다. 
		//로드 시에 메소드 영역에 있는 상수 pool에 들어간다. 
		String s2 = "자바";
		System.out.println(s1 == s2); // 주소가 같다는 뜻이다. 
		
		String s3 = new String ("자바");
		String s4 = new String ("자바");
		System.out.println(s3==s4); // 주소가 다르다. 
		
		s1 = s1 + "aa";
		s2 = s2 + "aa";
		System.out.println(s1==s2); //주소가 다르다. 값이 변견되었으므로

		System.out.println(s1.equals(s2)); //내용이 같다. ==은 주소가 같냐고 물어보는것
		
		
	}

}
