package com.class22;

public class StaticVsNonStatic {
	public String name="John";//instance variable
	public static String lastName="Show";//static variable
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();//within same class we can call it by using method/variable name
		
	}
	//non static - can access both instance and static variables
public void getInfo() {
	System.out.println("My name is "+name+"and last name is "+lastName);
}
//static method can have an access only to static variables
public static void getInfo1() {
	//System.out.println("My name is "+name+"and last name is "+lastName);
	//we will get an error
	System.out.println("Im static method");
	}
}

