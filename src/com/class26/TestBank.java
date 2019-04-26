package com.class26;

public class TestBank {
	public static void main(String[] args) {
		Bank bank;
		bank=new BankA();
		System.out.println(bank.getBalance());
		bank=new BankB();
		System.out.println(bank.getBalance());
		bank=new BankC();
		System.out.println(bank.getBalance());
	}

}
