package com.class11;

public class Largest {
	public static void main(String[] args) {
		
		
		int [] arr={1,23,3,4,5,1};
		
		int lg=arr[0];
		int i;
		
		for (i=0;i<arr.length;i++){
			
		if (arr[i]>lg) {
			lg=arr[i];
		}
		}
		System.out.println("Largest element = "+lg );
		
		for(int n:arr) {
			if(n>lg) {
				lg=n;
			}
		}
		System.out.println("Largest element = "+lg);
	}		
		
}
