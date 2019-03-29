package com.class12;

public class StringManipulations {
	public static void main(String[] args) {
		String str="Student";
		//.charAt(index)
		char character =str.charAt(6);
		System.out.println(character);
		
		for (int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+", ");
		}
		System.out.println();
		
		//.indexOf("")
		int index =str.indexOf("t");
		System.out.println(index);
		String str1="Syntax Technologies";
	//	System.out.println(str1.indexOf("w")); return -1
		System.out.println("Technologies");
		
	//.substring(index,index) -copy your 
		String str2="Today is Sunday Java class";
		System.out.println(str2);
		String newstr2=str2.substring(9,15);
		System.out.println(newstr2);
		System.out.println(str2.substring(str2.indexOf("S")));
		
	}

}
