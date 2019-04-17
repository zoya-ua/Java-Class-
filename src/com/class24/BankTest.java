package com.class24;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		BOA boa=new BOA();
		PNC pnc =new PNC();
		System.out.println("Bank charges interest "+bank.chargeInterest());
		System.out.println("BOA charges interest "+boa.chargeInterest());
		System.out.println("PNC charges interest "+pnc.chargeInterest());
	}

}
