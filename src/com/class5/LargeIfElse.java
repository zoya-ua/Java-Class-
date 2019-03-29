package com.class5;

import java.util.Scanner;

public class LargeIfElse {
public static void main(String[] args) {
	double num1,num2,num3;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter 1st number");
	num1 =scan.nextDouble();
	System.out.println("Please enter 2nd number");
	num2 =scan.nextDouble();
	System.out.println("Please enter 3rd number");
	num3 =scan.nextDouble();
	
	if (num1>num2 && num1>num3) {
		System.out.println("The largest num is "+num1);	
	}else if (num2>num1 && num2>num3){
		System.out.println("The largest num is "+num2);		
	}else if (num3>num2 && num3>num1) {
		System.out.println("The largest num is "+num3);	
	}
}
}
