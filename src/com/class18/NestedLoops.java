package com.class18;

public class NestedLoops {
	public static void main(String []args) {
		int i,y,a;
		a=5;
		
		for (i=0;i<5;i++) {
			for(y=a;y>0;y--){
		System.out.print("*");
			}
		System.out.println();
		a--;
		
		}
		
	}

}
