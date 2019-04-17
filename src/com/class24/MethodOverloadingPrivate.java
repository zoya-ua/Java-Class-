package com.class24;

public class MethodOverloadingPrivate {
	/*Create 1 class with a static method that has 3 overloaded forms.
	 *  Then call each overloaded method with specific arguments and observe result.
	 * 
	 */
	
	private void add() {
		System.out.println("0");
		
	}
	private int add(int a, int b) {
		int sum=a+b;
		return sum;
		
	}
	private  void add(int a,double b) {
		double sum=a+b;
		System.out.println(sum);
	}
public static void main(String[] args) {
	 MethodOverloadingPrivate obj= new MethodOverloadingPrivate();
	obj.add();
	System.out.println(obj.add(20,15));

	obj.add(5,6.7);
	
	
}
}
