package com.class9;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int s,e,i;
		int sum1=0;
		int sum2=0;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter start and end point");
		s=scan.nextInt();
		e=scan.nextInt();
		
		
	for (i=s;i<=e;i++) {
		if (i%2==0) {
			sum1=sum1+i;
		
		}else {
			sum2=sum2+i;
		}
	}
	System.out.println("Sum of even numbers = "+sum1);	
	System.out.println("Sum of odd numbers = "+sum2);
		
	}

}
