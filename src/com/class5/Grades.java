package com.class5;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Plese enter your quiz score");
		 int qsq= sc.nextInt();
		 System.out.println("Plese enter your mid term score");
		 int msq=sc.nextInt();
		 System.out.println("Plese enter your final score");
		 int fsq =sc.nextInt();
		 int ave= (qsq+msq+fsq)/3;
		 
		 System.out.println("Your average score " +ave);
		 if (ave>=90) {
			 System.out.println("You are A student");
		 }else if (ave<90 &&  ave>=70) {
			 System.out.println("You are B student");
		 }else if (ave<70 && ave>=50) {
			 System.out.println("You are C student");
		 } else if (ave<50 && ave>0) {
			 System.out.println("You are F student");
		 }
		 
			
	}

}
