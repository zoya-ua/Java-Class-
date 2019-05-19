package com.class33;

import java.util.*;


public class MapOfCountries {
	public static void main(String[] args) {
		HashMap<String,String> countries=new HashMap<>();
		 countries.put("Canada", "Ottawa");
		    countries.put("USA", "Washington");
		    countries.put("Latvia", "Riga");
		    countries.put("Estonia", "Tallin");
		    countries.put("Russia", "Moscow");
		    countries.put("France", "Paris");
		 System.out.println(countries);  
		 System.out.println("----for each loop ------");
		 Set <String> keys=countries.keySet();
		 for(String key:keys) {
			 System.out.println(key+" : "+countries.get(key));
		 }
				 
		System.out.println("----using iterator------");
		Iterator <String> itCountries= keys.iterator();
		while(itCountries.hasNext()) {
			String key=itCountries.next();
			System.out.println(key+" : "+countries.get(key));
			
		}
		
	}

}
