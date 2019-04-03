package com.class13;

import java.util.Scanner;

public class BabyNames {
	public static void main(String[] args) {
		/* Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL  */
		String str1,str2,str3;

		
		Scanner in=new Scanner(System.in);
		System.out.println("Mom's first name?") ;
		str1=in.nextLine();
		System.out.println("Dad's first name?") ;
		str2=in.nextLine();
		System.out.println("boy or girl?");
		str3=in.nextLine();
		
		
		if (str3.equalsIgnoreCase("Boy")){
			
			System.out.println(str2.substring(0, str2.length()/2).concat(str1.substring(str1.length()/2)));
		}else if(str3.equalsIgnoreCase("Girl")) {
			System.out.println(str1.substring(0, str1.length()/2).concat(str2.substring(str2.length()/2)));
		}else {
			System.out.println("Wrong input");
		}	
		
	}
}
