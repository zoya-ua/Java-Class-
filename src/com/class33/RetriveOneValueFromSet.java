package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValueFromSet {
	public static void main(String[] args) {
		Set<String>cars=new LinkedHashSet<>();
		cars.add("Tayota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("Tesla");
		cars.add("Mazda");
		
	// 1st way we convert to arrayList	
	List<String>list=new ArrayList<>(cars);
	System.out.println("List collection:"+list);
	System.out.println(list.get(2));
	
	List<String>list2=new ArrayList<>();
	list2.addAll(cars);
	list2.add("BMW");
	System.out.println("List2 collection:"+list2);
	
	//2nd way convert to Array
	Object[]array=cars.toArray();
	System.out.println(array[1]);
	
	}

}
