package com.class14;

public class StringPractice {
	public static void main(String[] args) {

		
	String str="New String !";
	System.out.println(str.replace(" ", ""));
		
	/*Create a String that should be combination of letters, numbers and special characters. 
	 Find out how many alpha characters are there in the String.*/	
	
	String str2= " 12 New *@$  134 String";
	String newstr2=str2.replaceAll("[^A-Za-z]", "");
	System.out.println("There are " +newstr2.length()+" alpha sharacters in the String");
			
	/*You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?”
	 *  How would you find out how many sentences are in that String?
	 */
	String str3="Is it saturday! Is it raining! Do we have a Java Class today?";
	String [] array =str3.split("!");
	System.out.println("The length of an array is " +array.length);
	
		
	}

}
