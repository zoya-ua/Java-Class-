package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		
		//let's create an arrayList of integers from 1-10.
		//remove all odds using iterator
		ArrayList<Integer> alist=new ArrayList<>();
//		alist.add(1);
//		alist.add(2);
//		alist.add(3);
		for(int i=1; i<=20; i++) {
			alist.add(i);
		}
		
		System.out.println(alist);
		
		Iterator<Integer> iterator=alist.iterator();
		while(iterator.hasNext()) {
			int number=iterator.next();
			if(number%2!=0) {
				iterator.remove();
			}
		}
		System.out.println(alist);
	}
}
