package com.class29;

public class TestMarks {
	public static void main(String[] args) {
		A obj=new A(75,90,80);
		System.out.println("Percentage of marks obtained in three subjects by student A = "+obj.getPercentage());
		B obj1=new B(75,67,80,100);
		System.out.println("Percentage of marks obtained in four subjects by student B = "+obj1.getPercentage());
	}

}
