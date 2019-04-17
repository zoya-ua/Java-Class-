package com.class24;

public class MethodOverloadingStatic {
		/*Create 1 class with a static method that has 3 overloaded forms.
		 *  Then call each overloaded method with specific arguments and observe result.
		 * 
		 */
		
		static void add() {
			System.out.println("0");
			
		}
		static int add(int a, int b) {
			int sum=a+b;
			return sum;
			
		}
		static  void add(int a,double b) {
			double sum=a+b;
			System.out.println(sum);
		}
	public static void main(String[] args) {
		 MethodOverloadingPrivate obj= new MethodOverloadingPrivate();
		add();
		System.out.println(add(20,15));

		add(5,6.7);
		
		
	}
	}



