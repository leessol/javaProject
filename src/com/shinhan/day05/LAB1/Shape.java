package com.shinhan.day05.LAB1;

public abstract class Shape {
	int numSides;
	Shape(int numSides){
		this.numSides = numSides;
	}
	int getNumSides(){
		return numSides;
	}
	abstract double getArea(); // 넓이
	abstract double getPerimeter(); // 둘레 길이

}
