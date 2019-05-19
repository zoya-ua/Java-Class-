package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {
	public static void main(String[] args) {
		Insurance obj=new Car("Geico","Toyota");
		Insurance obj2=new Pet("Kaiser","dog");
		Insurance obj3=new Health("United healthcare");
		
		List<Insurance> inList=new ArrayList<>();
		inList.add(obj);
		inList.add(obj2);
		inList.add(obj3);
		for(int i=0;i<inList.size();i++) {
			System.out.println(inList.get(i).insuranceName);
		}
        Iterator<Insurance>it=inList.iterator();
        while(it.hasNext()) {
            Insurance obj=it.next();
            System.out.println(obj.insuranceName);
        }
    
        for(int i=0;i<alist.size();i++) {
            Insurance obj1=alist.get(i);
        obj1.getQuate();
        obj1.cancelInsurance();
            
        }
	}

}
