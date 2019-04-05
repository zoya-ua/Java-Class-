package com.class17;

public class Numbers {
	/*Create a method that will take 2 parameters as a numbers and prints which number is larger.

Create a method that will take a number and prints whether the number is even or odd.

Create a method that will print whether given String is palindrome or not.
	 * 
	 */
	
	public static void main(String[] args) {
		Numbers obj=new Numbers();
		obj.larger(24, 17);
		obj.evenOdd(100);
		obj.palindrome("dad");
	}
void larger(int a,int b) {
	if(a>b) {
		System.out.println(a+" is larger than "+b);
	}else if(b>a) {
		System.out.println(b+" is larger than " +a);
	}else {
		System.out.println(a+" = "+b);
	}
	
}
void evenOdd(int n ) {
	if (n%2==0) {
		System.out.println(n+" is Even");
	}else {
		System.out.println(n+" is Odd");
	}
}

void palindrome(String str) {
	char[]array =str.toCharArray();
	String reverse="";
	for (int i=str.length()-1;i>=0;i--) {
		reverse=reverse+array[i];
	}
	if (reverse.equalsIgnoreCase(str)) {	
		System.out.println(str+" String is palindromec ");
	}else {
		System.out.println(str+ " String is not palindromic");
	}
	}
	
}
