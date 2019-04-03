package com.class13;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		
		/*Create a String and if the String is not empty perform the following: 
			if the String has an odd number of characters and has 3 or more characters, 
			print the character in the middle of the String*/
		
		Scanner scan=new Scanner(System.in);
				System.out.println("Please enter new string");
		
		String str =scan.nextLine();
		int len=str.length();
		
		if(str.isEmpty()){
			System.out.println("String is Empty")	;	
			
		}else if (len%2!=0 &len>3) {
				System.out.println(str.charAt(len/2));
			}
	
		
	}

}
