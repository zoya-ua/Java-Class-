package com.practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in;
		int n;
		in=new Scanner(System.in);
		System.out.println("Please enter any integer");
		n=in.nextInt();
		int f=1;
		for(int i=n;i>1;i--) {
		 f = f*i;
		}
		System.out.println(f);
	}

}
