package com.class18;

public class Pattern2 {

	public static void main(String[] args) {
		
		for (int i=1;i<5;i++) {
			for (int y=0;y<i;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>0;i--) {
			for(int y=i;y>0;y--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
