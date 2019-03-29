package com.class4;

public class Hiiring {
	public static void main(String[] args) {
		double gpa = 3.5;
		double expectedGpa = 3.5;
		boolean hasDiploma = true;
		if (hasDiploma) {
			System.out.println("Good Job!");
			if (gpa>=expectedGpa) {
				System.out.println("You are hired!");
			} else {
				System.out.println("Unfortunately we cannot hire you.");
			}
		}
		else {
			System.out.println("Go study!");
		}
		
	}

}
