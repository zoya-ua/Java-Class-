package com.JavaReview;

public class Array {
	public static void main(String[] args) {
	
		
		boolean found =false;
		
		
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i < arr.length;i++) {
			if(arr[i]==6) {
				found=true;
			break;
			}
			
		}
		if (found) {
			System.out.println("Array contains value 6");
		}else {
			System.out.println("No value 6 in Array");
		}
		
	}
	

}
