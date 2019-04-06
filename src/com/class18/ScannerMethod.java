package com.class18;

import java.util.Scanner;

public class ScannerMethod {
	public static void main(String[] args) {
		
	
	ScannerMethod obj=new ScannerMethod();
	Scanner sc=new Scanner(System.in);
	int x =sc.nextInt();
	int y =sc.nextInt();
	System.out.println(obj.sum(x, y));
	obj.sum(y, x);
    obj.sub();
    
	
}
	 int sum(int x,int y) {
		System.out.println(x+y);
		return x+y;
	}

 public void sub(){
	int a=10,b=12;
	System.out.println(a-b);
	
}
}