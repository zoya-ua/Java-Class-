package com.class20;

public class StringMethods {
	/*
	Create a method that will take 1 parameter as a String and return 
reversed String. Method should be visibly only within same package.
	*/
	String reverse(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);	
		}
		return reverse;
	}
	/*Create a method that will take a String and return whether
String is palindrome or not. Method should available to all classes within your projects.
String reverse="";
		for(int i=str1.length()-1;i>=0;i--) {
			reverse=reverse+str1.charAt(i);	
		}
*/
	public boolean  palindrome(String str1) {
		
		String reverse=reverse(str1);
	if (reverse.equalsIgnoreCase(str1)) {
			return true;
		}else return false;
	}
	/*
	Create a method that will take a string and return array of
			   words from that string. Method should be available only within same class.
			*/
	private String [] stringToArray(String str2) {
		String[] array=str2.split(" ");
		return array;
	}
	public static void main(String[] args) {
	 StringMethods String1=new StringMethods();
	 
	 System.out.println(String1.reverse("Create a method"));
	 System.out.println("The String is palindrome - "+String1.palindrome("Hello"));
	 String [] array1=String1.stringToArray("Hello Students");
	 for (String word:array1) {
		 System.out.println(word);
	 }
	
	}
	
	
}
