package com.practice;

import java.util.Scanner;

public class SumEvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int l=scan.nextInt();
		int[]arr = new int[l];
		int sum1=0;
		int sum2=0;
		
		for (int i=0;i<l;i++) {
			System.out.println("Enter intiger");
			arr[i]=scan.nextInt();
		}
		
		for (int i=0;i<l;i++) {
			if(arr[i]%2==0) {
			sum1=sum1+arr[i];
			
			}else {
				sum2=sum2+arr[i];
			}
			
		}
		System.out.println("Sum of even numbers = "+sum1);
		System.out.println("Sum of odd numbers = " +sum2);
		
	}

}
