package com.class6;

import java.util.Scanner;

public class OrAnd {

	  public static void main(String [] args){
	    Scanner scan;
	    String word1, word2;
	    int int1,int2;
	    scan =new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    word1=scan.nextLine();
	    word2=scan.nextLine();
	    System.out.println("Please enter two numbers");
	    int1=scan.nextInt();
	    int2=scan.nextInt();
	    if ((int1==int2) && (word1.equals(word2))){
	      System.out.println("AND");
	    }else if((int1==int2) || (word1.equals(word2))){
	      System.out.println("OR");
	    } else if ((int1!=int2) && !(word1.equals(word2))){
	      System.out.println("NONE");
	    }
	    
	  }

	}
