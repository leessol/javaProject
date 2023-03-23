package com.shinhan.day08;

public class Box {
	
	
	Object kind; //아무 타입이나 올 수 있다. 
	int price;
	
	
	public Box(Object kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	
	
	public Object getKind() {
		return kind;
	}
	public void setKind(Object kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Box [kind=" + kind + ", price=" + price + "]";
	}
	
	
	
	
}
