package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveE {
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList();
		words.add("phone");
		words.add("car");
		words.add("puzzle");
		words.add("cat");
		words.add("ball");
		System.out.println(words);
		Iterator<String> it =words.iterator();
		while (it.hasNext()) {
			String word=it.next();
			if(word.endsWith("e")) {
			it.remove();	
			}
			
		}
		System.out.println(words);
	}

}
