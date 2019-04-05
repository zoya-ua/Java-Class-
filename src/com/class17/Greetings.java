package com.class17;

public class Greetings {
	
public static void main(String[] args) {
	Greetings obj =new Greetings();
	obj.findLargest(20, 10);//calling method FindLargest and passing values of a and b
	obj.findLargest(90, 54);
	obj.helloToInstructor("Asel");
}
void helloToInstructor(String name) {//method with 1 parameter
	System.out.println("Hello "+name);//method body
}
	
	void findLargest(int a,int b) {//method with two parameters
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}

}
