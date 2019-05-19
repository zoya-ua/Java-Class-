package com.ReviewAbstract;

public abstract class StaffPerson {
	String name;
	String address;
	String telNum;
	String vehicleType;
	 abstract String getVehicle(String vehicle);
	 abstract String getName(String name);
     abstract String getAddress(String address);
     abstract String getTelNum(String num);
     
}

class Secretary extends StaffPerson{

	@Override
	String getVehicle(String vehicle) {
		super.vehicleType=vehicle;
		return super.vehicleType;
	}

	@Override
	String getName(String name) {
		super.name=name;
		return super.name;
	}

	@Override
	String getAddress(String address) {
		super.address=address;
		return super.address;
	}

	
	@Override
	String getTelNum(String num) {
		super.telNum=num;
		return super.telNum;
	}

	@Override
	double computeStipend(double compute) {
		return 0;
	}


	
}
class Professor extends StaffPerson{
	
	
	@Override
	String getVehicle(String vehicle) {
		super.vehicleType=vehicle;
		return super.vehicleType;
	}

	@Override
	String getName(String name) {
		super.name=name;
		return super.name;
	}

	@Override
	String getAddress(String address) {
		super.address=address;
		return super.address;
	}

	
	@Override
	String getTelNum(String num) {
		super.telNum=num;
		return super.telNum;
	}

	@Override
	double computeStipend(double compute) {
		return 0;
	}

	}


	