package com.exercises;

public class StringMethods {
	
	
	// method to display the middle character of a string.
static void middleCharString(String str) {
		
	if ((str.length())%2==0) {
		System.out.print(str.charAt(str.length()/2-1));
		System.out.println(str.charAt(str.length()/2));
	} else  {
		System.out.println(str.charAt(str.length()/2));
	}
}
	//method to compute the sum of the digits in an integer. 
static int sum(int a, int b) {
	int sum=a+b;
	return sum;
}
//method to check whether a string is a valid password
//1.A password must have at least ten characters. 
//2.A password consists of only letters and digits. 
//3.A password must contain at least two digits.

static  boolean validPassword(String str1) {
	boolean flag =false;
	
	if (str1.length()>=10) { //- checking first condition
		String newstr1 = str1.replaceAll("[^A-Za-z0-9]", "");
		//System.out.println(newstr1);
		
		if (newstr1.equalsIgnoreCase(str1)) {
			String new1str1=str1.replaceAll("[^0-9]", ""); //-checking second condition
			//System.out.println(new1str1);
			if(new1str1.length()>=2) { //-checking third condition
			flag= true;	
		
	}}}else {
		flag=false;
			}
	return flag;
}

public static void main(String[] args) {
	middleCharString("Java");
	System.out.println(sum(9,16));
	System.out.println("If password is valid - "+validPassword("Thgfhpkjh85"));
	
}	
}

