package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	public static void main(String[] args) {
		//take 2 numbers from a user and compare those numbers
		
		int num1,num2; 
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 =sc.nextInt();
		System.out.println("Please enter second number");
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is larger then " +num2);
			
		} else if (num2>num1) {
			System.out.println(num1+" is smaller then "+ num2);
		}else {
			System.out.println("Numbers equel");
		}
	}

}
