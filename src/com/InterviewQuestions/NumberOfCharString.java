package com.InterviewQuestions;



public class NumberOfCharString {
	public static void main(String[] args) {
		// Find out how many alpha characters present in a string?
		String str="Saturday 03.30.2019 ";
		String newstr2=str.replaceAll("[^A-Za-z]", "");
		System.out.println(newstr2);
		System.out.println("There are " +newstr2.length()+" alpha sharacters in the String");
	}

}
