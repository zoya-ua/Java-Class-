package com.class6;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		char grade;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Good job!");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
		    System.out.println("Bad");
		   break;
		default:
			System.out.println("Not acceptable");
		
		}
		
	}

}
