package com.class8;

public class BreakCondition {
	public static void main(String[] args) {
		//break
		 for (int g=0; g<=4; g++) {
	            System.out.println("Hello");
	            break;
	        }
		
	 
		 //continue
		 
		for (int i=0;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i);
		}
		
	}

}
