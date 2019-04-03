package com.InterviewQuestions;

public class ArraySecondLargest {
	public static void main(String[] args) {
		
		/*Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 */
		
		int[] arr= {90,15,0,45,-1,7,87};
		int max=arr[0];
		int min=arr[0];
		int secondlarge=0;
		
		for (int i=0;i<arr.length;i++) {
			
		if (arr[i]>max) {
			max=arr[i];		
		}else if(arr[i]<min) {
			min=arr[i];
		}
		}
		System.out.println("Maximum number : "+max);
		System.out.println("Minimum number : "+min);
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>secondlarge && arr[i]<max) {
				secondlarge=arr[i];
			}
		}
		System.out.println("Second largest number : "+secondlarge);
		
		
	}

}
