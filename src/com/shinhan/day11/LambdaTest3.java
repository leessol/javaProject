package com.shinhan.day11;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.shinhan.day05.Account;

public class LambdaTest3 {

	public static void main(String[] args) {
		f8();
	}

	
	private static void f8() {
		BiFunction<String, String, Account> func1 = (no,owner)->{
			System.out.println("계좌번호: " + no);
			System.out.println("owner: " + owner);
			return new Account(no,owner);
		};
		
		Account acc = func1.apply("1234", "hong");
		System.out.println(acc);
		
		BiFunction<String, String, Account> func2 = Account::new; //로직은 없고 그냥 실행만 하면 될 때
		Account acc2 = func2.apply("5555","KIN");
		System.out.println(acc2);
				
	}


	private static void f7() {
		//내장 Math 라이브러리 이용
		//BiFunction<Integer, Integer, Integer> func1 = (a,b) -> Math.max(a, b);
		//더 간단하게,,
		BiFunction<Integer, Integer, Integer> func1 = Math::max;
		int result = func1.apply(10, 20);
		System.out.println(result);		
	}
	
	private static void f6() {
		//함수로 만듦.
		BiFunction<Integer, Integer, Integer> func1 = (a,b) -> {
			if (a>b) return a;
			return b;
		};
		int result = func1.apply(10, 20);
		System.out.println(result);		
	}

	private static void f5() {
		Predicate<Integer> func1 = (a) -> a>10;
		System.out.println(func1.test(15));
		
		Predicate<Account> func2 = (a) ->{
			System.out.println("-------잔고 조사하기------");
			System.out.println(a);
			return a.getBalance() >= 100;
		};
		
		System.out.println(func2.test(new Account("1234","jog",1000)));
		
	}

	private static void f4() {
		BinaryOperator<Integer> func1 = (a,b) -> a+b;
		BinaryOperator<Integer> func2 = (a,b) -> a-b;
		System.out.println(func1.apply(1, 2));
		System.out.println(func2.apply(1, 2));
		
	}

	//매개값이 있고 RETURN도 있다.
	//<K,V> => 준건(매개인자) 는 K타입/받은건 (리턴값)은 V타입
	//<K,V,T> => 늘어나도 마지막 것만 리턴값이라고 보면된다. 
	private static void f3() {
		Function<String, Account> func1 = (a) -> new Account(a, null, 100);
		BiFunction<String, String, Account> func2 = (no,owner)->{
			System.out.println("계좌번호: " + no);
			System.out.println("owner: " + owner);
			return new Account(no,owner,100);
		};
		
		Account acc1 = func1.apply("1234");
		Account acc2 = func2.apply("6555", "홍길동");
		System.out.println(acc1);
		System.out.println(acc2);
		
	}

	//Supplier : 준건 없는데 결론적으로는 문자 올거야~ (매개인자는 없고 리턴값만 있음. )
	//준건 없는데 받기만 원한다면 인터페이스를 굳이 만들지 말고 supplier인터페이스가 제공하는 걸 사용해라 
	private static void f2() {
		Supplier<String> a = () -> "자바";
		Supplier<String> b = () -> {
			System.out.println("-----------");
			return "자바2";
		};
		Supplier<Account> c = () -> new Account();
		
		String ret1 = a.get();
		String ret2 = b.get();
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(c.get());
		
		
	}


	//Consumer
	private static void f1() {
		Consumer<Integer> f1 = (a) -> System.out.println(a+200);
		Consumer<String> f2 = (a) -> System.out.println(a+200);
		Consumer<Account> f4 = (a) -> {
			System.out.println(a);
			a.deposit(1000);
			int result = a.withdraw(500);
			System.out.println(result+ "출금완료");
		};
		f1.accept(100);
		f2.accept("100");
		BiConsumer<String, Integer> f3 = (a,b) -> {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		};
		
		f3.accept("java시험", 100);
		f4.accept(new Account("123","jin",1000));
	}

}
