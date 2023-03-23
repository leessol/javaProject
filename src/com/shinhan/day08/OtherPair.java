package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class OtherPair <K,V> {
	private K key;
	private V value;
}
