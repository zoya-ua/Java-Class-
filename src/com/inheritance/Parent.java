package com.inheritance;

public class Parent {
	Parent(){
		System.out.println("I am from Parent Class");
		
	}
	String reverse(String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);	
		}
		return rev;
		
	}
String reverse(String a, String b) {
	String rev="";
	if(a.length()==b.length()) {
		
		for(int y=b.length()-1;y>=0;y--) {
			rev=rev+a.charAt(y)+b.charAt(y);
		}
		
		
	}else {
		System.out.println("Try different Strings");
	}
	
	return rev;
}
boolean trueOrFalse(boolean b1, boolean b2) {
	boolean flag = false;
	if(b1==b2 && b1==true) {
		flag=false;
	}else if(b1!=b2 && b1==false){
		flag=true;
	}else if(b1!=b2 && b2==false) {
		flag=false;
	}else if(b1==b2 && b1==false){
		flag=true;
	}
	
	return flag;
}

}
