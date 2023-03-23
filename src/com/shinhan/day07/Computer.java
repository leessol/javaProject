package com.shinhan.day07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@:컴파일러가 해석하는 주석
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"maker"})
@RequiredArgsConstructor
public class Computer {
	@NonNull
	private String model;
	private int price;
	private String maker;
	
	
}
