package com.class29;

public interface Shape {
public void calculateArea();
public void calculatePerimeter();

}
class Circle implements Shape{
	double r=4.5;
	@Override
	public void calculateArea() {
		
		double A=3.14*r*r;  
		System.out.println("Area of circle "+A);
	}

	@Override
	public void calculatePerimeter() {
	double C =2*3.14*r;	
	System.out.println("Perimeter of a circle "+C);
	} 	
}
class Square implements Shape{
	double a=8.2;
	@Override
	public void calculateArea() {
		double A=a*a;
		System.out.println("Area of Square "+A);	
		
	}

	@Override
	public void calculatePerimeter() {	
	double P=4*a;	
	System.out.println("Perimeter of Square "+P);
	}
	
}