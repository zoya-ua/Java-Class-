package com.practice;

import java.util.Scanner;

public class Loop3 {
	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter positive intiger");
		int num=scan.nextInt();
		
		for (int i=2;i<=num-1;i++) {
			if(num%i==0) {
				count=count+1;	
			}
		}
		if (count>0) {
		System.out.println("This is not a prime number");
		}else {
		System.out.println("This is a prime number");
		}
	}

}

