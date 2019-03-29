package com.JavaReview;

import java.util.Scanner;

public class DoWhileSum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1,num2,sum;
		boolean answer;
		
		do {
			System.out.println("Enter two numbers that you want to add");
			num1=scan.nextInt();
			num2=scan.nextInt();
			sum=num1+num2;	
			System.out.println(sum);
			System.out.println("Do you want to do it again? true or false?");
			answer=scan.nextBoolean();
			
		} while(answer==true);
		System.out.println("Good Buy!");
	}

}
