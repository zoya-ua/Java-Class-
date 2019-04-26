package com.class28;

public abstract class Vehicle {
	static int vehicleCount;
	Vehicle(){
		vehicleCount++;
	}
public abstract void start();
public abstract void drive();
public void stop() {
	System.out.println("Stop vehecle by pressing break");
}
}
abstract class Car extends Vehicle{
	
	String make;//instance variables allowed in abstract class
	//we cannot create an Object of an abstract class
	//inside class we need someone to initialize
	Car(String make){
		this.make=make;
	}
	
}
class BMW extends Car{
	//by default compiler will create default constractor and by defafoult parent constructor will be called in chiled class
		//BMW(){
		//super();-added by default

	BMW(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
	
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
				
	}
	
}
class Tayota extends Car{

	Tayota(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Tayota starts with push-button");
		
	}

	@Override
	public void drive() {
		System.out.println("Tayota drives safe");
		
	}
	
}
