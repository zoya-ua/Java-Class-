package com.class24;

public class Test1 {
	public static void main(String[] args) {
	
	Programming obj =new Programming();
	Programming obj1 =new Programming("Java");
	Programming obj2 =new Programming('C');
	
	System.out.println("Employee-FullTimeEmployee-Controctor");
	Employee emp =new Employee();
	
	FullTimeEmployee ft=new FullTimeEmployee();
	Contractor cont=new Contractor();
	emp.getPaid();
	ft.getPaid();
	cont.getPaid();
	}
}
