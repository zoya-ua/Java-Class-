package com.class9;

import java.util.Scanner;

public class Shoping {
	public static void main(String[] args) {	
	double price,payment, change;
	double sum=0;
	Scanner scan=new Scanner(System.in);
    System.out.println("What do you want to buy?");
    String item=scan.nextLine();
    System.out.println("Please enter the price for your item");
    price =scan.nextDouble();
    
    do {
    	System.out.println("Please enter your payment");
    	 payment =scan.nextDouble();
    	sum = sum+payment;
    	
    } while (sum<price);
    System.out.println("Thank you for shopping");
    if(sum>price) {
    	change=sum-price;
    	System.out.println("You overpayed, you are getting back "+change+"$");
    	
    }else {
    	System.out.println("Enjoy your purchase!");
    }
    
    
	}
    
   
	}


