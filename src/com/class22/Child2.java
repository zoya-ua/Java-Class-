package com.class22;

public class Child2 extends Parent{
	String height="5.4" ;
	public static void main(String[] args) {
		Child2 obj= new Child2();
		System.out.println("Child2 eyecolor "+obj.eyeColor);
		System.out.println("Child2 hairColor "+obj.hairColor);
		System.out.println("Child2 nose "+obj.nose);
		System.out.println("Child2 height "+obj.height);
		obj.sing();
		

	}

	
}
