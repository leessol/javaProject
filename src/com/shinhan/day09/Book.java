package com.shinhan.day09;

import java.util.Arrays;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"title","price"}) //동등비교: 기본은 주소 / 재정의를 하는 것이다: 이렇게 of 뒤에 설정 안해주면 다 같아야 같다는 의미 
public class Book <T>extends Object implements Comparable<Book>{ //implements comparable: 비교하는 인터페이스 구현. 그냥 comparable은 object와 비교를 한다. 
	//generic를 써야 형변환을 안할수 이싿. 
	private T title;
	private int price;
	private String publisher;
	private String[] author;
	private static int count;
	private static final String COMPANY="신한출판사"; //상수니깐 관례로 대문자를 사용한다. 
	
	//앞의 <T>는 제네릭을 사용하겠다고 일종의 선언 같은 의미 
	public static <T> Book<T>  makeBook(T title, int price) {
		return new Book<>(title,price,"홍대출판사",new String[] {"김경윤","양유진"}); // @NoArgsConstructor 때문에 가능하다. 
		
	}
	

	public Book(T title, int price, String publisher, String[] author) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.author = author;
		count++;
	}
	
	
	//접근제한자가 전부 private이니깐 getter/setter 이용해야한다. 
	/*
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String[] getAuthor() {
		return author;
	}
	
	public void setAuthor(String[] author) {
		this.author = author;
	}
	
	
	
	public static void setCount(int count) {
		Book.count = count;
	}
	
	public static String getCompany() {
		return COMPANY;
	}
	*/
	

	/* 개발자가 데이터가 잘 들어가있는지 확인하고 싶을때 
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", publisher=" + publisher + ", author="
				+ Arrays.toString(author) + "]";
	}
	*/
	
	
	/*
	//equals 동일하다라는 기준을 내가 커스텀 하는것 : hashcode equals --> 예를들면 price가 같으면 같은 책이야 이런식으로 사용자 정의하고 싶을때
	//equals는 기본적으로 주소를 비교한다. 내가 정의하고 싶으면 재정의하면 된다. 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(author);
		result = prime * result + Objects.hash(price, publisher, title);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Arrays.equals(author, other.author) && price == other.price && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title);
	}
	*/
	
	
	
	@Override
	public int compareTo(Book obj) {
		return price - obj.price;
	}

	//책 권수 
	public static int getCount() {
		return count;
	}


	
	
}
