package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class CarsArrayList {
public static void main(String[] args) {
	ArrayList<String> cars=new ArrayList<String>();
	cars.add("Tayota");
	cars.add(1,"Mazda");
	cars.add(2,"Jeep");
	cars.add(3,"Tesla");
	System.out.println("-----For loop----");
	for (int i=0;i<cars.size();i++) {
		System.out.print(cars.get(i)+" ");
	}
	System.out.println();
	System.out.println("---For each loop-----");
	for (String car:cars) {
		System.out.print(car+" ");
	}
	System.out.println();
	System.out.println("-----Iterator-----");
	Iterator<String> it=cars.iterator();
	//hasNext();next();remove();
	while(it.hasNext()) {
		String car=it.next();
		System.out.print(car+" ");
	}
	System.out.println();
	System.out.println("----While loop-------");
int	y=0;
	while(y<cars.size()) {
		String c=cars.get(y);
		System.out.print(c+" ");
		y++;
	}
}
}
