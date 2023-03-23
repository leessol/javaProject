package com.shinhan.day05;

public class Rectangle extends Shape {
	
	double width;
	double height;
	
	public Rectangle(String color, double width, double length) {
		super(color,"Rectangle");
		this.width = width;
		this.height = length;
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

}
