package com.class11;

public class MultiDimensionalArrays {
public static void main(String[] args) {
	//creating 2D array
	int[] []d =new int [4][4];
	d[0] [0]=12;
	d[0] [1]=13;
	d[0] [2]=14;
	d[0] [3]=15;
	//2nd row
	d[1] [0]=1;
	d[1] [1]=2;
	d[1] [2]=3;
	d[1] [3]=4;
	//3rd row
	d[2] [0]=5;
	d[2] [1]=10;
	d[2] [2]=15;
	d[2] [3]=20;
	System.out.println(d[1][2]);
	
	int [][] c= {
			      {12,13,14,15},
			      {1,2,3,4,},
			      {5,10,15,20},
			      {100,200,300,400}};
	
	int rows=c.length;
	int cols =c[0].length;
	System.out.println(rows+" * "+cols);
	
	for (int row=0;row<c.length;row++) {
		for (int col=0;col<c[row].length;col++) {
			System.out.print(c[row][col]+" ");
		}
		System.out.println();
	}
}
}
