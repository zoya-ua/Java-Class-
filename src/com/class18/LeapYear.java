package com.class18;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		/*Ask a user to input a leap year. 
		 * Give the user 10 chances to enter a correct leap year. 
		 * As soon as the user enters the correct leap year exit the loop.
		
		*/
		int year, i;
		Scanner scan;
		scan=new Scanner(System.in);
		
		for (i=0;i<10;i++) {
			
		
		System.out.println("Please enter leap year, you have 10 attempts");
		year=scan.nextInt();
		if (year%4==0) {
			System.out.println(year+" -leap year!");
			break;
		}else {
			continue;
		}
		
		}
	}

}
