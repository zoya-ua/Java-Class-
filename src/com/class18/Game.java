package com.class18;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan;
		
		int secretnum=13;
		scan=new Scanner(System.in);
		
		for(int i=0;i<22;i++) {
			
		System.out.println("Guess the secret number between 1 and 20 ");
		int num=scan.nextInt();
		
		if (num==secretnum) {
			System.out.println("Congratulations! You got it!");
			break;
		}else if(num>secretnum && num<=20) {
			System.out.println("Number to large, try again");
		
		} else if(num<secretnum && num>0) {
			System.out.println("Number to small, try again");
		}else {
			System.out.println("Number is out of 1-20 range");
		}
		}
		
	}

}
