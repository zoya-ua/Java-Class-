package com.class5;

import java.util.Scanner;

public class LargeIfNested {
		public static void main(String[] args) {
			double num1,num2,num3;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter 1st number");
			num1 =scan.nextDouble();
			System.out.println("Please enter 2nd number");
			num2 =scan.nextDouble();
			System.out.println("Please enter 3rd number");
			num3 =scan.nextDouble();
			
			if (num1>num2) {
				if (num1>num3) {
					System.out.println("The largest is "+num1);
				}else {
					System.out.println("The largest is "+num3);
				}
			}else if(num2>num3) {
				System.out.println("The largest is "+num2);
			}else {
				System.out.println("The largest is "+num3);
			}
				
			}
			

}
