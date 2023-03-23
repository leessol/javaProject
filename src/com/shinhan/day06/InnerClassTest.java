package com.shinhan.day06;

import com.shinhan.day06.OuterClass.InstanceInnerClass;

public class InnerClassTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		OuterClass.StaticInnerClass v1;
		v1 = new OuterClass.StaticInnerClass();
		System.out.println(v1.s1);
		System.out.println(OuterClass.StaticInnerClass.s2);
		v1.method3();
		OuterClass.StaticInnerClass.method4();
	}

	private static void f2() {
		// 1. inner instance class 사용
		//OuterClass.InstanceInnerClass v1 = new OuterClass().new InstanceInnerClass();
		OuterClass outer = new OuterClass();
		OuterClass.InstanceInnerClass v1 = outer. new InstanceInnerClass();
		System.out.println("instance field: " + outer.a);
		System.out.println("static field: " + OuterClass.b); // static이니깐
		System.out.println("InstanceInnerClass instance field: " + v1.s1);
		System.out.println("InstanceInnerClass static field: " + OuterClass.InstanceInnerClass.s2);
		outer.method1();
		OuterClass.method2();
		
	}

	void f1() {
		//LocalClass는 static 불가 --> 로컬 클래스는 반드시 호출이 되어야만 사용가능하므로 static 애초에 사용 불가. 
		// 1. 일반적인 class 사용
//		class LocalClass{
//			String s3 = "LocalClass임";
//			static String  s4= "LocalClass "
//			System.out.println("instance field: " + v1.a);
//			System.out.println("static field: " + OuterClass.b); // static이니깐
//			v1.method1();
//			OuterClass.method2();
//		}
		
		//LocalClass local = new LocalClass();
	}
	

}
