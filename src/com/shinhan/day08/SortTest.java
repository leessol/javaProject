package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		Car [] arr = { new Car("B",40), new Car("A",40), new Car("B",50), new Car("B",30),new Car("B",20)};
		//System.out.println("before: " + Arrays.toString(arr));
		print("before",arr);
		
		Arrays.sort(arr); //Comparable 인터페이스를 구현하지 않으면 비교 불가
		print("가격 asc, 모델 desc after",arr);
		
		//익명구현 클래스
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				int result = o1.price - o2.price;
				if(result == 0) { //가격 이름이 같으면 모델이름으로 내림차순 하겠다. 
					o2.model.compareTo(o1.model);
				}
				return result;
			}
			
		}); 
		print("가격 desc, 모델 asc after",arr);
	}

	private static void print(String title, Car[] arr) {
		System.out.println("------------------" + title + " ======================");
		for (Car car:arr) {
			System.out.println(car);
		}
		
	}

	private static void f3() {
		Money [] arr = {new Money(10), new Money(5), new Money(7), new Money(3), new Money(1) };
		System.out.println("before: " + Arrays.toString(arr));
		Arrays.sort(arr); //Comparable 인터페이스를 구현하지 않으면 비교 불가
		//우리가 만든 Money 클래스에는 comparable인터페이스를 구현하고 있지 않아서 오류가 남. 
		//일반 String 클래스는 구현을 하고 있음 이미. 
		//Money 클래스에 제네릭스를 사용해야한다. 
		System.out.println("asc after: " + Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Money>() {

			@Override
			public int compare(Money o1, Money o2) {
				// TODO Auto-generated method stub
				return o2.amount - o1.amount;
			}
			
		}); //comparator 인터페이스를 익명구현
		System.out.println("after: " + Arrays.toString(arr));
		
		
		
	}

	private static void f2() {
		//ASCII code: 'A' => 65 'a'=>97
		String [] arr = {"Spring","java","jsp","servlent","html","css","react"};
		System.out.println("before: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: " + Arrays.toString(arr));
		Arrays.sort(arr,new Comparator<String>() { //일회성 끝나면 버려짐. 굳이 클래스로 만들기 싫어서,, 

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
		System.out.println("desc : " + Arrays.toString(arr));
	}	
	
	private static void f1() {
		Integer [] arr = new Integer []{100,30,80,20,99};
		System.out.println("before: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: " + Arrays.toString(arr));
		Arrays.sort(arr, new DescendingInteger());
		System.out.println("after: " + Arrays.toString(arr));
	}

}


























