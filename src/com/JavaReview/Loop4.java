package com.JavaReview;

public class Loop4 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int y=5;y>=i;y--) {
				if (y<=i) {
					System.out.print(i);
				}else {
					System.out.print(".");
				}
			} System.out.println();
		}
		for (int i=1;i<=5;i++) {
			for (int y=5;y>=1;y--) {
				if (y==i) {
					System.out.print(i);
				}else {
					System.out.print(".");
				}
			} System.out.println();
		}
		
		
	}

}
