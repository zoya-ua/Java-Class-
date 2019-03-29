package com.class7;

public class IncrementDecrement {
public static void main(String[] args) {
	int a=10;
	int b=++a;//preincrement = first increment -->assign
		System.out.println(b);
	int c=b++;//postincrement =first assign --> increment
	System.out.println(c);
	  int x=10;
      int y=x;
      System.out.println(x+" "+y);
      // post increment a++;
              
      int p=299;
      int k=p++; //first assign --> increment(int b=a; a=a+1)
      
      System.out.println(p);//300
      System.out.println(k);//299
      
      //post decrement x--;
      
      int z=10;
      int l=z--;
      
      System.out.println(z);//9
      System.out.println(l);//10
		
}
}
