package com.class22;

public class Child extends Parent{

	String hairType="curly";
	
	public static void main(String[] args) {
		
		Child childObject=new Child();
		System.out.println("Child 1 eye color "+childObject.eyeColor);
		System.out.println("Child 1 hair color "+childObject.hairColor);
		System.out.println("Child 1 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.playTennis();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		
	}
	
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}
}

