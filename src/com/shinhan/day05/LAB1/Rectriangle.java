package com.shinhan.day05.LAB1;

public class Rectriangle extends Shape implements Resizable{
	
	int width;
	int height;
	
	Rectriangle(int width, int heigth) {
		super(3);
		this.width = width;
		this.height = heigth;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		//width*width + height*height
		return width + height + Math.sqrt(width*width + height*height);
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		
	}

}
