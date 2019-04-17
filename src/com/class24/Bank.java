package com.class24;
//perent Class
public class Bank {
	public int chargeInterest() {
		return 0;
	}
}
//child class
class BOA extends Bank{
	@Override //annotation
	public int chargeInterest() {
		return 2;
	}	
}
//2n child class
class PNC extends Bank{
	@Override
	public int chargeInterest() {
		return 3;
	}
}
