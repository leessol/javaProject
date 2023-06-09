package com.shinhan.day08;

public class HappyBox<T> {
	
	T kind; //아무 타입이나 올 수 있다. 
	int price;
	
	
	public HappyBox(T kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
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
