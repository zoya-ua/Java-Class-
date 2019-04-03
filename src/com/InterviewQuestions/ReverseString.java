package com.InterviewQuestions;

public class ReverseString {
	public static void main(String[] args) {
	//Write a java program to reverse String? 
	
		String str="Write a java program to reverse String?";
		System.out.println(str);
		//charAt()
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//toCharArray()
		char[]array =str.toCharArray();
		for (int y=str.length()-1;y>=0;y--) {
			System.out.print(array[y]);
		}
		System.out.println();
		
	//Reverse a string word by word
		
		String[] array1=str.split(" ");
		for(int a=array1.length-1;a>=0;a--) {
			
		System.out.print(array1[a]+" ");
		
	}
	}
}
