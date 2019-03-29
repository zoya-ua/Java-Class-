package com.class6;

import java.util.Scanner;

public class StringsSwitch {
	public static void main(String[] args) {
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner(System.in);
		System.out.println("What country are you from?");
		country=scan.nextLine();
		
		switch(country) {
		case "USA":
			food="Burger";
			break;
		case "Afghanistan":
			food="Palau";
			break;
		case "Russia":
			
			food="Pelmeni";
		case "Italy":
			food="Pasta";
			break;
		case "Turkey":
			food= "Baklava";
			break;
		case "Morocco":
			food="Couscous";
			break;
		case "Kazakhstan":
			food="";
			break;
		case "Ukraine":
			food="Borch";
			break;
		case "India":
			food="Curry";
			break;
		default:
			food="Unknown";
			break;
			
		}
		System.out.println("Your favorite food is " +food);
	}

}
