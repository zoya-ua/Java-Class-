package com.JavaReview;

public class Loops {
public static void main(String []args) {
	
	//for loop
	for (int i=1;i<=10;i++) {
		System.out.println("I'm feeling happy today"+i);
		
	}
	System.out.println("I'm out of the  loop ");
	
	//while loop
	int a=10;
	while(a>0) { 
		System.out.println("I'm feeling happy today"+a);
		a--;
	}
	System.out.println("I'm out of the loop");
	
	
	//do while
	int b=0;
	do {
		System.out.println("I'm feeling happy today"+b);
		b++;
	}while (b<10);
	System.out.println("I'm out of the loop");	
	
}
	
}
