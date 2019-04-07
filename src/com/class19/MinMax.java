 package com.class19;

public class MinMax {
	
	
	static int  minOfValues(int[]x) {
       int  min=x[0];
		
		for (int y:x) {
			if (y<min) {
				min=y;
			}
			
		}
		return min;
		
	}
	static int maxOfValuees(int[]x) {
		int max=x[0];
		for (int y:x) {
			if(y>max) {
				max=y;	
			}	
		}
		return max;
	}
}

