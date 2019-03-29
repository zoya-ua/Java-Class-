package com.class4;

public class NestedIf {
	// write a program to check work eligibility
	// 16and older, ig usr <64 work, older 64 - enjoy retirement

	public static void main(String[] args) {
		int age = 66;
		int eligibleAge = 16;
		int retirementAge = 65;
		if (age < eligibleAge) {
			System.out.println("You are to young to work!");

		} else {
			System.out.println("You are eligible to work");
			if (age <= retirementAge) {
				System.out.println("Go work hard!");
			} else {
				System.out.println("You can retire and enjoi your life!");
			}
		}

	}

}
