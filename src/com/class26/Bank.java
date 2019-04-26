package com.class26;

public class Bank {
	int balance;
	int getBalance(){
		
		return balance;
	}
}
class BankA extends Bank{
int getBalance(){
		balance=1000;
		return balance;
	}
}
class BankB extends Bank{
int getBalance(){
		balance=2000;
		return balance;
	}
}
class BankC extends Bank{
int getBalance(){
		balance=3000;
		return balance;
	}
}