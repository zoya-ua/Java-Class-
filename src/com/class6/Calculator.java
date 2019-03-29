package com.class6;

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
	char operator;
	double num1, num2,result = 0;
	Scanner scan;
	
	scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	num1=scan.nextDouble();
	num2 = scan.nextDouble();
	System.out.println("Enter what operation you want to perform(+,-,*,/)");
	
	operator=scan.next().charAt(0);
	
	switch(operator) {
	case '+':
		System.out.println("Performing addition with "+ num1+ " and "+ num2);
		result=num1+num2;
		break;
	case '-':
		System.out.println("Performing subtruction with "+ num1+ " and "+ num2);
		result=num1-num2;
		break;
	case '*':
		System.out.println("Performing multiplication with "+ num1+ " and "+ num2);
		result= num1*num2;
		break;
	case '/':
		System.out.println("Performing division with "+ num1+ " and "+ num2);
		result=num1/num2;
		break;
	default:
		System.out.println("Unknown operation");			
	}
	
	System.out.println("Result is "+ result);
	
}
}
