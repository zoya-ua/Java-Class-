package com.class7;

import java.util.Scanner;

public class Soda {
	/*Ask user to pay for a soda
     *keep asking user to pay for soda until entered price is not equal to 1.99
     *after user got a write amount print "Please enjoy your soda"*/
	public static void main(String[] args) {
		Scanner scan;
		double price=0;
		scan=new Scanner(System.in);
		
		while (price!=1.99) {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
		}
		System.out.println("Please enjoy your soda ");
		
		 
	}

}
