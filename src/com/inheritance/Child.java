package com.inheritance;



public class Child extends Parent {
	/*Child(){
		System.out.println("I am from Child Class");
	
	}*/
	public static void main(String[] args) {
		Child c=new Child();
		//System.out.println(c.reverse("Create Methods"));
		//System.out.println(c.reverse("one","two"));
System.out.println(c.trueOrFalse(true, true));
System.out.println(c.trueOrFalse(false, true));
System.out.println(c.trueOrFalse(true, false));
System.out.println(c.trueOrFalse(false, false));
	}

}
