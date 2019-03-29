package com.practice;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan;
		int a;
		scan=new Scanner(System.in);
		System.out.println("Please enter positive integer");
		a=scan.nextInt();
		for (int i=1;i<=10;i++) {
			int mult=a*i;
			System.out.println(a+" * "+i+"= "+mult);
		}
		
		
		
		
	}

}
