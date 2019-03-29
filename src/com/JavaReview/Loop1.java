package com.JavaReview;

public class Loop1 {
	public static void main (String []args) {
		
		for(int i=1;i<=5;i++) {
				
			for (int y=1;y<=10;y++) {
				int num=y*i;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
