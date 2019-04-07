package com.class19;

import java.util.Scanner;

public class Calculator {
	
    static  double sum(double x1,double x2,double x3) {
    	double sum =x1+x2+x3;
    	return sum;		
    }
    static double average (double x1,double x2,double x3) {
    double a=(x1+x2+x3)/3	;
    return a;
    }
    static double min (double x1,double x2,double x3) {
    	double min=x1;
    	if (x2<min & x2<x3) {
    		min=x2;
    		
    	}else if(x3<min & x3<x2) {
    		min=x3;
    	}
    	return min;
    }
    static double max (double x1,double x2,double x3) {
    	double max=x1;
    	if (x2>max & x2>x3) {
    		max=x2;
    		
    	}else if(x3>max & x3>x2) {
    		max=x3;
    	}
    	return max;
}
}