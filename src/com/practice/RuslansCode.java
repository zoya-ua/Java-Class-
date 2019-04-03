package com.practice;

public class RuslansCode {
public static void main(String[] args) {
	
	
	int i = 0,b,c,a=0;
	do {
	for (a=0;a<10;a++) {
		for (b=0;b<10;b++)
			for(c=0;c<10;c++) {
			i++;
			int abc=100*a+10*b+c;
			if(abc==(a*a*a+b*b*b+c*c*c)){
				System.out.println(abc);
			}
			}
	}
					
	}while (i<=500);
}
}
