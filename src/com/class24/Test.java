package com.class24;

public class Test {
	public static void main(String[] args) {
		String a;
		a="10";
		
	Parent parent=new Parent();	
		parent.love();
		parent.work();
	Child child=new Child();
	    child.love();
	    child.cry();
	    child.work();
	    
	//type casting   
	Parent obj=new Child();
	obj.work();
	obj.love();
	//obj.cry();-not accesable
	
	//Child obj1=new Parent(); -not passible child class is smaller box then parrent
	}

}
