package com.class7;

import java.util.Scanner;

public class Soda2 {
	public static void main(String[] args) {
		Scanner scan;
		double price;
		scan =new Scanner(System.in);
		do {System.out.println("Please pay for soda");
		price =scan.nextDouble();
		
		} while (price!=1.99);
		System.out.println("Please enjoy your soda");
	}

}
