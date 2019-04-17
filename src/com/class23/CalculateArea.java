package com.class23;

public class CalculateArea {
	
	public static double ar;
	
	public void area(double l,double w) {
		
		ar=w*l;
		System.out.println("Area of Rectangle = "+ar);
	}
		public  void area (double a) {
			ar=a*a;
			System.out.println("Area of Square = "+ar);
		}
	public void area(int a) {
		
		ar =a*a*a;
		System.out.println("Area of Cube = "+ar);
	}
	public void area(int w, int l,int h)	{
		ar=w*l*h;
		System.out.println("Area of Box = "+ar);
		
	}
		
	

}
