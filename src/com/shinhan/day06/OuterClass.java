package com.shinhan.day06;

public class OuterClass {
	//1. field (instance field, static field)
	int a = 10;
	static int b = 20;
	//2. 생성자 ... default 제공
	//3. 메소드
	void method1() {
		System.out.println("OuterClass ... instance method");
	}
	
	static void method2() {
		System.out.println("OuterClass ... static method");
	}
	
	//4. block (instance  block{}, static block: static{}
	//5. inner class: 3가지, instance, class, local 
	//class안에 class
	class InstanceInnerClass{
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass static임";
		void method3() {
			System.out.println("InnerClass ... instance method");
			System.out.println("외부의 instance field 접근: " + a); 
			System.out.println("외부의 static field 접근: " + b); // 이미 올라와있어서 static이라 그냥 b라고 하면됨.  
		}
		static void method4() {
			System.out.println("InnerClass ... static method");
			//System.out.println("외부의 instance field 접근불가: " + a);  // 메소드 자체가 static이라서 a는 인스턴스라 호출 불가 new을 해야만 호출이 되는 것이라서. 
			System.out.println("외부의 static field 접근: " + b); // 이미 올라와있어서 static이라 그냥 b라고 하면됨.  
		}
	}
	
	static class StaticInnerClass{
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass static임";
		//System.out.println("외부의 instance field 접근불가: " + a);  // 클래스 자체가 static이라서 a는 인스턴스라 호출 불가 new을 해야만 호출이 되는 것이라서. 
		void method3() {System.out.println("StaticInnerClass ... instance method");}
		static void method4() {
			System.out.println("StaticInnerClass ... static method");
			//static String s2 = "InstanceInnerClass static임";
			//System.out.println("외부의 instance field 접근불가: " + a);  // 메소드 자체가 static이라서 a는 인스턴스라 호출 불가 new을 해야만 호출이 되는 것이라서. 
			//void method3() {System.out.println("StaticInnerClass ... instance method");}
		}
	}
	
	void f1() {
		//함수 안에서만 쓰는 로컬 클래스이다. 
		class LocalClass{
			String s3 = "LocalClass임";
			static String s4 = "LocalClass static임";
			void method3() {System.out.println("LocalClass ... instance method");}
			static void method4() {
				System.out.println("LocalClass ... static method");
			}
		}
	}

}
