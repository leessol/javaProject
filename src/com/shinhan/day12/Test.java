package com.shinhan.day12;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String, String> location = new HashMap<String, String>();
		//location.put("home", "Daejeon");
		location.put("home", "Daejeon");
		location.put("office", "Seoul");

		for( String key :location.keySet()){

		    System.out.println(key + "=>" + location.get(key));

		}
	}
	
	
//	list.add("2"); list.add("3"); list.add("4"); list.add("5");
//
//	for( String str :     list        ){
//
//	      System.out.print(str);
//
//	}
}
