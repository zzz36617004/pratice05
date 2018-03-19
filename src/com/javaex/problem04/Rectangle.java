package com.javaex.problem04;

public class Rectangle extends Shape  implements Resizeable  {
	
	double width=0;
	double height=0;
	Rectangle(double w,double h){
		width=w;
		height=h;
	}

	public void resize(double x){
		
	width=width*x;
	height=height*x;
	}
	public double getArea() {return (width*height);}
	public double getPerimeter() {return (width+height)*2;}
}
