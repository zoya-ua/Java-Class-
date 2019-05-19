package com.class30;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int[]array= {10,10,20,20};
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	numbers.add(12);
	numbers.add(0,13);
	numbers.add(2,14);
	System.out.println(numbers.size());
	System.out.println(numbers.get(1));
	numbers.set(1,33);
	System.out.println(numbers.get(1));
	System.out.println(numbers.contains(33));
	//1.way using for loop
	System.out.println("-------using for loop--------");
	for (int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	}
	//2 way using advanced for loop
	System.out.println("----using for each loop-------");
	for(int num:numbers) {
		System.out.println(num);
	}
	//3 using advanced iterator
	System.out.println("-----using iterator------");
	Iterator<Integer> it=numbers.iterator();
	//hasNext();next();remove();
	while(it.hasNext()) {
		int number=it.next();
		System.out.println(number);
	}
	//4 way using while loop
	System.out.println("----ussing while loop-------");
	int c=0;
	while (numbers.size()>c) {
		int myNum=numbers.get(c);
		System.out.println(myNum);
		c++;
	}
	System.out.println(numbers);
}
}
