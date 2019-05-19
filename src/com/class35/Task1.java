package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter integer");
		
		try {
			int a=in.nextInt();
			System.out.println(a);
		}catch(InputMismatchException e) {
			System.out.println("this is not integer");
		}
		}

}
