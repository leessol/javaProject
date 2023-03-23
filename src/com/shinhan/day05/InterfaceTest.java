package com.shinhan.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

	public static void main(String[] args) {
		f5();

	}
	
	//collection 예제
	private static void f5() {
		String [] arr = new String[] {"자바","SQL","WEB","Spring"};
		//List, Set, Map
		//List interface: 순서있고, 중복 허용 
		//ArrayList, Vector, LinkedList => 리스트의 특징을 가지고 있다. 
		//-> 위의 세개는 List interface를 참고한다. 
		//List 로 통일하면 유지보수가 최소화 된다. 
		//Set: 순서가 없고, 중복 허용 안함. -> 주로 key로 사용함
		List<String> data = new LinkedList<String>(); //이렇게 가변성질을 가지고 있는 타입에 제한적으로 <> 제네릭으로 제한한다. 
		//data.add(10); error
		data.add("자바"); //배열을 데이터 타입이 반드시 하나만 된다. 
		data.add("SQL"); //배열을 데이터 타입이 반드시 하나만 된다. 
		data.add("WEB"); //배열을 데이터 타입이 반드시 하나만 된다. 		
		data.add("자바"); //배열을 데이터 타입이 반드시 하나만 된다. 
		//알아서 길이를 늘려준다. 가변적으로 ,,, 
		// 중복도 허용해줌.
		print(data);
	}
	
	static void print(List<String> data) {
		for (String s :data) {
			System.out.println(s);
		}
	}

	//interface 예제
	private static void f3() {
		f4(new Television());
		f4(new Audio());
	}

	//자동 형변환 + override ==> 다형성 
	//사용법은 같고 결과는 다양하다. 
	private static void f4(RemoteControl remote) {
		remote.powerOn();
		remote.powerOff();	
		remote.display(); // 한방에 다 추가 하고 싶으면 interface로 간다. 
		//remote.display2(); //static 호출 -> 객체 생성 불가
		RemoteControl.display2(); //-> 이렇게 해야함
		
		if(remote instanceof Audio audio) {
			audio.display2();
			audio.wifiTurnOn();
		}
		
		if (remote instanceof WIFI wf) {
			wf.wifiTurnOn();
		}
	}

	private static void f2() {
		String s1 = "Z";
		String s2 = "A";
		System.out.println(s1.compareTo(s2));
		
	}

	private static void f1() {
		// 1. 객체 생성
		OracleDB db = new OracleDB();
		SybaseDB db2 = new SybaseDB();
		// OracleDB class를 사용해보고 
		use(db);
		// SybaseDB class를 사용해보자. 
		
	}

	private static void use(JDBCInterface db) {
		// TODO Auto-generated method stub
		db.dbConnect("데이터베이스!!!");
		
	}

}
