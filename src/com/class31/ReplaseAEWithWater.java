package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaseAEWithWater {
	public static void main(String[] args) {
		ArrayList<String> drinks=new ArrayList();
		drinks.add("coffee");
		drinks.add("tea");
		drinks.add("juice");
		drinks.add("wine");
		drinks.add("beer");
		drinks.add("milk");
	System.out.println(drinks);
	
	for(String drink:drinks){

		if(drink.contains("a")|| drink.contains("e")) {
			
			drink="water";
		}
		System.out.print(drink+" ");
	}
	
	}

}
