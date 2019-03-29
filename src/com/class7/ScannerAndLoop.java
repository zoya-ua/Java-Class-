package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		Scanner scan;
		String name;
		int num=0;
		scan=new Scanner(System.in);
		
		while (num<3) {
			
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("You are doing great "+name);
			num++;
		}
	}

}
