package com.class18;

import com.class17.Calculator;

public class Application {
	public static void main(String[] args) {
		int a=2;
		int b=8;
		System.out.println(a+" "+b);
		Calculator calc=new Calculator();
			
		System.out.println(calc.sum(12,4));
		calc.sub(7,9);
		System.out.println(calc.div(45,8));
		calc.mult(6,89);
	}

}
