package com.JavaReview;

public class LengthOfArray {
	public static void main(String[] args) {
		int[][] ar={{1,2,3},{4,5,6,9},{7,8}};
		
		for (int i=0;i<ar.length;i++) {
			
			System.out.println("The length of row "+(i +1)+" - " +ar[i].length);
			
		}
		System.out.println("The length of rows: ");
		for(int [] ar1:ar) {
			
			System.out.print(ar1.length+" ");
		}
		
	}

}
