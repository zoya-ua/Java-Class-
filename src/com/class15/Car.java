package com.class15;

public class Car {
	
	String make,model,color;
	int door,wheels;
	
	public static void main(String[] args) {
	
//ClassName variableName =new ClassName();
		//!st object
		Car  car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		//define behavior
		car1.drive();
		car1.reverse();
		car1.stop();
		System.out.println("My car is "+car1.color+" "+car1.make);
		System.out.println(" ----------- Second object ------------");
		//2nd object
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4	;	
		car2.wheels=4;
		car2.drive();
		car2.reverse();
		car2.stop();
		//My car is Blue Tesla
		System.out.println("My car is "+car2.color+" "+car2.make);
	}
	
void drive() {
	System.out.println("Car can drive");
	
}
void reverse() {
	System.out.println("Car can reverse");
}
void stop() {
	System.out.println("Car can stop");
}

}
