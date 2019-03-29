package com.JavaReview;

public class PrintArray {
	public static void main(String[] args) {
		int[][] ar={{1,2,3},{4,5,6,9},{7,8}};
		System.out.println("For Loop");
		
		for (int i=0;i<ar.length;i++) {
			for(int y=0;y<ar[i].length;y++) {
			
			System.out.print(ar[i][y]);
			}
			System.out.println();
		}
		System.out.println("For Each Loop");
		
		for(int [] ar1:ar) {
			for(int ar2:ar1) {
				System.out.print(ar2);
			}
			System.out.println();
			
		}
		
	}

}

