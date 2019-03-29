package com.JavaReview;

public class FindValues7 {
	public static void main(String[] args) {
		//    Find the number of values above the value of 7.
		
 int[][] ar = { { 2, 6, 9, 3, 7 }, 
		        { 1, 7, 9, 4, 8 }, 
		        { 0, 4, 6, 2, 5 },  
		        { 0, 1, 2, 3 } };
 int count=0;
 for (int[] ar1:ar) {
	 for(int element:ar1) {
		 if (element>7) {
			 count++;
		 }}
	 }	 
 System.out.println(count +" elements above 7");
//Print the average of values in column 3
	
 
 
	}
	

}
