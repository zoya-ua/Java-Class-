package com.class6;

import java.util.Scanner;

public class Main {
		  public static void main(String [] args){
		String subject =null;
		    Scanner scan = new Scanner (System.in);
		    System.out.println("Is it weekend?");
		    Boolean weekend = scan.nextBoolean();
		    if (weekend=false){
		      subject = "Manual testing";
		    } else {
		      subject = "Java";
		    }
		    System.out.println("Today you will be learning "+subject);
		  }

		}

