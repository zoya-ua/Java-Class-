package com.class9;

public class Pattern5 {
	public static void main(String[] args) {
		
	
		for (int i = 1; i <=7; i++) {
	         for (int y = 0; y<7; y++) {
	            if(i==1||i==7 || y==7-i) {
	            	
	               System.out.print("*");
	            	}
	            
	            else {
	               System.out.print(" ");
	         } }
	         System.out.println(); 
		
	         }
		}
	
	
	}
