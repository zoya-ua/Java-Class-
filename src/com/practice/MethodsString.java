package com.practice;

import java.util.Scanner;

public class MethodsString {
	/*Write a value-returning method, isVowel that returns the value true if a given character is a vowel, 
	 * and otherwise returns false. 
	 * In main() method accept a string from user and count number of vowels in that string.
	 * 
	 */
	
	
public static boolean isVowel(char c) { 
	switch(c) {
	case 'a':
	case 'A':
	case 'o':
	case 'O':
	case 'u':
	case 'U':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
		return true;
	default:
		return false;
	}
}
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for (int i=0;i<str.length()-1;i++) {
		if (isVowel(str.charAt(i))) {
			count++;
		}
	}
	
	System.out.println("String containes "+count+" vowels");
}
}
