package com.JavaReview;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
	      // Write a program to find the index of an array element.
	       
		int [] arr={1,23,3,4,5,6};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the element of {1,23,3,4,5,6} for which you want to find out indexindex?");
		int num=scan.nextInt();
		for (int y=0;y<arr.length;y++) {
			if(arr[y]==num) {
				System.out.println(y);
			}	
		}	
		
		 //Write a program to find the maximum and minimum value of an array.			
		int sm=arr[0];
		int lg=arr[0];
		int i;
		for (i=0;i<arr.length;i++){
			
		if (arr[i]>lg) {
			lg=arr[i];
			
		}else if (arr[i]<sm) {
			sm=arr[i];		
	}
		}
		
		System.out.println("The larges num = "+lg+" The smallest num = "+sm);	
				
	}

}
