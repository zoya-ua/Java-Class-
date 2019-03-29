package com.class5;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		/*
		 * Enter daily sales amount sale<100 commission -2% 
		 * sales>100 <200                    commission -5%
		 * 200<sales<500                                -10%
		 * sales>500                                    -20%
		 */
		Scanner sc;
		int sales;
		double commission;

		sc = new Scanner(System.in);
		System.out.println("Please enter your seles");
		sales = sc.nextInt();
		if (sales <= 100 && sales > 0) {
			commission = 0.02;
		} else if (sales > 100 && sales < 200) {
			commission = 0.05;
		} else if (sales >= 200 && sales < 500) {
			commission = 0.1;
		} else if (sales >= 500) {
			commission = 0.2;

		} else {
			commission = 0;
		}

		System.out.println("Your commission is - " + (sales * commission));
	}

}
