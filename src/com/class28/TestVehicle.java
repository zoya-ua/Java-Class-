package com.class28;

public class TestVehicle {
	public static void main(String[] args) {
		Car car;
		car=new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		car=new Tayota("tayota");
		car.drive();
		car.start();
		car.stop();
		System.out.println(Vehicle.vehicleCount);
	}

}
