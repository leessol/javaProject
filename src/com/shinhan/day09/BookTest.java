package com.shinhan.day09;

class Box{}


public class BookTest {

	public static void main(String[] args) {
		Book<String> b1 = new Book<String>("이것이 자바다",30000,"퍼스트존",new String[] {"신용권","임경규"}); 
		Book<Integer> b2 = new Book<>(999,35000,"퍼스트존",new String[] {"신용권","임경규"});
		Book<Box> b3 = new Book<>(new Box(),37000,"퍼스트존",new String[] {"신용권","임경규"});
		Book<String> b4 = Book.makeBook("이것이 자바다",40000);
		Book<Box> b5 = Book.makeBook(new Box(),60000);
		Book<String> b6 = new Book<String>("이것이 자바다",30000,"퍼스트존",new String[] {"신용권","임경규"}); 
		
		int result = b1.compareTo(b4);
		System.out.println(result);
		
		System.out.println(b1.equals(b6));
		System.out.println(Book.getCount() + "권");
	}

}
