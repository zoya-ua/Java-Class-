package com.class32;

public abstract class Insurance {
	public String insuranceName;
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public abstract void getQuate();
	public abstract void cancellInsurans();
	
}

class Car extends Insurance{
public String carModel;
public Car(String insuranceName,String carModel) {
	super(insuranceName);
	this.carModel=carModel;
	
}
	@Override
	public void getQuate() {
	System.out.println("Get a quate with "+insuranceName+" for "+carModel);
		
	}

	@Override
	public void cancellInsurans() {
		System.out.println("Cancel car insurance");
		
	}
	
}
class Pet extends Insurance{
String petType;
public Pet(String insuranceName, String petType) {
    super(insuranceName);
    this.petType = petType;
}
	@Override
	public void getQuate() {
		System.out.println("Get a quate with "+insuranceName+" for "+petType);
		
	}

	@Override
	public void cancellInsurans() {
		System.out.println("Cancel pet insurance");
		
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuate() {
		System.out.println("Get a quate with "+insuranceName);	
		
	}

	@Override
	public void cancellInsurans() {
		
		System.out.println("Cancel health insurance");	
	}
	
}