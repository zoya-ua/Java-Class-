package com.class8;

import java.util.Scanner;

public class ForAndScanner {
	public static void main(String[] args) {
		Scanner myScanner;
		int num1, num2, largest;
		largest = 0;
		myScanner = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter  number");
			num1 = myScanner.nextInt();
			num2 = myScanner.nextInt();
			if (num1 > num2) {
				largest = num1;

			} else if (num1 < num2) {
				largest = num2;
			} else {
				System.out.println(num1 + " is equel to " + num2);
				continue;
			}
			System.out.println("Largest is" + largest);

		}

	}

}
