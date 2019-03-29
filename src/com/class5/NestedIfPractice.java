package com.class5;


public class NestedIfPractice {
	public static void main(String [] args) {
		/*
		 * check if user has credit card
		 * check what is balance
		 */
		
		boolean creditCard = true;
		int balance = 800;
		if (creditCard) {
			System.out.println("Lets check the balance");
			if(balance>=1000) {
				System.out.println("Pay off now");
			}else  {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("Do you want a credit card?");
		}
	}

}
