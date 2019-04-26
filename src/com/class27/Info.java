package com.class27;

public class Info {
	String name;
	String mobil;
	Info(String name, String mobil){
	this.name=name;
	this.mobil=mobil;
	
	}
void userDetails() {
	System.out.println("Name is "+this.name);
	System.out.println("Mobil "+this.mobil);
	
}
}
class UserInfo extends Info{
public String address;
	UserInfo(String name, String mobil,String address) {
		super(name, mobil);
		this.address=address;
		
	}
	void userDetails() {
		System.out.println("Name is "+name);
		System.out.println("Mobil "+mobil);
		System.out.println("Address "+address);
		
		
		
	}
	
}
