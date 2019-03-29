package com.class8;

public class Num2050 {
	public static void main(String[] args) {
		
		//Print Even 20-50
		for (int i=20;i<+50;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				
			}
		}
		System.out.println();
		
		for (int i=20;i<+50 ; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Print Odd 20-50
		for (int i=20;i<+50;i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for (int i=21;i<=50 ; i+=2) {
			System.out.print(i+" ");
		}
		
		
	}

}
