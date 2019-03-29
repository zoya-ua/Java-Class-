package com.class9;

public class Clock {

	    public static void main(String[] args) {
	    	//24 hours, 60 min
	       
	    
	        for(int hours = 1; hours <= 12; hours++) {
	            
	            for(int minutes = 0; minutes <= 59; minutes++) {
	                
	                for(int seconds = 0; seconds <= 59; seconds++) {
	                    
	                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
	                }
	            }
	        }
	    }

	}
