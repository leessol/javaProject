package com.shinhan.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTEst {

	public static void main(String[] args) {
		f6();

	}

	private static void f6() {
		Account [] arr = {
				new Account("1234","김1"),
				new Account("2222","김2"),
				new Account("3333","김3")
		};
		List<Account> data = Arrays.asList(arr); 
		//parallel 병렬적으로도 가능하다. 
		data.parallelStream().forEach(acc->{
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName());
			System.out.println("!!!!!!!!!!!!");
		});
		data.forEach(acc->System.out.println(acc)); 
	
	}

	//set 도 가능
	private static void f5() {
		Set<Account> data1 = new HashSet<>();
		data1.add(new Account("1234","김1"));
		data1.add(new Account("2222","김1"));
		data1.add(new Account("3333","김1"));
				
		data1.stream().forEach(acc->System.out.println(acc)); //변형 가능. 
		//굳이 stream을 사용하지 않아도 바로 foreach를 사용할 수 있다. 
		data1.forEach(acc->System.out.println(acc)); //단순히 내부 반복자 돌림
	}
	
	private static void f4() {
		Account [] arr = {
				new Account("1234","김1"),
				new Account("2222","김2"),
				new Account("3333","김3")
		};
		List<Account> data = Arrays.asList(arr); //대신 수정이 불가능하다. //array를 list로 바꿈
		data.stream().forEach(acc->System.out.println(acc)); //변형 가능. 
		//굳이 stream을 사용하지 않아도 바로 foreach를 사용할 수 있다. 
		data.forEach(acc->System.out.println(acc)); //단순히 내부 반복자 돌림
		
		
	}

	private static void f3() {
		Account [] arr = {
				new Account("1234","김1"),
				new Account("2222","김2"),
				new Account("3333","김3")
		};
		
		Arrays.stream(arr).forEach(acc->System.out.println(acc));

	}

	private static void f2() {
		// 배열
		String[] arr1 = { "자바", "웹", "front", "framework" };
		// 1. 내부 반복자를 이용하고자 한다면, 먼저 stream을 얻는다.
		Stream<String> st = Arrays.stream(arr1); // stream얻음
		// 2. 내부반복자로 값을 처리한다.
		Consumer<String> consumerF = (s) -> {
			System.out.println(s + "*****");
		};
		st.forEach(consumerF);

		Arrays.stream(arr1).forEach((s) -> {
			System.out.println(s + "@@@@");
		});
	}

	private static void f1() {
		// 1. 배열
		int[] arr1 = new int[] { 100, 30, 70, 20, 50 };
		// 내부반복자 : 내 배열이 stream으로 들어가면 알아서 처리한다. foreach가 stream안에 있는 for문
		Arrays.stream(arr1).forEach(a -> System.out.println(a)); // 오리지널 스트림
		// original stream
		IntStream is = Arrays.stream(arr1);
		// IntConsumer: int를 받고 소비만 한다.
		IntConsumer func1 = (a) -> {
			System.out.println("a: " + a);
		}; // a가 한개씩 들어간다.
		is.forEach(func1);

	}

}
