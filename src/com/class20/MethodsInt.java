package com.class20;

import java.util.Scanner;

public class MethodsInt {
	
	int getTotal() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two integers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int total=n1+n2;
		return total;
	}
	boolean isEven() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an  integers");
		int n3=sc.nextInt();
		if (n3%2==0) {
			return true;
		}else return false;
	}
public static void main(String[] args) {
	MethodsInt obj=new MethodsInt();
	System.out.println(obj.getTotal());
	System.out.println (obj.isEven());
}
}
