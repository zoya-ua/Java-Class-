package com.InterviewQuestions;


public class Fibonacci {
	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		int [] fib = new int [10];
		fib[0]=0;
		fib[1]=1;
		
		for (int i=2;i<fib.length;i++) {
			fib[i]=fib[i-2]+fib[i-1];
		}

		for(int y=0;y<10;y++) {
			System.out.print(fib[y]+", ");
		}
	}

}
