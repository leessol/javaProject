package com.shinhan.day08;



public class Util<K,V> {

	//chidpair클래스에서 extends pair을 하기 때문에 pair로만 해도 자식것도 출력이 됨. 
	public static <K,V> V getValue(Pair<K, V> pair, String key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		} 
		return null;
	}
	
	
	
	public static <P extends Pair<K,V>,K,V> V getValue2(P pair, String key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		} 
		return null;
	}
	
	
	
}
