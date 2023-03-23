package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day05.Account;

public class CollectionTest1 {

	public static void main(String[] args) throws IOException {
		f9();

	}

	private static void f9() throws IOException {
		Properties pro = new Properties(); //map의 자식이다. 
		//InputStream fis = new FileInputStream("src/com/shinhan/day10/oracleInfo.properties"); //파일을 찾아서 열어라
		//pro.load(fis);
		InputStream is = CollectionTest1.class.getResourceAsStream("oracleInfo.properties");
		pro.load(is);
		//pro.load(CollectionTest1.class.getResourceAsStream("oracleInfo.properties")); //현재 클래스를 기준으로 한바이트씩 읽어옴
		String driver = pro.getProperty("myname");
		System.out.println(driver);
		
		for(Object key: pro.keySet()) {
			String value = pro.getProperty((String) key);
			System.out.println(key + "---" + value);
		}
	}

	private static void f8() {
		//key는 set이다
		//set은 add시에 동등객체인지 확인. 동등하면 add불가
		//map은 put() 시에 key를 찾는다. 동등한 것을 찾으면 값을 replace한다. 
		HashMap<Employee,Account> data = new HashMap<Employee,Account>();
		data.put(new Employee("이솔1", "대리", 1000), new Account("1111", "이솔1", 1000));
		data.put(new Employee("이솔1", "대리", 300), new Account("2222", "이솔2", 2000));
		data.put(new Employee("이솔1", "대리", 7000), new Account("3333", "이솔1", 3000)); //마지막 것으로 들어간다. 
		data.put(new Employee("이솔3", "대리", 8000), new Account("4444", "이솔3", 4000));
		data.put(new Employee("이솔4", "대리", 9000), new Account("5555", "이솔4", 5000));

		for(Employee emp:data.keySet()) {
			System.out.println("key: " + emp); //println에서 object의 toString이 출력되는 것이다.  toString 재정의한다. 
			System.out.println("value: " + data.get(emp));
			System.out.println("=================================");
		}
		
		System.out.println("key를 찾기~");
		System.out.println(data.containsKey(new Employee("이솔1", "대리", 1000)));
		System.out.println("value를 찾기~");
	}

	private static void f7() {
		//Map: 키와 값의 쌍이다 (Entry), 키는 set이므로 (중복불가)
		//구현 class: HashMap, HashTable
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		data.put("김", 100);
		data.put("박", 90);
		data.put("정", 95);
		data.put("양", 50);
		data.put("김", 200); //key가 같으면 replace된다. 
		
		System.out.println("키가 중복되면 마지막 값 유효: " + data.get("김"));
		
		//1. 일반 for --- 불가 --> index가 없으니깐
		//2. 향상 for
		//entry --> 1건을 의미 / entrySet은 여러건을 의미 
		int sum = 0;
		for(Entry<String,Integer> entry:data.entrySet()) {
			System.out.println(entry.getKey() + "==>" + entry.getValue());
			sum += entry.getValue();
		}
		
		System.out.println("총점은 " + sum);
		
		sum = 0;
		//keyset(): 키들을 의미 / 키의 집합
		for(String key:data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
			sum += data.get(key);
		}
		System.out.println("keySet의 총점은: " + sum);

		//Iterator 이용
		Iterator<String> it = data.keySet().iterator();
		while(it.hasNext()) {
			//System.out.println(it.next()); //다음 data 읽기
			String key = it.next();
			System.out.println(key);
			System.out.println(data.get(key));
			//System.out.println(data.get(it.next()));
		}
		
		System.out.println("키 찾기: " + data.containsKey("김"));
		System.out.println("키 찾기: " + data.containsKey("김2"));
		System.out.println("");
		
		System.out.println("값 찾기: " + data.containsValue(200));
		System.out.println("값 찾기: " + data.containsValue(500));
		
		
	}

