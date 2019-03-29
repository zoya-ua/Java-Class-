package com.class5;

import java.util.Scanner;

public class ConditionsAll2 {
		public static void main(String[] args) {
			/*
			 * ask user to enter price and boolean value for sale if price<20 - discount 20%
			 * if 20<price>100 -30% price>100 -50%
			 */
			double price, discount, finalprice = 0 ;
			boolean sale;
			Scanner scan;
			scan = new Scanner(System.in);
			System.out.println("Please enter if there is a sale true or false");
			sale = scan.nextBoolean();
			if (sale) {
				System.out.println("Lets check discounts");

				System.out.println("Please enter price");
				price = scan.nextDouble();
				if (price < 20) {
					discount = 0.2;
					finalprice = price - (price * 0.2);
					
				} else if (price >= 20 && price < 100) {
					discount = 0.3;
					finalprice = price - (price * 0.3);
				

				} else if (price >= 100 && price < 500) {
					discount = 0.5;
					finalprice = price - (price * 0.5);

				} else if (price > 500) {
					discount = 0.75;
					finalprice = price - (price * 0.75);
				}
				

			} else {
				System.out.println("Not interested");
			}
			
			System.out.println("Final price " + finalprice);
			
		}

	}

