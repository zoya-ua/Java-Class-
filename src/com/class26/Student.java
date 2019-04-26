package com.class26;

public class Student {
	String fullName;
	int age;
	public Student(String fullName,int age) {
		this.fullName=fullName;
		this.age=age;
	}
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age = "+age);
	}
public static void main(String[] args) {
	Student obj=new Student("John Snow ",30);
	obj.displayDetails();
}
}
