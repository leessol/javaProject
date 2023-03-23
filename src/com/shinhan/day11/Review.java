package com.shinhan.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		List<Integer> data1 = new ArrayList<>();
		Set<Integer> data2 = new HashSet<>();
		Map<String,Integer> data3 = new HashMap<>();
		data1.add(100);
		data2.add(200);
		data3.put("aa", 300);
		
		System.out.println(data1.get(0)); //순서가 있음, index 사용
		//System.out.println(data2.); //순서가 없음. index 사용불가 -> 반복문 아니면 iterator사용
		for(Integer a:data2) {
			System.out.println(a);
		}
		Iterator<Integer> it = data2.iterator(); //it는 내부반복자를 생성한 그 주소가 들어있음
		System.out.println(it.next());
		System.out.println(it.hasNext()?it.next():"not found");
		
		//Map은 키가 있으면 값을 읽을 수 있다. 
		int value = data3.get("aa");
		System.out.println(value);
		
		//키를 모르는 상황이면, 키를 다 가져옴 
		Set<String> keys = data3.keySet(); //--> key는 set이다. 
		
		for(String s:keys) {
			System.out.println(s);//key
			int val = data3.get(s); //value
			System.out.println(val);
		}
		
		//key와 value가 같이 있는 한건을 가져와라. entry형태로 -> 엔트리들은(다수) set형태로 되어있다. 
		Set<Entry<String,Integer>> entries= data3.entrySet();
		for(Entry<String, Integer> et :entries) {
			System.out.println(et.getKey() + et.getValue());
		}
		
		//iterator
		Iterator<Entry<String,Integer>> it2 = entries.iterator();
		while(it2.hasNext()) {
			Entry<String,Integer> ent = it2.next();
			System.out.println(ent.getKey() + ent.getValue());
		}
	}

	private static void f1() {
		//Collection: List(순서있고, 중복가능), Set(순서없고 중복불가)
		//Map
		//List 구현클래스: ArrayList, LinkedList, vector
		//Set 구현클래스: HashSet(중복check: equals(), hashcode()), 
		// data 추가 시 순서를 정해짐(크기비교 compareTo()) TreeSet
		//Map 구현클래스: HashMap, TreeMap, Properties
		//--> 키와 값의 쌍이다. / Entry: (Key(Set이다--> 중복체크함./ equals와 hashcode 재정의 되어있다. ), Value)
 	}

}










