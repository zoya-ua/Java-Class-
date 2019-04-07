package com.class19;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
	    double x1=sc.nextDouble();
	    double x2=sc.nextDouble();
	    double x3=sc.nextDouble();
	    
		Calculator.sum(x1, x2, x3);
		System.out.println("Sum of 3 numbers is "+Calculator.sum(x1, x2, x3));
		Calculator.average(x1, x2, x3);
		System.out.println("Average of 3 numbers is "+Calculator.average(x1, x2, x3));
		Calculator.min(x1, x2, x3);
		System.out.println("Minimum value of  3 numbers is "+Calculator.min(x1, x2, x3));
		Calculator.max(x1, x2, x3);
		System.out.println("Maximum value of 3 numbers is "+Calculator.max(x1, x2, x3));
		System.out.println("----------------------");
		
		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		MinMax.maxOfValuees(array);
		System.out.println("Maximum value of an array is "+MinMax.maxOfValuees(array));
		MinMax.minOfValues(array);
		System.out.println("Minimum value of an array is "+MinMax.minOfValues(array));
		
		
		
System.out.println("-----------------------");
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		MinMax.minOfValues(my_array);
System.out.println("Minimum value of an array is "+MinMax.minOfValues(my_array));
		System.out.println("-----------------------");
		Animal dog =new Animal();
		Animal horse  =new Animal();
		Animal wildDog =new Animal();
		
		dog.name="Tyson";
		dog.canBark();
		horse.breed="Mustang";
		horse.isWild();
		wildDog.name="";
		
		wildDog.breed="African wild dog ";
		wildDog.isWild();
		wildDog.canBark();
	}

}
