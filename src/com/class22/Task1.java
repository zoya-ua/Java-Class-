package com.class22;

public class Task1 {
	/*Write a program that will have a constructor: 
	 * one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */
Task1(){
	System.out.println("Constructor with no parameters");
}
Task1(String str){
	System.out.println("Constructor with 1parametr "+str);
}
public static void main(String[] args) {
	Task1 obj=new Task1();
	Task1 obj1=new Task1("Test");
	
}
}
