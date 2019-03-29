package com.class5;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your  hight in ft");
	double h1=sc.nextDouble();
	if (h1<=5) { 
		System.out.println("You are short");
			
	} else if (h1>5 && h1<=6) {
		System.out.println("You are medium hight");
	} else if(h1>6) {
		System.out.println("You are tall");
	}
	

	}

}
