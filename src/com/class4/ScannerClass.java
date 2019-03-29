package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//take an number from a user and print it out
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ener ");
		int num =sc.nextInt();
		System.out.println("Number you entered " +num);
		
		
		//ask user for the name and print Good morning
		Scanner sc2 =new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc2.nextLine();
		System.out.println("Good morning "+name);
	}

}
