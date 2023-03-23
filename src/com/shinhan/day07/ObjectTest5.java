package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		f7();
		

	}

	private static void f7() throws IOException {
//		URL url = ObjectTest5.class.getResource("CellPhone.class");
//		System.out.println(url.getPath());
//		
//		URL url2 = ObjectTest5.class.getResource("images.jfif");
//		System.out.println(url2.getPath());
		
		InputStream is = ObjectTest5.class.getResourceAsStream("CellPhone.java");
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i = ir.read())!=-1) {
			System.out.println((char)i);
		}
		is.close();
	}

	private static void f6() throws IOException {
		//경로 쓰는 것이 불편하다,,, f7() 참고 
		FileReader fr = new FileReader("src/com/shinhan/day07/CellPhone.java");
		int i;
		while((i = fr.read())!= -1) {
			System.out.print((char)i);
		}
		fr.close();
	}

	private static void f5() throws ClassNotFoundException {
		Class cls = CellPhone.class;
		Class cls2 = Class.forName("com.shinhan.day07.CellPhone");
		CellPhone phone = new CellPhone("a");
		Class cls3 = phone.getClass();
		
		Method [] ms = cls.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount() + "개 파라미터");			
		}
		
//		Field [] fs = cls.getDeclaredFields();
//		for(Field f:fs) {
//			System.out.println(f.getName());
//			System.out.println(f.getType().getSimpleName());
//		}
		
//		Constructor[] constructors =  cls.getDeclaredConstructors();
//		for(Constructor con:constructors) {
//			System.out.println(con.getModifiers());
//		}
	}

	private static void f4() {
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.\\w+";
		String data ="연락처1: lll5090@@naver.com 연락처2: sol.tolbo@gmail.com 연락처3: aaaa@naver.com";
		Pattern pattern = Pattern.compile(p1); //패턴을 템플릿화 함
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		}
		
	}

	private static void f3() {
		String p1 = "010-([0-9]{3,4})-\\d{4}";
		String data = "011-5410-9701 이곳으로 연락바람 031-556-5648 혹은 010-8888-7777";
		Pattern pattern = Pattern.compile(p1); //패턴을 템플릿화 함
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
	}

	private static void f2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.\\w+";
		String data ="lll5090@@naver.com";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"NO");
		
	}

	//정규화
	private static void f1() {
		String p1 = "010-[0-9]{3,4}-\\d{4}";
		String data = "011-5410-9701";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"NO");
		
		
	}

}
