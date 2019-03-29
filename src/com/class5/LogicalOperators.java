package com.class5;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		//if number 1-10 - number is small
		//if number 11-100 - number is medium
		//if number 101-1000 - number is large
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num>0 && num<=10) {
			System.out.println("Number is small");
			
		}else if (num>10 && num<101) {
		System.out.println("Number is medium");	
		
		}else if(num>100 && num<=1000) {
			System.out.println("Number is large");
		
		}	else {
			System.out.println("Numbe is out of the range");
		}
		
	}

}
