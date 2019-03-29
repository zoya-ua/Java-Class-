package com.class4;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int years, salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many years you work ?");
		years = sc.nextInt();
		
		if (years >= 5) {
			System.out.println("You are geting bonus");
			System.out.println("What is your annual salary?");
			salary = sc.nextInt();
			if (salary >= 50000) {
				System.out.println("Bonus is 5000$");
			} else {
				System.out.println("Bonus is 3000$");

			}

		} else {
			System.out.println("Sorry, you are not getting any bonus!");
		}

	}

}
