package com.class5;

import java.util.Scanner;

public class LogicalOr {
	public static void main(String[] args) {
		/* we have 7 week
		 * if days from 1-5 -->weekend
		 * if days from 6-7 -->weekend
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of the week ");
		int day= sc.nextInt();
	
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is the weekday");
		} else if (day==6|| day==7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
