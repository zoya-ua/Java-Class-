package com.class4;

import java.util.Scanner;

public class DMV {
	public static void main(String[] args) {
		int age;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Pleae enter your age:");
		age=sc.nextInt();
		
		if (age>=18) { 
			System.out.println("Congrats! You are getting driver licence!");
		}else if (age>=15){
				System.out.println("Sorry, you'll have to apply for learner permit first!");
			}else {
				System.out.println("To erly to drive!");
			}
		
		
		
		
	}


}