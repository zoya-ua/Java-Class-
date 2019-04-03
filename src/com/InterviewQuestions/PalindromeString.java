package com.InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
	
	// Write a Java Program to find whether a String is palindrome or not?

	Scanner in=new Scanner(System.in);
	System.out.println("Enter any string");
	
	String  str=in.nextLine();
	String reverse="";
	char [] array= str.toCharArray();
	for (int i=str.length()-1;i>=0;i--) {
		reverse=reverse+array[i];
	}
	System.out.println(reverse);
	if (reverse.equalsIgnoreCase(str)) {
		System.out.println("String is polindromec ");
	}else {
		System.out.println("String is not polindromic");
	}
}
}
