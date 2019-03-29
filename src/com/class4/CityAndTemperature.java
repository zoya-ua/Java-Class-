package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		String city;
		int temp, tempC;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your City");
		city = sc.nextLine();

		System.out.println("Please enter temperature");
		temp = sc.nextInt();

		tempC = (temp - 32) * 5 / 9;

		System.out.println("The temperature in the city" + city + " is " + tempC + " C");

	}

}
