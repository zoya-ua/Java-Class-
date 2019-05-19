package com.class30;

import java.util.ArrayList;


public class Task1 {
	public static void main(String[] args) {
		ArrayList <String> names=new ArrayList <String>();
		names.add("Anna");
		names.add("Jake");
		names.add("Tim");
		names.add("Kate");
		names.add("Max");
		System.out.println("Is ArrayList empty? "+names.isEmpty());
		System.out.println("Is ArrayList cantains Tim? "+names.contains("Tim"));
		System.out.println("Size of an ArrayList is "+names.size());
		
		for (int i=0;i<names.size();i++) {
			System.out.print(names.get(i)+" ");
		}
		System.out.println();
		
		for(String name:names) {
			System.out.print(name+" ");
		}
		
	}

	
}
