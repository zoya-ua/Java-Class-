package com.class7;

public class Task1 {
	public static void main(String[] args) {
		boolean workDay=true;
		int day;
	day=1;
while (day<=6) {
	

		if(workDay==true) {
				System.out.println("I need a day off");
				if (day==6) {System.out.println("I am off");
				workDay=false;
				}
				}
				++day;
	
	}
		
	}


}