package com.class12;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		
	    Scanner in =new Scanner(System.in);
	    
	    
	    System.out.println("Please enter your username");
	    String username=in.nextLine();
	    System.out.println("Please enter password");
	    String password =in.nextLine();
	    boolean empty1 =username.isEmpty();
	    boolean empty2=password.isEmpty();
	    
	    
	    if (!(empty1 || empty2)) {
	    	if(password.length()>=8) {
	    		if (!(password.contains(username))) {
	    			
	    			System.out.println("Please confirm password");
	    			String confpass=in.nextLine();
	    			if (password.contentEquals(confpass)) {
	    			System.out.println("Your username and password has been created”");	
	    			}else {
	    				System.out.println("Passwords do not match”.");
	    				
	    			}
	    			
	    			
	    		}else {
	    			System.out.println("Password cannot contain username");
	    		}
	    		
	    	}else {
	    		System.out.println("Password is to short");
	    	}
	    	
	   
	    	
	    }else {
	    	System.out.println("Username and password cannot be empty");
	    	
	    }
	}

}


