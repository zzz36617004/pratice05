package com.javaex.problem04;

public class RectTriangle extends Shape{

	double width = 0;
	double height = 0;

	RectTriangle(double w, double h) {
		width = w;
		height = h;
	}


	public double getArea() {
		return (width * height)/2 ;
	}

	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
