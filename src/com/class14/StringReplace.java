package com.class14;

public class StringReplace {
	public static void main(String[] args) {
		
		String str1="12Hello 3216 World 456%$#";
		// replace specific characters
		String newstr1=str1.replace("3216", "");
		System.out.println(newstr1);
		//replace all numbers
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString =replacedNoNumbers.replaceAll("[^A-Za-z]", " ");
		System.out.println(newString);
		
		String str2=str1.replaceAll("^[0-9]", " ");
		
		
	}

}
