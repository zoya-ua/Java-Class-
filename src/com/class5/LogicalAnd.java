package com.class5;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
		
		/*Ask user for age
		 * if age is 1-3 -baby
		 * if 3-5 -toddler
		 * if 5-13 -kid
		 * if 13-20 - teenager
		 * if 21-64 -adult
		 * if 64 senior
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age>0 && age<3) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<5){
			System.out.println("You are toddler");		
		}else  if (age>=5 && age<13) {
			System.out.println("You are kid ");
		}else if (age>=13 && age<20) {
			System.out.println("You are teenager");
		}else if (age>=20 && age<65) {
			System.out.println("You are adult");
		}else {
			System.out.println("You are senior");
		}
				;
	}

}
