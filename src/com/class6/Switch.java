package com.class6;

public class Switch {
	public static void main(String[] args) {
		int day= 5;
		String dayName;
		if (day==1) {
			dayName="Monday";	
		} else if (day==2) {
			dayName="Teusday";	
		} else if (day ==3) {
			dayName="Wednesday";	
		} else if (day==4) {
			dayName ="Thursday";
		} else if (day==5) {
			dayName="Friday";
		} else if (day==6) {
			dayName="Saturday";
		} else if (day==7) {
			dayName="Sunday";
			
		} else {
			dayName="Invalid";
		}
		System.out.println("Today is "+dayName );
		
		
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName ="Teusday";
			break;
		case 3:
			dayName ="Wednesday";
			break;
		case 4:
			dayName ="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default:
			dayName="Invalid";
			break;		
			
	}
		System.out.println("Today is "+dayName );

}
}