	private static void f6() {
		// Set interface => 구현 class: HashSet, TreeSet
		// 순서없고 중복 불가(단, Tree는 순서있음)
		Set<Account> data = new HashSet<>();
		data.add(new Account("12345","이솔1",100000));
		data.add(new Account("12345","이솔2",200000));
		data.add(new Account("12333","이솔3",300000));
		data.add(new Account("12444","이솔4",400000));
		data.add(new Account("12555","이솔5",500000));

		// 1. 일반 for --> 불가(순서가 없기 때문에 불가능하다)
		// 2. 향상 for (내부반복자)
		for (Account week : data) {
			System.out.println(week); // 내가 생각한 순서가 아니다. // 그리고 중복이 제거됨.
		}
		// 3. iterator (내부 반복자)
		Iterator<Account> it = data.iterator(); // 자료구조를 하나 더 만드는 것이다.
		// System.out.println(it.next()); // 데이터가 중복이 제거 된 내용이 담긴다. //길이보다 넘게 출력하면 오류남
		// -> Runtime Error
		// 그래서 반드시 다음 데이터가 존재하는지 확인하고 읽어와야 한다.
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//원하는 객체 찾기 -> 주소는 당연히 다름. 주소를 비교가 아니라 동등비교를 하는 것이다. 반드시 hash 코드랑 equals가 재정의 되어있어야 함. 
		Account searchData = new Account("12333","이솔3",300000);
		boolean result = data.contains(searchData);
		System.out.println(result?"찾음":"못찾음");
	}

	private static void f5() {
		// Set interface => 구현 class: HashSet, TreeSet
		// 순서없고 중복 불가(단, Tree는 순서있음)
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("수요일");
		data.add("금요일");

		// 1. 일반 for --> 불가(순서가 없기 때문에 불가능하다)
		// 2. 향상 for (내부반복자)
		for (String week : data) {
			System.out.println(week); // 내가 생각한 순서가 아니다. // 그리고 중복이 제거됨.
		}
		// 3. iterator (내부 반복자)
		Iterator<String> it = data.iterator(); // 자료구조를 하나 더 만드는 것이다.
		// System.out.println(it.next()); // 데이터가 중복이 제거 된 내용이 담긴다. //길이보다 넘게 출력하면 오류남
		// -> Runtime Error
		// 그래서 반드시 다음 데이터가 존재하는지 확인하고 읽어와야 한다.
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void f4() {
		// ArrayList 는 중간의 data를 삽입하거나 삭제 시 앞으로 당기는 것 때문에 느리다.
		List<Account> data = new ArrayList<>(); // 기본으로는 10개만들어짐
		long start = System.nanoTime();

		// add
		for (int i = 1; i <= 100000; i++) {
			data.add(new Account(i + "", "홍" + i, 100));
		}

		// remove
		for (int i = 100; i < 200; i++) {
			data.remove(0);
		}

		// 다시 add
		for (int i = 100; i < 200; i++) {
			data.add(i, new Account(i + "", "park" + i, 500));
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(end - start));
	}

	// Vector는 멀티쓰레드에 안정적이다... 동기화가 된다.
	private static void f3() {
		List<Account> data = new ArrayList<>(); // 기본으로는 10개만들어짐
		long start = System.nanoTime();

		// 2000건을 add하고자 함. --> 두개의 흐름으로 각자 1000건씩 넣고자 한다.
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 100000; i++) {
					data.add(new Account(i + "", "홍" + i, 100));
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1001; i <= 200000; i++) {
					data.add(new Account(i + "", "박" + i, 100));
				}
			}
		};

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(data.size() + "건이 저장되었습니다.... ");

		for (int i = 0; i < 100; i++) {
			data.remove(0);
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(end - start));

		// 결과: 멀티 쓰레드 상황에서는 vector가 안정적이다. --> arraylist는 안정적이지 않음 멀티스레딩상황에서
	}

	private static void f2() {

		List<String> data = new ArrayList<String>();
		data.add("자바");
		String s = data.get(0); // 형변환이 필요가 없다.
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
		System.out.println(data.size() + "개");

		// 1. 일반 for
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번째: " + data.get(i));
		}

		System.out.println("======================향상 for");

		// 향상 for
		for (String str : data) {
			System.out.println(str);
		}

		System.out.println("======================iterator");

		// iterator 이용
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	private static void f1() {
		// List interface를 이용해서 만든 구현 class: ArrayList,LinkedList, Vector
		// 제네릭스를 사용하지 않는건 바람직하지 않다.
		List data = new ArrayList();
		data.add(100);
		data.add("자바");
		data.add(new Account("1234", "홍", 500000));
		// data 가져올 때
		// 형변환은 잘못될 가능성이 높다. 형변환을 잘못 할 수 도 있으니깐... 바람직 하지 않음. --> <> 제네릭 사용한다.
		int a = (Integer) data.get(0); // 무조건 Object로 받기 때문에 형변환 일어남
		String s = (String) data.get(1);
		Account acc = (Account) data.get(2); // 오류날 가능성이 많다. 잘못될 형변환
	}

}
