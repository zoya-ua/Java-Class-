package com.class14;

public class StringToArray {
public static void main(String[] args) {
	String str="saturday";
	
	char[]array =str.toCharArray();
	//for loop
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]);
		
	}	
	System.out.println();
	//for each loop
		for (char c :array) {
			System.out.print(c);
		}
		System.out.println();
		
	//printing in reverse
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		//Reverse a String without using a reverse function
		String original="Todayis Java Class";
		String reverse ="";
		char[] array1=original.toCharArray();
		
		for (int i=array1.length-1;i>0;i--) {
			reverse=reverse+array1[i];
			
		}
		System.out.println("Reversed String is "+reverse);
		
		//using charAt()
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		//using substring()
		
		String reverseO="";
		for  (int y=original.length()-1;y>0;y--) {
			reverseO+=original.substring(y-1,y);
		}
		System.out.println(reverseO);
		
	
		
		
		
		
		
}
}
