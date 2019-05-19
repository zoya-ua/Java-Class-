package com.class35;

public class ExceptionIntro {
	public static void main(String[] args) {
		int[] array= {12,13,12};
	System.out.println("Begining of the code");
	int a=10;
	int b=0;
	try {
		System.out.println(a/b);
		System.out.println("Code insidetry block");
	}catch(ArithmeticException e) {
		System.out.println("Code inside catch block");
	}
	System.out.println("The end of the program");
	}

}
