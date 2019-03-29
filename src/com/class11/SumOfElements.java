package com.class11;

public class SumOfElements {
public static void main(String[] args) {
	int  [] num = {10,3,6,2,45,8,9};
	int sum=0;
	int sum1=0;
	for (int i=0; i<num.length;i++) {
		sum=sum+num[i];
		
	}
	System.out.println("The sum of all elemrnts of array num = "+sum);
	
	for(int s:num) {
		sum1=sum1+s;
	}
	System.out.println("The sum of all elemrnts of array num = "+sum);
}

}
