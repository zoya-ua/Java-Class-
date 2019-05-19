package com.class33;
import java.util.*;
public class AllKeyswAndValueFromMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		System.out.println(map);
		//returns a set of keys from the map
		Set <Integer> keys=map.keySet();
		//how to print all keys
	     System.out.println("-------Return keys for each loop--------");
		for(Integer key:keys) {
			System.out.print(key+" : "+map.get(key));
		}
		System.out.println();
		//using iterator
		 System.out.println("-------Return keys using iterator--------");
		Iterator<Integer>keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			Integer key=keysIt.next();
			System.out.print(key+" : "+map.get(key));
			
		}
		System.out.println();
		//how to get all values
		Collection <String> values=map.values();
		System.out.println("-------Return values for each loop--------");
		for (String val:values) {
			System.out.print(val+", ");
		}
		System.out.println();
		Iterator <String> itValues=values.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+" ,");
		}
		
		
	}
	

}
