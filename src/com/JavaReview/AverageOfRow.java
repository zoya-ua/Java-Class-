package com.JavaReview;

public class AverageOfRow {
	public static void main(String[] args) {
		
	
//  Write a program to find the average of row 2.
		
int sum=0;

int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

	for(int y=0;y<rating[1].length;y++) {
		sum=sum+rating[1][y];	
	}
	double average=sum/rating[1].length;
	System.out.println("The average of row 2 is "+average);
	
	
	}
}

