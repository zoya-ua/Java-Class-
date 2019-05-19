package com.class29;

public class Registration {
	  private String email;
	    private String userName;
	    private String password;
	    
	    public void printEmail(String email) {
	    	this.email=email;
	        if(email.contains("gmail")) {
	        
	        System.out.println(this.email);}
	        else {
	            System.out.println("its not a gmail");
	        }    
	        
	    }
	    public void userName(String userName) {
	    	this.userName=userName;
	        if(!userName.isEmpty()&& userName.length()>6) { 
	            System.out.println("user name is "+this.userName);
	        }else {
	            System.out.println("wrong credentials");
	        }
	    }

	    public void password(String password) {
	    	this.password=password;
	        if(!(password==this.userName)) {
	            System.out.println("password is "+this.password);
	        }else {
	            System.out.println("try it again");
	        }
	    }

}
