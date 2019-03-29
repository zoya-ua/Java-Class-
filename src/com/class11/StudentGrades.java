package com.class11;

public class StudentGrades {
public static void main(String[] args) {
	
	String [] [] N =new String [2][4];
	N[0][0]="Tim";
	N[0][1]="Ann";
	N[0][2]="David";
	N[0][3]="Katy";
	N[1][0]="A";
	N[1][1]="B";
	N[1][2]="C";
	N[1][3]="D";
	
	for (int i=0;i<N.length;i++) {
		for (int y=0;y<N[i].length;y++) {
		System.out.print(N[i][y]+" ");		
		}
		System.out.println();
	}
	
	
	System.out.println(N[0][0]+" - "+N[1][0]);
	System.out.println(N[0][3]+" - "+N[1][1]);
} 
}
