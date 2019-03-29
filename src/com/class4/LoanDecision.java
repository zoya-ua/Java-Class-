package com.class4;

import java.util.Scanner;

public class LoanDecision {

	public static void main(String[] args) {
		int L;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What amount of loan you need?");
		L = sc.nextInt();
		if (L>200000) { 
			System.out.println("Sorry, we cant give you loan!");
		} else {
			System.out.println("You are getting the loan!");
		}
		
		

	}

}
