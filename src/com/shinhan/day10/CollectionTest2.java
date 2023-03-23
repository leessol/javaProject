package com.shinhan.day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import com.shinhan.day04.Employee;
import com.shinhan.day05.Account;

public class CollectionTest2 {

	public static void main(String[] args) {
		f14();
		
		String [] arr = new String[]{"A","B","C"};
		Integer[]arr2 = {100,99,55};
		List<Integer> data2 =Arrays.asList(arr2);
		List<String> data = Arrays.asList(arr);
		
	}

	private static void f14() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("귤1",100));
		data.add(new Fruit("귤2",100));
		data.add(new Fruit("귤3",100));
		data.add(new Fruit("귤4",100));
		data.add(new Fruit("귤5",100));

		Set<Fruit> data2 = Set.copyOf(data);
		data.add(new Fruit("사과",500));
		for(Fruit f:data) {
			System.out.println(f);
		}
		
	}

	private static void f13() {
		Map<String,Integer> data = Map.of("김",100,"양",90,"박",80,"박",90);
		data.put("a", 11);
		for(String key:data.keySet()) {
			System.out.println(key + "===" + data.get(key));
		}
		
		
	}

	private static void f12() {
		// 수정 불가한 collection
		//int[] arr = new int[] { 100, 88, 99, 55, 80 };
		Set<Integer> listData = Set.of(100, 88, 99, 55, 80);
		//List<int[]> listData2 = Arrays.asList(arr);
		listData.add(11);
		for (Integer a : listData) {
			System.out.println(a);
		}

	}

	private static void f11() {
		// 수정 불가한 collection
		// int [] arr = new int[] {100,88,99,55,80};
		List<Integer> listData = List.of(100, 88, 99, 55, 80);
		// List<int[]> listData2 = Arrays.asList(arr);
		for (Integer a : listData) {
			System.out.println(a);
		}

	}

	private static void f10() {
		// Queue (FIFO): 인터페이스이다.

		Queue<Fruit> data = new LinkedList<>();
		data.offer(new Fruit("귤2", 20000));
		data.offer(new Fruit("귤1", 40000));
		data.offer(new Fruit("귤4", 10000));
		data.offer(new Fruit("귤3", 30000));
		data.offer(new Fruit("귤5", 70000));

	}

	private static void f9() {
		Stack<Fruit> data = new Stack<>();
		data.push(new Fruit("귤2", 20000));
		data.push(new Fruit("귤1", 40000));
		data.push(new Fruit("귤4", 10000));
		data.push(new Fruit("귤3", 30000));
		data.push(new Fruit("귤5", 70000));

		while (!data.isEmpty()) {
			Fruit f = data.pop();
			System.out.println(f);
		}
	}

	private static void f8() {
		Map<String, Fruit> data = new TreeMap<>();
		data.put("S", new Fruit("귤", 10000));
		data.put("S", new Fruit("사과", 20000));
		data.put("S", new Fruit("오렌지", 50000));
		data.put("S", new Fruit("귤", 10000));
		data.put("S", new Fruit("귤", 30000));

	}

	private static void f7() {
		Set<Fruit> data = new TreeSet<>();
		data.add(new Fruit("귤", 10000));
		data.add(new Fruit("사과", 20000));
		data.add(new Fruit("수박", 30000));
		data.add(new Fruit("귤", 50000));

		for (Fruit fruit : data) {
			System.out.println(fruit);
		}

	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board(1, "회식", "술마셔도 되나요?", "jin"));
		data.add(new Board(2, "자율학습", "저녁개방", "jin"));
		data.add(new Board(3, "아침", "빨리와~", "jin"));
		data.add(new Board(4, "회식", "술마셔도 되나요?", "jin"));
		data.add(new Board(5, "회식", "술마셔도 되나요?", "jin"));

		for (Board board : data) {
			System.out.println(board);
		}
	}

	private static void f5() {
		// default: key로 sort된다.
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("홍길동2", 88);
		data.put("홍길동1", 50);
		data.put("홍길동5", 100);
		data.put("홍길동3", 99);
		data.put("홍길동3", 22); // 같은 키가 있으면 값을 replace한다.

		for (String key : data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
		}

		System.out.println(data.firstKey() + "==>" + data.get(data.firstKey())); // 첫번째 키

		NavigableMap<String, Integer> data2 = data.descendingMap();
		for (String key : data2.keySet()) {
			System.out.println(key + "====>" + data2.get(key));
		}
	}

	private static void f4() {
		TreeSet<Integer> scoreSet = new TreeSet<>();
		scoreSet.add(100);
		scoreSet.add(20);
		scoreSet.add(50);
		scoreSet.add(80);
		scoreSet.add(80);

		for (Integer score : scoreSet) {
			System.out.println(score);
		}

		System.out.println("first: " + scoreSet.first());
		System.out.println("last: " + scoreSet.last());
		System.out.println("higher: >" + scoreSet.higher(50));
		System.out.println("lower: <" + scoreSet.lower(50));
		System.out.println("ceiling : >= " + scoreSet.ceiling(50));
		System.out.println("floor: <=" + scoreSet.floor(50));

		System.out.println("-================tailSet======================");
		SortedSet<Integer> data = scoreSet.tailSet(50);
		for (Integer i : data) {
			System.out.println(i);
		}

		System.out.println("-==================headSet====================");
		NavigableSet<Integer> data2 = scoreSet.headSet(50, true);
		for (Integer i : data2) {
			System.out.println(i);
		}

	}

	// List: 순서있음, 중복가능 ArrayList, Linkedlist, Vector(MultiThread환경에서 동기화 지원)
	// Set: 순서없음, 중복불가
	// Map: 키와 값의 쌍
	// HashSet: hashcode(), equals()로 동등비교, 동등하면 add불가
	// TreeSet: CompareTo()로 크기 비교
	private static void f3() {
		Set<Employee> data = new TreeSet<>();
		// 비교가 안돼서 오류난다. --> 비교능력이 없으면 비교능력을 준다. implements comparable
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원5", "대리", 2000));
		data.add(new Employee("직원6", "사원", 3000));
		data.add(new Employee("직원3", "사장", 1200));
		for (Employee emp : data) {
			System.out.println(emp);
		}

	}

	private static void f2() {
		Set<Account> data = new TreeSet<>();
		data.add(new Account("123", "홍5", 10000));
		data.add(new Account("124", "홍1", 10000));
		data.add(new Account("126", "홍3", 20000));
		data.add(new Account("125", "홍2", 30000));
		data.add(new Account("123", "홍5", 10000)); // 이미 존재하므로 add안됨

		for (Account str : data) {
			System.out.println(str);
		}

	}

	private static void f1() {
		Set<String> data = new TreeSet<>();
		data.add("1월");
		data.add("2수");
		data.add("3화");
		data.add("4금");
		data.add("5목");
		data.add("5목"); // 같은 값이 있으므로 add되지 않는다.

		for (String str : data) {
			System.out.println(str);
		}
	}

}
