package com.InterviewQuestions;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		/*Write a program to swap 2 numbers without a temporary variable? 
		 * Swap  2 strings without a temporary variable?	
		 */
		int n1=7;
		int n2=90;
		System.out.println("N1 = "+n1);
		System.out.println("N2 = "+n2);
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		System.out.println("N1 = "+n1);
		System.out.println("N2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("N1 = "+n1);
		System.out.println("N2 = "+n2);
		
		String str1="Java";
		String str2="Class";
		System.out.println("str1 "+str1);
		System.out.println("str2 "+str2);
		
		str1=str1+str2;
		str2=str1.replaceAll(str2,"");
		str1=str1.replaceAll(str2, "");
		System.out.println("str1"+str1);
		System.out.println("str2 "+str2);
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		System.out.println("str1"+str1);
		System.out.println("str2 "+str2);
		
	}

}
