package com.shinhan.day04;

public class Duck {
	private String name;
	private int leg;
	private int length;
	
	Duck(){
		
	}
	
	public void fly() {
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}
	
	
	public void sing() {
		System.out.println("오리(" + name + ")는 소리내어 웁니다. .");
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void display() {
		System.out.println("오리의 이름은 ");
	}
	
	@Override
	public String toString() {
		return "Duck [name=" + name + ", leg=" + leg + ", length=" + length + "]";
	}
	
}
