package com.class8;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		int num1, num2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		num1 = scan.nextInt();
		System.out.println("Please enter an ending number");
		num2 = scan.nextInt();
		if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {

				System.out.print(i + " ");
				sum = sum + i;
			}
			System.out.println();
			System.out.println(sum);

		} else {
			System.out.println("First number must be smaller then second");
		}
	}

}
