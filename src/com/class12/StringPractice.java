package com.class12;

public class StringPractice {
	public static void main(String[] args) {
		
		//.length()		
String str="Syntax";

int lengthOfString= str.length();
System.out.println(lengthOfString);
String  str1="Syntax Technologies";
System.out.println(str1.length());

//.toUpperCase();,.toLowerCase();
String str3="Hello";
String newstr3=str3.toUpperCase();
System.out.println(newstr3);
String newstr3low=newstr3.toLowerCase();
System.out.println(newstr3low);

//.equals() -compares two strings
String str4="Hello ";
String str5="hello";
boolean equality =str4.contentEquals(str5);
System.out.println((equality));

//.equalsIgnoreCase -compares two strings ignoring Upper-Lower casing
String a="chrome";
String aExpected="Chrome";

boolean equals=aExpected.equalsIgnoreCase(a);
System.out.println(equals);

//.contains(); - checks for specific value in the string
String str6="Good morning, students!";
boolean cont =str6.contains("Morning");
System.out.println(cont);
String present = "Welkome, Mehmet";
String needed ="Mehmet";
boolean flag =present.contains("Welcome,");
boolean flag1=present.contains(needed);
	System.out.println(flag);	
    System.out.println(flag1);
    
 //.startsWith(); , .endsWith();
boolean starts =str.startsWith("S");
System.out.println(starts);
boolean end =str.endsWith("y");
System.out.println(end);

//.isEpty(); if length of the string <o its empty,
boolean empty=str6.isEmpty();
System.out.println(empty);

//.concat(String) - to add (concatenate) one string to the end of another
//str.concat(“”).concat(“”).concat(“”);
System.out.println(str4+a);
System.out.println(str3.concat(str4));

//.trim() - will cut spaces at the begining and end of the string 
String expected ="Hello ";
String actual ="  Hello        ";
System.out.println(expected.equals(actual));

System.out.println(expected.trim().contentEquals(actual.trim()));
actual =actual.trim();
expected=actual.trim();
System.out.println((expected.contentEquals(actual)));


	}

}
