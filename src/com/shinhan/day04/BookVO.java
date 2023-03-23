package com.shinhan.day04;

//업무 로직이 전혀 없다. 
//VO (Value Object): data를 저장하는 가방이다. 
//DTO (Data Transfer Object): data를 저장해서 전송하려는 목적이다. 
//JavaBeans 기술에서 사용한다. 
//--> 지켜야 하는 조건: 멤버변수는 private으로 설정 / 멤버 메서드는 public으로 설정한다. 
//JspServlet, Spring, MyBatis framework에서 사용된다. 


//final: 변수(값 수정 불가), 메서드(override불가), 클래스(나를 통해 상속불가)
public class BookVO {
	//instance 변수
	private String title;
	private int price;
	
	//class 변수 --> 언제나 변경 가능. 
	static int count;
	
	//final 변수 수정불가 (instance변수이다) --> 선언 시 또는 생성자에서 초기화 가능. 
	final String isbn = "12345";
	final String isbn2; // 생성자에서라도 넣어야 한다.
	
	//final 변수 수정불가 (instance변수이다) / class --> 얘는 선언 시 초기화 해야한다. 반드시  
	static final String PUBLISHER = "한빛";
	
	BookVO (String title,int price){
		this.title = title;
		this.price = price;
		isbn2 = title + "67894"; //값이 뭐가 들어갔던 상관없다. 초기화만 시작지점에 해주면됨 
		count++;
	}

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
	
	
}
