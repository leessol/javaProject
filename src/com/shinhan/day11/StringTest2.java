package com.shinhan.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StringTest2 {

	public static void main(String[] args) {
		//List<Student> data = new ArrayList<>(); //하나씩 add해야됨 불편함
		List<Student> data = Arrays.asList(
				new Student("홍1",100),
				new Student("홍4",20),
				new Student("홍5",500),
				new Student("홍3",60),
				new Student("홍2",70)
				);
		//data.forEach(st->System.out.println(st));//굳이 string으로 안바꿔도 됨
		//maptoint: 중간 처리 
		//map : 변형한다의 의미 
		//average: 최종처리... 평균구함
		double avg = data.stream().mapToInt(st -> st.getScore()).average().getAsDouble(); 
		System.out.println(avg);
	
		
		//OptionalDouble: 안에 값이 없으면 오류날 수도 있어서 없는 것을 대비해서 만들어놓은 타입이다. 
		OptionalDouble opavg = data.stream().mapToInt(st -> st.getScore()).average();
		opavg.ifPresentOrElse(a->{
			System.out.println("평균: " + a);
		}, ()->{
			System.out.println("평균계산할 수 없음");
		}); //값이 있음 없음 따짐
	}
	

}
