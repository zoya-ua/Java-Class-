package com.class26;

public class Phone {
public void makeCall() {
	System.out.println("Can make a phone call");
}
public void hasCamera() {
	System.out.println("Phone has a camera");
}
}
class iPhone extends Phone{
	
public void makeCall() {
	System.out.println("Can make a face time call");
}
public void hasCamera() {
	System.out.println("Iphone has dual Hd camera");
}
}
class Nokia extends Phone{
	public void cannotBreak() {
		System.out.println("Nokia phones unbrakable");
	}
}
class Samsung extends Phone
{
	public void hasCamera() {
		System.out.println("Samsung has 3 lenses");
	}	
}

