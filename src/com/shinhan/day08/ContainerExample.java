package com.shinhan.day08;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();

		Container<Money> container3 = new Container<>();
		f3();
		f2();
		f4();
	}
	

	
	private static void f4() {
		Container<String> container1 = containerFactory("Book");
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = containerFactory(100);
		container2.set(6);
		int value = container2.get();

		Container<Money> container3 = new Container<>();
		
	}



	private static void f2() {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();

		Container<Money> container3 = new Container<>();
	
	}



	private static void f3() {
		Container2<String,Integer> container1 = makeContainer("aa",100);
		//container1.set("홍",100);
		
		System.out.println("key=" + container1.getKey());
		System.out.println("value= " + container1.getKey());

		Container2<String,Money> con2 = makeContainer("홍",new Money(100));
		//con2.set("홍", null);
		
		System.out.println("key= " + con2.getKey());
		System.out.println("value= " + con2.getValue());
	}
	
	private static <K,V> Container2<K,V> makeContainer(K key, V value) {
		return new Container2<K,V>(key,value);
		
	}
	
	private static <T> Container<T> containerFactory(T data) {
		return new Container<T>(data);
		
	}
	
	
	

}


