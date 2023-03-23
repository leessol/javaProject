package com.shinhan.day07;

import java.util.Objects;

//VO(Value Object)
public class ProductVO {
	private String name;
	private int price;
	private String maker;

	public ProductVO(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maker, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 같은지
			return true;
		if (obj == null) //null넣으면 무조건 false
			return false;
		if (getClass() != obj.getClass())//타입이 같은지 
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(maker, other.maker) && 
				Objects.equals(name, other.name) && 
				price == other.price; //기본 타입은 그냥 ==으로 비교한다. 
	}
	
	
}

















