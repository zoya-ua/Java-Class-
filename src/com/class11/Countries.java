package com.class11;

public class Countries {
	public static void main(String[] args) {
		String [] country = {"Ukraine","USA","India","France","Spain","Turkey"};
		
		for (String name:country) {
			switch(name) {
			case "Ukraine":
				System.out.println("Kyiv");
				break;
			case "USA":
				System.out.println("Washington");
				break;
			case "India":
				System.out.println("New Delhi");
				break;
			case "France":
			System.out.println("Paris");
			   break;
			case "Spain":
				System.out.println("Madrid");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			}
		}
		System.out.println();
		
		for(int i=0;i<country.length;i++) {
			if (country[i].equals("Ukraine")) {
				System.out.println("Kyiv");
			}
			if (country[i].equals("USA")) {
				System.out.println("Washington");
			}
			if (country[i].equals("India")) {
				System.out.println("New Delhi");
			}
			if (country[i].equals("France")) {
				System.out.println("Paris");
			}
			if (country[i].equals("Spain")) {
				System.out.println("Madrid");
			}
			if (country[i].equals("Turkey")) {
				System.out.println("Ankara");
			}
		}
	
	}
}

