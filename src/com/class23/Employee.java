package com.class23;

public class Employee {
	protected static String department="IT";
	
	int salary;
	
	
	public void getPaid() {
		System.out.println("Employee get paid "+ salary);
	}
	
	 public static void work() {
		System.out.println("Work in "+department+" IT department");
	}

}
