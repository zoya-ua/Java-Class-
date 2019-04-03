package com.practice;



public class ArmstrongNumbers {
	public static void main(String[] args) {

		
		
		for (int i=0;i<=500;i++) {
		
	    int a=i;		
		int h=a/100;  //hundreds
		
		int t=(a-(h*100))/10;  //tens
		
		int s=a%10; //singles
		
		if ((s*s*s)+(t*t*t)+(h*h*h)==a) {
			System.out.println(a);
		}
	}
	}

}
