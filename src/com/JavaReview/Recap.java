package com.JavaReview;

public class Recap {
	public static void main(String[] args) {
		String [] names =new String[6];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();	
			//Second way
			String[] studentNames = {"Shaban", "Bilal", "Milena","Zaki","Ali"};
			for (int y=0;y <studentNames.length;y++) {
				System.out.print(studentNames[y]+" ");
			}	
			System.out.println();
		//retrieve values using:advanced for loop, for each loop,enchanced for loop
			for (String student:studentNames) {
				System.out.print(student+" ");
			}
	}

}
