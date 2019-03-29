package com.class6;

import java.util.Scanner;

public class CountryLanguage {
	public static void main(String[] args) {
		
	Scanner scan;
	String  country,language;
	
scan=new Scanner(System.in);
System.out.println("What country are you from?");
country=scan.nextLine();

switch(country) {
case "USA":
	language="English";
	break;
case "Germany":
	language="German";
	break;
case "Italy":
	language="Italian";
	break;
case "Turkey":
	language= "Turkish";
	break;
case "Russia":
	language="Russian";
	break;
case "China":
	language="Chinese";
	break;
case "Ukraine":
	language="Ukrainian";
	break;
default:
	language="Unknown";
	break;
	
}
System.out.println("You speak " +language);
}
}