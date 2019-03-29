package com.JavaReview;

public class StringPractice {
	public static void main(String[] args) {
		 
		String para = "The quick brown fox jumps over the lazy dog.";
		
	        /* Converts all the characters in the string to lower case and prints.
	        * Converts all the characters in the string to upper case and prints.
	        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.*/
       
       System.out.println(para.toLowerCase());
       System.out.println(para.toUpperCase());
       System.out.println(para.startsWith("The"));
       System.out.println(para.endsWith("The"));
       
       //Counts the number of letter 'a' in the string/paragraph and prints.
       
       int count=0;
       for(int i=0;i<para.length();i++) {
    	   if (para.charAt(i)=='a') {
    		   count++;     
    	   }   
       }
       System.out.println(count);
       
       //Prints the second half of the string/paragraph.
       System.out.println(para.substring(para.length()/2));
       //Prints characters between the 10th and 20th indices(inclusive).
       System.out.println(para.substring(10, 20));
       
       //Prints the string/Paragraph in reverse order.
       for (int y=para.length()-1;y>=0;y--) {
    	   System.out.print(para.charAt(y));
    	   
       }
       System.out.println();
       
       //Clears/removes all white spaces or tabs on both ends and prints.
       System.out.println(para.trim());
            
	}

}
