package com.InterviewQuestions;

public class Substring {
	public static void main(String[] args) {
		/*How to find out the part of the string from a string?
	     What is substring? Find number of words in string?
		*/
		String str="Find number of words in string?";
		System.out.println(str);
		//First using .substring
		String substring =str.substring(5,15);
		System.out.println(substring);
	
		/*Substring() method extracts the characters from a string,
		between two specified indexes and returns the new substring
		*/
		// Second using split
		String []array =str.split(" ");
		System.out.println(array[1]+" "+array[2]);
		
		
		System.out.println("Number of words in the string : "+array.length);
	}


}
