package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"kind"}) //변수이름. kind가 같으면 같은거야
@Getter
@Setter

public class Product <T,M>{

		T kind; //T 타입이다.
		M model;//M 타입이다.
		
		
}
