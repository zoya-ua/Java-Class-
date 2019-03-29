package com.JavaReview;

public class Time {
	public static void main(String[] args) {
		String a="the time is 07:";
		int i;
		//for loop
		for (i=0;i<30;i++) {
			if (i<10) {
				System.out.println(a+"0"+i+"min");
				continue;
			}else if(i<30) {
				System.out.println(a+i+"min");
			}}
		//while loop
		int b=0;
		while (b<10) {
			System.out.println(a+"0"+b+"min");
			b++;
		}
		while (b<30) {
			System.out.println(a+b+"min");
			b++;
		}
		//do while
		int c=0;
		do {
			if(c<10) {
			System.out.println(a+"0"+c+"min");
			}else if(c>=10 && c<=30) {
			System.out.println(a+b+"min");	
			}
			c++;
		}while(c<=10);
		
		
				
		
	}

}
