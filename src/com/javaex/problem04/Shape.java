package com.javaex.problem04;

public abstract class Shape {
	int countSides;
	Shape(){}
	Shape(int countSides){}
	abstract double getArea();
	abstract double getPerimeter();
}
