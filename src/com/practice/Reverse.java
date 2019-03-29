package com.practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number, you want to be reversed");
		int num=scan.nextInt();
		int rev=0;
		while (num!=0) {
		 rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
