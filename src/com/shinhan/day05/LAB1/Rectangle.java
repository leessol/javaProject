package com.shinhan.day05.LAB1;

public class Rectangle extends Shape implements Resizable{

	int width;
	int height;
	
	Rectangle(int width, int heigth) {
		super(4);
		this.width = width;
		this.height = heigth;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
