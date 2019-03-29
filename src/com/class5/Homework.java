package com.class5;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		double num1,num2,num3, largest = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 1st number");
		num1 =scan.nextDouble();
		System.out.println("Please enter 2nd number");
		num2 =scan.nextDouble();
		System.out.println("Please enter 3rd number");
		num3 =scan.nextDouble();
		
		//if number are NoT equal
		
		if (!(num1==num2 && num2==num3 && num1==num3)) {
			
		
		if (num1>num2) {
            if (num1>num3) {
                largest=num1;
            }else {
                largest=num3;
            }
}else {//assuming num2>num1
    
            if (num2>num3) {
                largest=num2;
            }else {
                largest=num3;
            }
}
		}

System.out.println("The largest number is "+largest);
}
}
