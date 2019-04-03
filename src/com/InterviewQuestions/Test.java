package com.InterviewQuestions;

import java.util.Scanner; 


public class Test {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
        Scanner  scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int notPrime = 0;
        
        for (int i=2; i<a; i++) {
            if (a%i == 0) {
                notPrime = 1;
                break;
            }
        }
        
        if (notPrime == 1) {
            System.out.println("Number is NOT prime");
        }else {
            System.out.println("Number is prime");
        }

	}
}
