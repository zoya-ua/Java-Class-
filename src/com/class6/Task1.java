package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
	int T;
	boolean sunny,rain,snow;
	Scanner scan;
	String activity;
	
	scan =new Scanner(System.in);
	System.out.println("Please enter temperature");
	T=scan.nextInt();
	if (T>=40 && T<80) {
		System.out.println("Is it raining?");
		rain=scan.nextBoolean();
		if (rain) {
			activity="Stay home";
		} else {
			activity="Go hiking";
		}
	} else if(T>=25 && T<40) {
		System.out.println("Is it snowing?");
		snow=scan.hasNextBoolean();
		if (snow) {
			activity="Go snowboarding";
			
		} else {
			activity="Watch movie";
			
		}
	} else if (T>=80) {
		System.out.println("Is it sunny?");
		sunny=scan.nextBoolean();
		if (sunny) {
			activity="Go to the beach";
			
		} else {
			activity="Keep coding";
		}
	}else {
		System.out.println("Please anter valid temperature");
		activity ="Unknown activity";
	}
	
	System.out.println(activity);
		
	}

}
