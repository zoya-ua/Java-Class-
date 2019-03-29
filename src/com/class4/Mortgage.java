package com.class4;

public class Mortgage {

	public static void main(String[] args) {
		double rate =3.5;
		double exceptrate =4.5;
		int price = 199000;
	    int loanprice = 200000;
	    
	    if (rate<=exceptrate) {
	    	System.out.println("I am buying a house");
	    	if (price<loanprice) {
	    		System.out.println("Iam paying in cash!");
	    		
	    	} else {
	    		System.out.println("I'm taking a loan! ");
	    	}
	    }else {
	    	System.out.println("Im not buying");
	    }
	    	
		

	}

}
