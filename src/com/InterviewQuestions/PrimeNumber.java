package com.InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number to check if it's prime?");
		int n=in.nextInt();
		for (int i=2;i<n;i++ ) {
			if (n%i==0) {
				count++;	
	        }
	   }
	if (count==0 && n>1) {
		System.out.println("Number is prime.");
	}else {
		System.out.println("Number is not prime.");
	}
	
	
	boolean prime =true;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			
		}else {
			prime=false;
			break;	
		}
	}
		System.out.println(prime);	
	
	}

}
