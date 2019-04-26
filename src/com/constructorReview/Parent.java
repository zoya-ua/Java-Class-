package com.constructorReview;

public class Parent {
	String s;
	int a;
	double b;
	
	Parent(){
		s="Hello";
		a=5;
		b=6.7;
		System.out.println("This is a constructor");
	}
public static void main(String[] args) {
	Parent p=new Parent();
	System.out.println(p.s+" "+p.a+" "+p.b);
}
}
